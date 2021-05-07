package com.example.zuzhi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {
    public static final String TAG = "TAG";
    Button btn_reg, btn;
    EditText txtName,txtEmail,txtPassword, txtPhone;
    ProgressBar progressBar;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);

        txtName = findViewById(R.id.name);
        txtEmail = findViewById(R.id.email);
        txtPassword = findViewById(R.id.password);
        txtPhone = findViewById(R.id.phone);
        btn = findViewById(R.id.login);
        btn_reg = findViewById(R.id.reg_btn);

        progressBar = findViewById(R.id.progressbar);
        fStore = FirebaseFirestore.getInstance();
        fAuth = FirebaseAuth.getInstance();

        if (fAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), Diet.class));
            finish();

        }

        //Create a new user
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = txtName.getText().toString().trim();
                final String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();
                final String phone = txtPhone.getText().toString();

                if (TextUtils.isEmpty(name)) {
                    txtName.setError("Username is required");
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    txtEmail.setError("Email is required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    txtPassword.setError("Password is required");
                    return;
                }

                if (password.length() <6) {
                    txtPassword.setError("Password must be >= 6 characters");
                }

                if (TextUtils.isEmpty(phone)) {
                    txtPhone.setError("Phone Number is required");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Register.this, "User Created", Toast.LENGTH_SHORT).show();
                            userID = fAuth.getCurrentUser().getUid();
                            DocumentReference documentReference = fStore.collection("users").document(userID);
                            Map<String,Object> user = new HashMap<>();
                            user.put("uName", name);
                            user.put("email", email);
                            user.put("phone",phone);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d(TAG, "onSuccess: user Profile is created for"+ userID);
                                    finish();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d(TAG, "onFailure: " + e.toString());
                                }
                            });
                            startActivity(new Intent(getApplicationContext(), Diet.class));
                            finish();
                        }else {
                            Toast.makeText(Register.this, "Error !" + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                            finish();

                        }
                    }
                });
            }
        });

        //Existing user to login activity
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
    }
}
