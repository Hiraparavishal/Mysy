package com.example.vishal.mysy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class showform extends AppCompatActivity {
   Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showform);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Intent f1=getIntent();
        String url = f1.getStringExtra("id");
        uri=Uri.parse(url);
        Intent e1=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(e1);
        finish();
    }
}
