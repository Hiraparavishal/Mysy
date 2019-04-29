package com.example.vishal.mysy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Medical_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_list);

        /*Ahmedabad B. J. Medical College, New,Civil Hosp. Campus, Asarwa Ahmedabad
2 Ahmedabad GMERS Govt. Medical College,Sola
3 Ahmedabad Gujarat University,Navaragpura,Ahmedabd
4 Anand Sardar Patel University,Vallabh Vidhiyanagar
5 Bhavnagar Government Medical College,Nera S.T.Bus Station,Bhavnagar
6 Bhavnagar Maharaja Krishnakumarshinji,Bhavnagar University
7 Gandhinagar GMERS Medical College,Civil Hospital Campus,Gandhinagar
8 Jamnagar M.P.Shah Medical College,Pandit Nehru Marag,Jamnagar
9 Jamnagar Gujarat Ayurved University, Bedi Bhandar Road,jamnagar
10 Kheda Dharmsinh Desai University,Nadiad
11 Kutchh Krantiguru Shaymji Krishna Verma University,Mudra Road Bhuj
12 Junagadh GMERS Govt.Medical College,
13 Patan GMERS Govt.Medical College,Dharpur,Patan
14 Patan Hemchandracharya North Gujarat University,Patan
15 Rajkot P.D.P.U Medical College,Civil Hospital Campus,Asadar,Rajkot
16 Rajkot Saurashtra University,University Road,Rajkot
17 Sabarkantha GMERS.Medical College.Himatnagar
18 Surendranagar C.U.Shah University,Kothariya,Wadhawan,Surendranagar
19 Surat Student Section, Govt.Medical College, New Civil Hospital Campus,Majura
gate,Surat
20 Surat Veer Narmad South Gujarat University,Udhna-Magdalla Rd.Someshwar
Char Rasta,Surat
21 Vadodara Govt.Medical College,Vinoba Bhave Road,Anandpura,Vadodara
22 Vadodara GMERS Medical College,Gotri,Vadodara
23 Vadodara Department Of Hindi,Faculty of Arts,M.S.University,Pratapgunj,Vadodara
24 Valsad GMRES Medical College,Halar Road,Nanakwada,Valsad*/

        ArrayList<String> list=new ArrayList<>();
        list.add("B. J. Medical College, New,Civil Hosp. Campus, Asarwa Ahmedabad");
        list.add("GMERS Govt. Medical College,Sola");
        list.add("Gujarat University,Navaragpura,Ahmedabd");
        list.add("Sardar Patel University,Vallabh Vidhiyanagar");
        list.add("Government Medical College,Nera S.T.Bus Station,Bhavnagar");
        list.add("Maharaja Krishnakumarshinji,Bhavnagar University");
        list.add("GMERS Medical College,Civil Hospital Campus,Gandhinagar");
        list.add("M.P.Shah Medical College,Pandit Nehru Marag,Jamnagar");
        list.add("Gujarat Ayurved University, Bedi Bhandar Road,jamnagar");
        list.add("Dharmsinh Desai University,Nadiad");
        list.add("Krantiguru Shaymji Krishna Verma University,Mudra Road Bhuj");
        list.add("GMERS Govt.Medical College,junagadh");
        list.add("GMERS Govt.Medical College,Dharpur,Patan");
        list.add("Hemchandracharya North Gujarat University,Patan");
        list.add("P.D.P.U Medical College,Civil Hospital Campus,Asadar,Rajkot");
        list.add("Saurashtra University,University Road,Rajkot");
        list.add("GMERS.Medical College.Himatnagar");
        list.add("C.U.Shah University,Kothariya,Wadhawan,Surendranagar");
        list.add("Govt.Medical College, New Civil Hospital Campus,Majura\n" +
                "gate,Surat");
        list.add(" Veer Narmad South Gujarat University,Udhna-Magdalla Rd.Someshwar\n" +
                "Char Rasta,Surat");
        list.add("Govt.Medical College,Vinoba Bhave Road,Anandpura,Vadodara");
        list.add("GMERS Medical College,Gotri,Vadodara");
        list.add("Department Of Hindi,Faculty of Arts,M.S.University,Pratapgunj,Vadodara");
        list.add("GMRES Medical College,Halar Road,Nanakwada,Valsad");

        Intent i1=new Intent(Medical_list.this,helpcenter.class);
        i1.putExtra("list",list);
        startActivity(i1);
        finish();






    }
}
