package com.example.vishal.mysy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class HelpcenterChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpcenter_choice);


      Button b1=(Button)findViewById(R.id.button17);
      Button b2=(Button)findViewById(R.id.button18);
        Button b3=(Button)findViewById(R.id.button19);
        Button b4=(Button)findViewById(R.id.button20);
        Button b5=(Button)findViewById(R.id.button21);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"Please wait....",Toast.LENGTH_LONG).show();
                Intent i1=new Intent(HelpcenterChoice.this,district_list.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent i2=new Intent(HelpcenterChoice.this,Medical_list.class);
                Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
              startActivity(i2);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(HelpcenterChoice.this,Ayurveda_list.class);
                Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
                startActivity(i3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(HelpcenterChoice.this,Engineering_list.class);
                startActivity(i2);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(HelpcenterChoice.this,Agri_list.class);
                Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
                startActivity(i2);

            }
        });
    }
}
