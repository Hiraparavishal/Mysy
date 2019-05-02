package com.example.vishal.mysy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Agri_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri_list);
        /*Anand Agriculture Univercity,hadgood,aau campus,anand
        S.D.Agriculture univercity Dantiwada,Banaskantha
        Kamdhenu university,karmayogibhavan,Block-1,b1 wing, sectore10a,gandhinagar
        junagadh agricultural univercity,junagadh
        navsari Agriculture univercity,dandi road,navsari
        polytechnic in animal husbandary,ku,mehtapura,himmatnagar
        govt.akhandanand ayurveda colege,bhadra rd,bhadra*/

        ArrayList<String> list=new ArrayList<>();

        list.add("Anand Agriculture Univercity,hadgood,aau campus,anand");
        list.add("S.D.Agriculture univercity Dantiwada,Banaskantha");
        list.add("Kamdhenu university,karmayogibhavan,Block-1,b1 wing, sectore10a,gandhinagar");
        list.add("junagadh agricultural univercity,junagadh");
        list.add("navsari Agriculture univercity,dandi road,navsari");
        list.add("polytechnic in animal husbandary,ku,mehtapura,himmatnagar");
        list.add("govt.akhandanand ayurveda colege,bhadra rd,bhadra");

        Intent i1=new Intent(Agri_list.this,helpcenter.class);
        i1.putExtra("list",list);
        startActivity(i1);
        finish();


    }
}
