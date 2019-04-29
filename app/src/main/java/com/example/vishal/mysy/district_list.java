package com.example.vishal.mysy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class district_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_list);

        ListView l1=(ListView)findViewById(R.id.dis_list);
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
                   Ahmedabad.add("Govt. Commerce College, Kubernagar Road,\n" +
                           "Naroda, Ahmedabad");
                   Ahmedabad.add("Gujarat Arts and Science College,\n" +
                           "Eills Bridge,Ahmedabad ");
                   Ahmedabad.add("K.K.Shashtri Govt. Commerce College,\n" +
                           "Khokhra, Maninagar");
                   Ahmedabad.add("Gujarat University, Navrangpura, Ahmedabad");
                   Ahmedabad.add("Nirma University, Opp.S.G.V.P, S.G\n" +
                           "Highway");
                   Ahmedabad.add("R.C.College of Commerce, Delhi Chakala,\n" +
                           "Ahmedabad");
                   Intent i1=new Intent(district_list.this,helpcenter.class);
                   i1.putExtra("list", Ahmedabad);
                   Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                   startActivity(i1);

               }

               if(position==1)
               {
                   ArrayList<String>  Amreli =new ArrayList<>();
                   Amreli.add("Government Arts & Commerce college, Jafrabad");
                   Intent i1=new Intent(district_list.this,helpcenter.class);
                   i1.putExtra("list", Amreli);
                   Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                   startActivity(i1);
               }
                if(position==2)
                {
                    ArrayList<String>  Anand =new ArrayList<>();
                    Anand.add("Charotar University of Science & Technology,\n" +
                            "Changa ");
                    Anand.add("Sardar Patel University,Vallabh\n" +
                            "VidhyanagarVidhyanagar");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Anand);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);

                }
                if(position==3)
                {
                    ArrayList<String>  Aravali =new ArrayList<>();
                    Aravali.add("Government Arts College, Bayad, Aravali");
                    Aravali.add("Government Arts & Commerce college,\n" +
                            "Meghraj");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Aravali);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==4)
                {
                    ArrayList<String>  Banaskantha =new ArrayList<>();
                    Banaskantha.add("Government Arts College, Near MTM\n" +
                            "Institute, Vav");
                    Banaskantha.add("Government Arts & Commerce college, Tharad");
                    Banaskantha.add("G.D.Modi College of Arts, Palanpur");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Banaskantha);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);

                }
                if(position==5)
                {
                    ArrayList<String>  Bharuch =new ArrayList<>();
                    Bharuch.add("Government Arts and Commerce College,\n" +
                            "Netrang , Bharuch ");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Bharuch);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);


                }
                if(position==6)
                {
                    ArrayList<String>  Bhavnagar =new ArrayList<>();
                    Bhavnagar.add("Government Arts College, Nr. Bus Stand,\n" +
                            "Talaja ,Bhavnagar");
                    Bhavnagar.add("Government Arts College, Vallabhipur. ");
                    Bhavnagar.add("Maharaja Krishanakumarsinhji Bhavnagar\n" +
                            "University");
                    Bhavnagar.add("Smt.N.C.Gandhi & B.V. Gandhi Mahila Arts\n" +
                            "and commerce College, Bhavnagar");
                    Bhavnagar.add("L.R.Valiya Arts & Commerce College,\n" +
                            "bhavnagar");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Bhavnagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==7)
                {
                    ArrayList<String>  Botad =new ArrayList<>();
                    Botad.add("Government Arts & Commerce college,Gadhda");
                    Botad.add("Kavishree Botadkar Arts & Commerce\n" +
                            "College, Botad");

                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Botad);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==8)
                { ArrayList<String>  Chhotaudepur =new ArrayList<>();
                    Chhotaudepur.add("Government B.Ed. College, Naswadi,\n" +
                            "Chhotaudepur");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Chhotaudepur);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==9)
                { ArrayList<String>  Dahod  =new ArrayList<>();
                     Dahod.add("Government Arts College, Dhanpur, Dahod ");
                    Dahod.add("Government Science College, Jhalod ");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Dahod );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==10)
                { ArrayList<String>  Dang =new ArrayList<>();
                    Dang.add("Government Arts and commerce College,\n" +
                            "Ahwa , Dang");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Dang);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==11)
                { ArrayList<String>  Devbhumi_Dwarka =new ArrayList<>();
                Devbhumi_Dwarka.add("Government Arts college, Bhanvad");
                    Devbhumi_Dwarka.add("Government Arts College, Jamkalaynpur,\n" +
                            "Ta.Jamkalaynpur");
                    Devbhumi_Dwarka.add("Shree Shardapeeth College, Dwarka");

                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Devbhumi_Dwarka );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==12)
                { ArrayList<String>  Gandhinagar =new ArrayList<>();
                    Gandhinagar.add("Govt. Commerce College, Nr: Mahatma\n" +
                            "Mandir, Sec- 15, Gandhinagar");
                    Gandhinagar.add("Govt. Science College,Sector-15, Gandhinagar");
                    Gandhinagar.add("Kadi Sarva Vishwavidhyalaya, KH-5 Circle,\n" +
                            "Sector-15,Gandhinagar");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Gandhinagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==13)
                { ArrayList<String>  Gir_Somnath =new ArrayList<>();
                     Gir_Somnath.add("Shree Somnath Sanskrit University, Rajendra\n" +
                             "Bhuvan Road,Veraval ");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Gir_Somnath);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==14)
                { ArrayList<String>  Jamnagar =new ArrayList<>();
            Jamnagar.add("D.K.V. Arts and Science College, Pandit\n" +
                    "Nehru Marg, Jamnagar");
            Jamnagar.add("Government Commerce College, Pandit Nehru\n" +
                    "Marg, Jamnagar");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Jamnagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==15)
                { ArrayList<String>  Junagadh  =new ArrayList<>();
Junagadh.add("Bahauddin Arts College, Junagadh-Somnath\n" +
        "Road, Junagadh");
                    Junagadh.add("Bahaudin Science College, Opp. Bhutnath\n" +
                            "temple, College Road, Junagadh");
                    Junagadh.add("Bhakt Kavi Narsinh Mehta University,Bilkha\n" +
                            "Road, Khadiya, Junagadh");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Junagadh );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }


                if(position==16)
                { ArrayList<String>  Kheda =new ArrayList<>();
Kheda.add("Government Arts & Comm. Coll., Kathlal");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Kheda);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==17)
                { ArrayList<String>  Kutchh =new ArrayList<>();
   Kutchh.add("R.R. Lalan College, College Road, Bhuj");
                    Kutchh.add("Governemt Science College, Mandavi");
                    Kutchh.add("Krantiguru Shyamji Krishna Verma\n" +
                            "University, Mundra road Bhu");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Kutchh);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==18)
                { ArrayList<String>  Mehsana =new ArrayList<>();
Mehsana.add("M.N. College, Near Bus Stand, Visnagar");
                    Mehsana.add("Government Science College, Vadnagar");
                    Mehsana.add("Ganpat University, Kherva");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Mehsana);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==19)
                { ArrayList<String>  Morbi =new ArrayList<>();
                Morbi.add("J. A. Patel Mahila College,Morbi");

                Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Morbi);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==20)
                { ArrayList<String>  Narmada =new ArrayList<>();
Narmada.add("Government Arts College, Dediyapada");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Narmada);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==21)
                { ArrayList<String>  Navsari =new ArrayList<>();
Navsari.add("Government Arts & Commerce College,\n" +
        "Vansda");
                    Navsari.add("Governemt Science College, Chikhli, Navsari ");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Navsari);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==22)
                { ArrayList<String>  Panchmahal =new ArrayList<>();
                Panchmahal.add("Government Arts College, Shehra");

                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Panchmahal);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==23)
                { ArrayList<String>  Patan  =new ArrayList<>();
                Patan.add("Govt. Arts & Comm. College, Opp. New Bus\n" +
                        "Stand, Main Bazar, Sami");
                    Patan.add("Hemchandracharya North Gujarat University,\n" +
                            "Patan");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Patan );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==24)
                { ArrayList<String>  Porbandar =new ArrayList<>();
Porbandar.add("Government Arts College, Opp. Government\n" +
        "Hospital,Ranavav");
Porbandar.add("Gurukul Mahila Arts & Commerce College,\n" +
        "Porbandar");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Porbandar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==25)
                { ArrayList<String>  Rajkot  =new ArrayList<>();
Rajkot.add("H. & H. B. Kotak Science College, Jagnath\n" +
        "Plot, Rajkot");
                    Rajkot.add("Dharmendrashinji Arts College, Rajkot");
                    Rajkot.add("Saurashtra University, University road, Rajkot");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Rajkot );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==26)
                { ArrayList<String>  Sabarkantha =new ArrayList<>();
Sabarkantha.add("Government Science College, Idar");
Sabarkantha.add("Government Commerce College, Vadali");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Sabarkantha);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==27)
                { ArrayList<String>  Surat =new ArrayList<>();
                Surat.add("Government Arts & Comm. College, Kachhal,\n" +
                        "Ta.Kachhal");
                    Surat.add("Govt. Arts College, Vankal, Ta. Magrol, Dist.\n" +
                            "Surat");
                    Surat.add("Uka Tarsadia University, Maliba campus,\n" +
                            "Surat-kolkata Road, Surat");
                    Surat.add("Veer Narmad South Gujarat University,\n" +
                            "Udhna-Magdalla Rd.Someshwar Char Rasta,\n" +
                            "Surat");

                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Surat);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==28)
                { ArrayList<String>  Surendranagar =new ArrayList<>();
Surendranagar.add("M.P.Shah Arts and Science College,\n" +
        "Surendranagar");
Surendranagar.add("M.P.Shah Commerce College, Wadhvan ");
                    Surendranagar.add("Government Arts college,Chotila");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Surendranagar);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==29)
                { ArrayList<String>  Tapi  =new ArrayList<>();
Tapi.add("Government Science College,Valod.");
                    Tapi.add("Government Arts & Commerce College,\n" +
                            "Songadh ");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Tapi );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==30)
                { ArrayList<String>  Vadodara  =new ArrayList<>();
Vadodara.add("Department of Hindi, Faculty of Arts,\n" +
        "M.S.University, Pratapgunj, Vadodara");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Vadodara );
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                if(position==31)
                { ArrayList<String>  Valsad =new ArrayList<>();
Valsad.add("Government Arts & Comm. College, Bhilad,\n" +
        "Ta.Umargam");
Valsad.add("Shah N.H.Commerce College, Valsad");
                    Intent i1=new Intent(district_list.this,helpcenter.class);
                    i1.putExtra("list", Valsad);
                    Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }



            }
        });




    }
}
