package com.example.vishal.mysy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("MYSY(Form)");
        setSupportActionBar(toolbar);
        String[] list={
                "(1)Self declaration form",
                "(2)Certificate from Institute for new student",
                "(3)Renewal certificate from institute(Gujrati)",
                "(4)Renewal certificate from institute(English)",
                "(5)Self declaration for Non IT return",
                "(6)Income certificate",
                "(7)List of Help Centers for Engineering , Pharmacy and Architecture etc. Courses",
                "(8)List of Help Centers for Higher Education(BA, BCom, B.Sc, BBA, BCA etc)",
                "(9)List of Help Centers for Medical, Dental, Paramedical, Nursing Courses",
                "(10)List of Help Centers for Ayurved and Homeopathy Courses",
                "(11)List of Help Centers for Agriculture,Veterinary,Animal Husbandary and Fisheries etc. courses"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent f1=new Intent(form.this,showform.class);
                    f1.putExtra("id","https://drive.google.com/file/d/1jgdxH-ZW_z9R3ZDOJXSw1rQYUOQb3rvv/view?usp=sharing");
                    startActivity(f1);
                }
                if(position==1)
                {
                    Intent f2=new Intent(form.this,showform.class);
                    f2.putExtra("id","https://drive.google.com/file/d/1C71RTGRZLGm0UzI_9JUGbH5xsHT4BUy_/view?usp=sharing");
                    startActivity(f2);
                }
                if(position==2)
                { Intent f3=new Intent(form.this,showform.class);
                    f3.putExtra("id","https://drive.google.com/file/d/1XvjANtbf-hIUB5m21oGpvkGxA87VIr6s/view?usp=sharing");
                    startActivity(f3);

                }
                if(position==3)
                {
                    Intent f4=new Intent(form.this,showform.class);
                    f4.putExtra("id","https://drive.google.com/file/d/1y9c8pXkHlhvF4r_yI27C_r12gkW-81se/view?usp=sharing");
                    startActivity(f4);

                }
                if(position==4)
                {
                    Intent f5=new Intent(form.this,showform.class);
                    f5.putExtra("id","https://drive.google.com/file/d/1mNyiKaiVKXIBpwCDtGscXIJyf-SSlSHg/view?usp=sharing");
                    startActivity(f5);

                }
                if(position==5)
                {
                    Toast.makeText(getApplicationContext(),"Formate is Not Available",Toast.LENGTH_SHORT).show();
                }
                if(position==6)
                {
                    Intent f7=new Intent(form.this,showform.class);
                    f7.putExtra("id","https://drive.google.com/file/d/1G7mA80K02FyyePwcmwWQoUInwf1cAPVg/view?usp=sharing");
                    startActivity(f7);

                }
                if(position==7)
                {
                    Intent f8=new Intent(form.this,showform.class);
                    f8.putExtra("id","https://drive.google.com/file/d/13FmrNfHUFQy3C8uwlTAKAkub3iNcGzhA/view?usp=sharing");
                    startActivity(f8);

                }
                if(position==8)
                {
                    Intent f9=new Intent(form.this,showform.class);
                    f9.putExtra("id","https://drive.google.com/file/d/17hJcZbhhBdo4e51KNfX86tDVb5zmsFAn/view?usp=sharing");
                    startActivity(f9);

                }
                if(position==9)
                {
                    Intent f10=new Intent(form.this,showform.class);
                    f10.putExtra("id","https://drive.google.com/file/d/1hb6pFsMGN5IZxLj9Ur7TLnWNSfOIppM4/view?usp=sharing");
                    startActivity(f10);

                }
                if(position==10)
                {
                    Intent f11=new Intent(form.this,showform.class);
                    f11.putExtra("id","https://drive.google.com/file/d/1GbUs4BzIZ0UdIC_6h7-MI9hJhuei4q_i/view?usp=sharing");
                    startActivity(f11);

                }

            }
        });


    }

}
