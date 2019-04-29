package com.example.vishal.mysy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Engineering_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_list);
        ListView l1=(ListView)findViewById(R.id.list1);
        ArrayList<String> district=new ArrayList<>();
        district.add("(1)Ahmedabad");district.add("(2)Amreli");district.add("(3)Anand");district.add("(4)Aravali ");district.add("(5)Banaskantha");
        district.add("(6)Bharuch");district.add("(7)Bhavnagar");district.add("(8)Botad");district.add("(9)Chhotaudepur");district.add("(10)Dahod");
        district.add("(11)Dang ");district.add("(12)Devbhumi Dwarka ");district.add("(13)Gandhinagar");district.add("(14)Gir-Somnath");district.add("(15)Jamnagar");
        district.add("(16)Junagadh ");district.add("(17)Kheda");district.add("(18)Kutchh");district.add("(19)Mehsana");district.add("(20)Morbi");
        district.add("(21)Narmada ");district.add("(22)Navsari");district.add("(23)Panchmahal ");district.add("(24)Patan");district.add("(25)Porbandar");
        district.add("(26)Rajkot");district.add("(27)Sabarkantha ");district.add("(28)Surat");district.add("(29)Surendranagar");district.add("(30)Tapi");
        district.add("(31)Vadodara ");district.add("(32)Valsad");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,district);
        l1.setAdapter(adapter);


        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    ArrayList<String> Ahmedabad=new ArrayList<>();
                    Ahmedabad.add("R.C.Tech. Inst., Opp. Gujarat High\n" +
                            "Court, S.G.Highway, Ahmedabad. ");
                    Ahmedabad.add("ovt. Polytechnic, Near Panjrapole,\n" +
                            "Ambavadi,Ahmedabad.");
                    Ahmedabad.add("L.D.College Of Engineering, Opp.\n" +
                            "Gujarat University,Ahmedabad");
                    Ahmedabad.add("Vishwakarma Government Engineering\n" +
                            "College, Chandkheda");
                    Ahmedabad.add("Government Polytechnic for Girls,\n" +
                            "Navrangpura,Ahmedabad");
                    Ahmedabad.add("L.M.College of Pharmacy, Navrangpura ");
                    Ahmedabad.add("CEPT University, Navragpura");
                    Ahmedabad.add("Gujarat Technological University,\n" +
                            "Chandkheda ");
                    Ahmedabad.add("Ahmedabad University, Navrangpura");
                    Ahmedabad.add("Nirma University, Opp.S.G.V.P, S.G\n" +
                            "Highway,Ahmedabad");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Ahmedabad);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);

                }

                if(position==1)
                {
                    ArrayList<String>  Amreli =new ArrayList<>();
                    Amreli.add("Dr.J.N.Maheta Government Polytechnic,\n" +
                            "Bhavnagar Road, Amreli");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Amreli);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==2)
                {
                    ArrayList<String>  Anand =new ArrayList<>();
                    Anand.add("A.R.College of Pharmacy, V.V.Nagar");
                    Anand.add("M.N.College of Pharmacy, Khambhat ");
                    Anand.add("Charotar University of Science &\n" +
                            "Technology, Changa ");
                    Anand.add("B & B Institute of Technology, Vallabh\n" +
                            "Vidhyanagar");
                    Anand.add("Birla Vishvakarma Maha Vidhyalaya,\n" +
                            "Vallabh Vidyanagar");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Anand);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);

                }
                if(position==3)
                {
                    ArrayList<String>  Aravali =new ArrayList<>();
                    Aravali.add("B.M.Shah College of Pharmacy, Modasa");
                    Aravali.add("Government Engineering\n" +
                            "College,,Shamalaji Road, Modasa");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Aravali);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==4)
                {
                    ArrayList<String>  Banaskantha =new ArrayList<>();
                    Banaskantha.add("Government Engg. College, At: Jagana ,\n" +
                            "Palanpur");
                    Banaskantha.add("Government Polytechnic, Opp. Malan\n" +
                            "Gate, Ambaji Road, Palanpur.");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Banaskantha);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);

                }
                if(position==5)
                {
                    ArrayList<String>  Bharuch =new ArrayList<>();
                    Bharuch.add("Government Engineering College, Opp.\n" +
                            "Bholav Guest House, Bharuch.");
                    Bharuch.add("Shri K.J.Polytechnic, Old National\n" +
                            "Highway, Bholav, Bharuch");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Bharuch);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);


                }
                if(position==6)
                {
                    ArrayList<String>  Bhavnagar =new ArrayList<>();
                    Bhavnagar.add("Government Engineering College, Near\n" +
                            "BPTI , Vidyanagar, Bhavnagar");
                    Bhavnagar.add("Shantilal Shah Engineering College,\n" +
                            "Sidsar Campus, P.O.Vartej, Bhavnagar.");
                    Bhavnagar.add("Sir Bhavsinhji Polytechnic Institute,\n" +
                            "Vidhyanagar, Bhavnagar");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Bhavnagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==7)
                {
                    Toast.makeText(getApplicationContext(),"No Helpcenter Found..",Toast.LENGTH_LONG).show();

                }
                if(position==8)
                { ArrayList<String>  Chhotaudepur =new ArrayList<>();
                    Chhotaudepur.add("Government Polytechnic, Old Palace,\n" +
                            "Fatepur, Chhota Udepur");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Chhotaudepur);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==9)
                { ArrayList<String>  Dahod  =new ArrayList<>();
                    Dahod.add(" Government Engineering College, Zalod\n" +
                            "Road, Dahod");
                    Dahod.add(" Government Polytechnic, Dahod, Zalod\n" +
                            "Road, Dahod ");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Dahod );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==10)
                { ArrayList<String>  Dang =new ArrayList<>();
                    Dang.add("Goverment Polytechnic, Rajendrapur\n" +
                            "Village, Waghai ");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Dang);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==11)
                {
                    Toast.makeText(getApplicationContext(),"No Helpcenter Found..",Toast.LENGTH_LONG).show();
                }
                if(position==12)
                { ArrayList<String>  Gandhinagar =new ArrayList<>();
                    Gandhinagar.add("Govt. Polytechnic, K-6, GIDC\n" +
                            "Electronics Estate,Sec-26,Gandhinagar");
                    Gandhinagar.add("Govt. Engineering College, Sec-28, Nr\n" +
                            "Pasu Jaivik Sanstha, Gandhinagar");
                    Gandhinagar.add("Indus University, Villege Rancharda,\n" +
                            " Ta: Kalol");
                    Gandhinagar.add("Dhirubhai Ambani Institute of Info.\n" +
                            "Com. & Tech(DA-IICT), Gandhinagar");
                    Gandhinagar.add("Pandit Deendayal Petroleum University,\n" +
                            "Koba road, Raysan, Gandhinagar");
                    Gandhinagar.add("Kadi Sarva Vishwavidhyalaya, KH-5\n" +
                            "Circle, Sector-15,Gandhinagar");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Gandhinagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==13)
                {
                    Toast.makeText(getApplicationContext(),"No Helpcenter Found..",Toast.LENGTH_LONG).show();
                }
                if(position==14)
                { ArrayList<String>  Jamnagar =new ArrayList<>();
                    Jamnagar.add("Government Polytechnic, Valsura Road,\n" +
                            "Po: Bedi, Jamnagar");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Jamnagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==15)
                { ArrayList<String>  Junagadh  =new ArrayList<>();
                    Junagadh.add("Government Polytechnic, Junagadh\n" +
                            ",Technical School Campus");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Junagadh );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }


                if(position==16)
                { ArrayList<String>  Kheda =new ArrayList<>();
                    Kheda.add("Government Polytechnic, P. N. Tech.\n" +
                            "High School Campus.Kapadvanj");
                    Kheda.add("Dharmsinh Desai Institute of\n" +
                            "Technology, College Road, Nadiad");
                    Kheda.add("Dharmsinh Desai University, Nadiad");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Kheda);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==17)
                { ArrayList<String>  Kutchh =new ArrayList<>();
                    Kutchh.add("Tolani Pharmacy College, Adipur ");
                    Kutchh.add("Govt. Engg.College, Ravalwadi\n" +
                            "Relocation Site, Mirzapar Road, Bhuj. ");
                    Kutchh.add("T. F. Gandhidham Polytechnic, Adipur");
                    Kutchh.add("Government Polytechnic, Opp. Hill\n" +
                            "Garden, Airport Road, Bhuj ");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Kutchh);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==18)
                { ArrayList<String>  Mehsana =new ArrayList<>();
                    Mehsana.add("Government Polytechnic, B/H S. T\n" +
                            "Workshop, Vadnagar");
                    Mehsana.add("Ganpat University, Kherva ");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Mehsana);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==19)
                { ArrayList<String>  Morbi =new ArrayList<>();
                    Morbi.add("L. E. College (Degree) , Morbi");
                    Morbi.add("L. E. College (Diploma) Morbi");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Morbi);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==20)
                { ArrayList<String>  Narmada =new ArrayList<>();
                    Narmada.add("Government Polytechnic, Rajpipala,\n" +
                            "K.J.Polytechnic Campus, Bharuch.");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Narmada);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==21)
                { ArrayList<String>  Navsari =new ArrayList<>();
                    Navsari.add("Government Polytechnic, Navsari C/O,\n" +
                            "Sir Humi Mehta Tech. High School");
                    Navsari.add(" GIDC Degree Engineering College,\n" +
                            "Abrama, Navsari");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Navsari);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==22)
                { ArrayList<String>  Panchmahal =new ArrayList<>();
                    Panchmahal.add("Govt. Engg. College, Godhra Village\n" +
                            "Nasirpur, Po. Govindi, Godhra");
                    Panchmahal.add("Govt. Polytechnic, Nr Civil Hospital,\n" +
                            "Telang School Compound, Godhra");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Panchmahal);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==23)
                { ArrayList<String>  Patan  =new ArrayList<>();
                    Patan.add("K. D. Polytechnic, Opp. T.B.Hospital,\n" +
                            "HNGU Road, Patan");
                    Patan.add("Government Engineering College, Patan\n" +
                            "At & Post- Katpur, Patan");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Patan );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==24)
                { ArrayList<String>  Porbandar =new ArrayList<>();
                    Porbandar.add("Government Polytechnic, Near Air Port,\n" +
                            "Porbandar");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Porbandar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==25)
                { ArrayList<String>  Rajkot  =new ArrayList<>();
                    Rajkot.add("A.V. Parekh Technical Institute, Dr.\n" +
                            "Yagnik Rd, Rajkot");
                    Rajkot.add("Government Polytechnic, Nr. Aji Dam,\n" +
                            "Bhavnagar Rd");
                    Rajkot.add("Govt. Engineering College, Rajkot\n" +
                            "Mavdi-Kankot Road, Vi: Kankot");
                    Rajkot.add("B.K.Mody Govt. Pharmacy College");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Rajkot );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==26)
                { ArrayList<String>  Sabarkantha =new ArrayList<>();
                    Sabarkantha.add("Government Polytechnic, N.H. No.8,\n" +
                            "Motipura, Himatnagar");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Sabarkantha);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==27)
                { ArrayList<String>  Surat =new ArrayList<>();
                    Surat.add("Dr.S. & S.S.Sandhi College of Engg. &\n" +
                            "Technology, Majura Gate, Surat");
                    Surat.add("Government Engg College, Ring Road,\n" +
                            "Majura Gate,surat");
                    Surat.add("Govt. Polytechnic for Girls, Surat");
                    Surat.add("Dr. Dayaram Patel Pharmacy College,\n" +
                            "Bardoli");
                    Surat.add("Uka Tarsadia University, Maliba campus, Surat-kolkata Road, Surat");
                    Surat.add("Sardar Vallabhabhai National University\n" +
                            "of Technology (SVNIT), Surat");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Surat);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==28)
                { ArrayList<String>  Surendranagar =new ArrayList<>();
                    Surendranagar.add("C.U.Shah Polytechnic, Nr. Boda Talav,\n" +
                            "GIDC Road, Wadhwan");
                    Surendranagar.add("C.U.Shah University, Kothariya,\n" +
                            "Wadhwan, Surendranagar");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Surendranagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==29)
                { ArrayList<String>  Tapi  =new ArrayList<>();
                    Tapi.add("Government Polytechnic, Mali Vad,\n" +
                            "Vyara, Govt. Tech.Institute");

                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Tapi );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==30)
                { ArrayList<String>  Vadodara  =new ArrayList<>();
                    Vadodara.add("Faculty of Tech. & Engg., The M. S.\n" +
                            "University, Kalabahvan, Vadodara");
                    Vadodara.add("Polytechnic, M. S. Uni, Near Shastri\n" +
                            "Bridge, Fatehgunj, Vadodara");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Vadodara );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==31)
                { ArrayList<String>  Valsad =new ArrayList<>();
                    Valsad.add("Govt, Engg College, Nr. B. K. M.\n" +
                            "Sci.College, Tithal Road, Valsad");
                    Valsad.add("Government Polytechnic, Kosamba\n" +
                            "Road, Valsad");
                    Intent i1=new Intent(Engineering_list.this,helpcenter.class);
                    i1.putExtra("list", Valsad);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }



            }
        });


    }
}
