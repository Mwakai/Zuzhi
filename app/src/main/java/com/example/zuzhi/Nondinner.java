package com.example.zuzhi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Nondinner extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nondinner);

        myDialog = new  Dialog(this);
    }

    public void Dmonady (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nondinner_monday);
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

    public void Dtuesday (View view){
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nondinner_tuesday);
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

    public void Dwednesday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nondinner_wednesday);
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

    public void Dthursday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nondinner_thursday);
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

    public void Dfriday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nondinner_friday);
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

    public void Dsaturday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nondinner_saturday);
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

    public void Dsunday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nondinner_sunday);
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
