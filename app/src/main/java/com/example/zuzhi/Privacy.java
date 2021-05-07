package com.example.zuzhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Privacy extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        webview = findViewById(R.id.privacy);

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String path = "file:android_asset/";
        String name = "privacy.html";
        String file = path+name;
        webview.loadUrl(file);


    }
}
