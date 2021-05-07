package com.example.zuzhi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vlunch extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlunch);

        myDialog = new Dialog(this);
    }

    public void Lmonday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganlunch_monday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);
        btn = (Button) myDialog.findViewById(R.id.btn);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void Ltuesday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganlunch_tuesday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);
        btn = (Button) myDialog.findViewById(R.id.btn);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void Lwednesday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganlunch_wednesday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);
        btn = (Button) myDialog.findViewById(R.id.btn);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void Lthursday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganlunch_thursday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);
        btn = (Button) myDialog.findViewById(R.id.btn);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void Lfriday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganlunch_friday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);
        btn = (Button) myDialog.findViewById(R.id.btn);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void Lsaturday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganlunch_saturday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);
        btn = (Button) myDialog.findViewById(R.id.btn);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void Lsunday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganlunch_sunaday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);
        btn = (Button) myDialog.findViewById(R.id.btn);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

}
