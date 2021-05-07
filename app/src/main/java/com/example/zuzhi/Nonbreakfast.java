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

public class Nonbreakfast extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonbreakfast);

        myDialog = new Dialog(this);
    }

    public void Monday (View view) {
        TextView txtClose;
        Button btn;
        myDialog.setContentView(R.layout.nonbreak_monday);
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

    public void Tuesday (View view) {
        TextView txtClose;
        myDialog.setContentView(R.layout.nonbreak_tuesday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void Wednesday (View view) {
        TextView txtClose;
        myDialog.setContentView(R.layout.nonbreak_wednesday);
        txtClose= (TextView)myDialog.findViewById(R.id.close);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }

    public void Thursday (View view) {
        TextView txtClose;
        myDialog.setContentView(R.layout.nonbreak_thursday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }

    public void Friday (View view) {
        TextView txtClose;
        myDialog.setContentView(R.layout.nonbreak_friday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }

    public void Saturday (View view) {
        TextView txtClose;
        myDialog.setContentView(R.layout.nonbreak_saturday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }

    public void Sunday (View view) {
        TextView txtClose;
        myDialog.setContentView(R.layout.nonbreak_sunday);
        txtClose = (TextView)myDialog.findViewById(R.id.close);

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }


}
