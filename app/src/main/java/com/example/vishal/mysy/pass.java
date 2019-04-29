package com.example.vishal.mysy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pass extends AppCompatActivity {
    EditText seat,pass1;
    public static  final  String SHRED_PREFS="shredpref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        final EditText seat=(EditText)findViewById(R.id.editText);
        final EditText pass1=(EditText)findViewById(R.id.editText2);
        Button b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp1=getSharedPreferences(SHRED_PREFS,MODE_PRIVATE);
                SharedPreferences.Editor e1=sp1.edit();
                e1.putString("seatno",seat.getText().toString());
                e1.putString("pass",pass1.getText().toString());
                e1.apply();
                Toast.makeText(getApplicationContext(),"saved ",Toast.LENGTH_SHORT).show();
                save();





            }
        });



    }

    public  void save()
    {

        Intent i1 = new Intent(pass.this,second.class);
        startActivity(i1);


    }



}
