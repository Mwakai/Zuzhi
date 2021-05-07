package com.example.zuzhi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class Diet extends AppCompatActivity {

    List<SlideModel>slideModelList;
    List<SlideModel>slideModelList1;
    ImageSlider imageSlider, imageSlider2;
    DrawerLayout drawerLayout;
    FirebaseAuth fAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        fAuth = FirebaseAuth.getInstance();
        imageSlider = findViewById(R.id.image_slider);
        imageSlider2 = findViewById(R.id.image_slider2);
        drawerLayout =findViewById(R.id.drawer_layout);

        addImages();
    }

    public void ClickMenu (View view) {
        openDrawer(drawerLayout);
    }

    private static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void ClickLogo (View view){
        closeDrawer(drawerLayout);
    }

    private static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickHome (View view) {
        recreate();
    }


    public void ClickPrivacy (View view) {
        redirectActivity(this,Privacy.class);
    }

    public void ClickAboutUs (View view){
        redirectActivity(this,AboutUs.class);
    }

    public static void redirectActivity(Activity activity,Class aClass) {
        Intent intent = new Intent(activity,aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    public void ClickLogout (View view) {
        logout(this);
    }

    public void logout(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout ?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(activity, "Signed Out", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }

    void addImages(){
        slideModelList= new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.pancake,ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.githeri,ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.cabbage,ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.spinach,ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.ricemixed,ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModelList, ScaleTypes.FIT);


        slideModelList1= new ArrayList<>();
        slideModelList1.add(new SlideModel(R.drawable.nonvegan,ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.samosa,ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.ugalibeef,ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.chicken,ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.githeri,ScaleTypes.CENTER_CROP));
        imageSlider2.setImageList(slideModelList1, ScaleTypes.FIT);

    }

    public void Vegan(View view) {
        Intent intl = new Intent(Diet.this,Vegan.class);
        startActivity(intl);
    }

    public void nonvegan(View view) {
        Intent intent = new Intent(Diet.this,Non_Vegan.class);
        startActivity(intent);
    }

}
