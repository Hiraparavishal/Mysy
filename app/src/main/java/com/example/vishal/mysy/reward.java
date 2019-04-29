package com.example.vishal.mysy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.content.Intent.ACTION_VIEW;

public class reward extends AppCompatActivity {

    Uri u1;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("MYSY(Scholarship Details)");
        setSupportActionBar(toolbar);
        u1=Uri.parse("https://drive.google.com/file/d/1Bd6DoR3zz-7CLiM97H_B041rCVstdirm/view?usp=sharing");
        intent = new Intent(Intent.ACTION_VIEW,u1);
        startActivity(intent);
        finish();



    }

}
