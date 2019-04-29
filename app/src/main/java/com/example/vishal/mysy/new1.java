package com.example.vishal.mysy;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class new1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        toolbar.setTitle("MYSY(new application)");
        setSupportActionBar(toolbar);

        WebView web1=(WebView)findViewById(R.id.web);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.setWebViewClient(new WebViewClient());
        web1.loadUrl("https://mysy.guj.nic.in/Frm_Stu_Login.aspx?p=1");


    }

}
