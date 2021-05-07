package com.example.zuzhi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Vegan extends AppCompatActivity {

    List<SlideModel> slideModelList;
    List<SlideModel> slideModelList1;
    List<SlideModel> slideModelList2;
    ImageSlider imageSlider, imageslider1 , imageSlider2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegan);

        imageSlider = findViewById(R.id.image_slider);
        imageslider1 = findViewById(R.id.image_slider1);
        imageSlider2 = findViewById(R.id.image_slider2);

        addImages();
    }

    void addImages() {

        slideModelList= new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.sandwich, ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.bbread,ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.mkate,ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.pancake,ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.ricemixed,ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModelList, ScaleTypes.FIT);

        slideModelList1= new ArrayList<>();
        slideModelList1.add(new SlideModel(R.drawable.pasta, ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.githeri,ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.njahi,ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.spinach,ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.vegetables,ScaleTypes.CENTER_CROP));
        imageslider1.setImageList(slideModelList1, ScaleTypes.FIT);

        slideModelList2= new ArrayList<>();
        slideModelList2.add(new SlideModel(R.drawable.ndengu, ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.garlicndengu,ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.ricemixed,ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.spinach,ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.ugali,ScaleTypes.CENTER_CROP));
        imageSlider2.setImageList(slideModelList2, ScaleTypes.FIT);

    }

    public void lunch(View view) {
        Intent intent = new Intent(Vegan.this,Vlunch.class);
        startActivity(intent);
    }

    public void dinner(View view) {
        Intent intent = new Intent(Vegan.this,Vdinner.class);
        startActivity(intent);
    }

    public void breakfast(View view) {
        Intent intent = new Intent(Vegan.this, Vbreakfast.class);
        startActivity(intent);
    }


}
