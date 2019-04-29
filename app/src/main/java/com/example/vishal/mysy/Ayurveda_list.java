package com.example.vishal.mysy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Ayurveda_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayurveda_list);
        /*1
Ahmedabad Akhandanand Ayurvedic College, Ahmedabad
2
Junagadh Govt. Ayurved College, Junagadh
3
Bhavnagar Sheth JP Govt. Ayurved College, Bhavnagar
4
Jamnagar Shri Gulabkuvarba Ayurved Mahavidhyala Gujrat Ayurved University,
Jamnagar
5
Surat Shri O H Nazar Ayurved College, Surat
6
Vadodara Govt. Ayurved College Panigate, Vadodara*/

        ArrayList<String> list=new ArrayList<>();
        list.add("Akhandanand Ayurvedic College, Ahmedabad");
        list.add("Sheth JP Govt. Ayurved College, Bhavnagar");
        list.add("Shri Gulabkuvarba Ayurved Mahavidhyala Gujrat Ayurved University,\n" +
                "Jamnagar");
        list.add("Shri O H Nazar Ayurved College, Surat");
        list.add("Govt. Ayurved College Panigate, Vadodara");

        Intent i1=new Intent(Ayurveda_list.this,helpcenter.class);
        i1.putExtra("list",list);
        startActivity(i1);
        finish();

    }
}
