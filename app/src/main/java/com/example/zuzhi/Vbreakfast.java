package com.example.zuzhi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Vbreakfast extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vbreakfast);

        myDialog = new Dialog(this);

    }

    public void Vmonday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganbreak_monday);
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

    public void Vtuesday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganbreak_tuesday);
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

    public void Vwednesday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganbreak_wednesday);
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

    public void Vthursday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganbreak_thursday);
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

    public void Vfriday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganbreak_friday);
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

    public void Vsaturday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganbreak_saturday);
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

    public void Vsunday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.veganbreak_sunday);
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
