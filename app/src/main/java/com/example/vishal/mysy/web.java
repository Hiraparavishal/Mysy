package com.example.vishal.mysy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        WebView w1=(WebView)findViewById(R.id.web1);
        w1.getSettings().setJavaScriptEnabled(true);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl("https://mysy.guj.nic.in/");





    }
}
