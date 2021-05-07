package com.example.zuzhi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Nonlunch extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonlunch);

        myDialog = new Dialog(this);
    }

    public void Nmonday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonlunch_monday);
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

    public void Ntuesday (View view){
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonlunch_tuesday);
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

    public void Nwednesday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonlunch_wednesday);
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

    public void Nthursday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonlunch_thursday);
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

    public void Nfriday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonlunch_friday);
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

    public void Nsaturday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonlunch_saturday);
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

    public void Nsunday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonlunch_sunday);
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
