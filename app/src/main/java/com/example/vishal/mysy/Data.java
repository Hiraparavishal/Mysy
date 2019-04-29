package com.example.vishal.mysy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.jar.Attributes;

import static com.example.vishal.mysy.pass.SHRED_PREFS;

public class Data extends AppCompatActivity {

    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button b1=(Button)findViewById(R.id.submit);
        final EditText er =(EditText)findViewById(R.id.erno);
        final EditText Name =(EditText)findViewById(R.id.name);
        final EditText Email =(EditText)findViewById(R.id.email);
        final EditText Mo=(EditText)findViewById(R.id.mo);

        final SharedPreferences sp2=getSharedPreferences(SHRED_PREFS,MODE_PRIVATE);
        final String YES =sp2.getString("YES","");

        if(YES.equals("YES"))
        {
            Intent i=new Intent(Data.this,second.class);
            startActivity(i);
            finish();
        }



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {


                    String erno=er.getText().toString();
                    String  name=Name.getText().toString();
                    String email=Email.getText().toString();
                    String mo=Mo.getText().toString();

                    if(!erno.equals("") && !name.equals("") && !email.equals("") && !mo.equals(""))
                    {
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference();


                        SharedPreferences sp2=getSharedPreferences(SHRED_PREFS,MODE_PRIVATE);
                        SharedPreferences.Editor e2=sp2.edit();
                        e2.putString("YES","YES");
                        e2.apply();
                        Intent i1=new Intent(Data.this,second.class);
                        startActivity(i1);
                        finish();


                    }else
                    {
                        Toast.makeText(getApplicationContext(),"please Fill all Field ",Toast.LENGTH_SHORT).show();

                    }



                } else {

                    Toast.makeText(getApplicationContext(), "NO INTERNET CONNECTION", Toast.LENGTH_LONG).show();
                    connected = false;
                }








            }
        });

    }

}
