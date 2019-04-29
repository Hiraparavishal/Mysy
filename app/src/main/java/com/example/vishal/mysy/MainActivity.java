package com.example.vishal.mysy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button b1;
    public static  final  String SHRED_PREFS="shredpref";
    String  value;
    TextView text,textdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ImageView new1=(ImageView)findViewById(R.id.imageView5);
        ImageView renew=(ImageView)findViewById(R.id.imageView2);
        ImageView form=(ImageView)findViewById(R.id.imageView7);
        TextView p1=(TextView)findViewById(R.id.textView3);
        TextView p2=(TextView)findViewById(R.id.textView4);
        ImageView web=(ImageView)findViewById(R.id.imageView9);
        ImageView user=(ImageView)findViewById(R.id.imageView20);
        textdate=(TextView)findViewById(R.id.textView7);
        text=(TextView)findViewById(R.id.textView23);
        ImageView about=(ImageView)findViewById(R.id.imageView18);
        ImageView maps=(ImageView)findViewById(R.id.imageView3);
        final ImageView reward=(ImageView)findViewById(R.id.imageView8);
        final ImageView img1=(ImageView) findViewById(R.id.View1);
        final ImageView pass=(ImageView)findViewById(R.id.imageView19);
        final TextView seat=(TextView)findViewById(R.id.textView20);
        final TextView pass2=(TextView)findViewById(R.id.textView21);
        final TextView t11=(TextView)findViewById(R.id.textView23);
        final ConstraintLayout c1=(ConstraintLayout)findViewById(R.id.splac);
        final GifImageView g1=(GifImageView)findViewById(R.id.gif);


        final SharedPreferences sp1=getSharedPreferences(SHRED_PREFS,MODE_PRIVATE);
        final String password =sp1.getString("pass","");
        final String seatno=sp1.getString("seatno","");
        seat.setText(seatno);


        pass2.setText(password);
        new1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new1();
            }
        });
        renew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                renew();
            }
        });
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                form();
            }
        });
        reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reward();
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent help= new Intent(MainActivity.this,HelpcenterChoice.class );
                startActivity(help);
            }
        });

        final int[] imageArray = { 1, 2,
                3, 4,
        };


        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {

                if(i%2==0)
                {
                    firebase();

                }
                else
                {
                    firebase1();

                }
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 5000);
            }
        };
        handler.postDelayed(runnable, 3000);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o1=new Intent(MainActivity.this,web.class);
                startActivity(o1);
            }
        });


        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u1;
                u1= Uri.parse("tel:7926566000");
                Intent a1=new Intent(Intent.ACTION_VIEW,u1);
                startActivity(a1);

            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri u2;
                u2=Uri.parse("tel:7043333181");
                Intent a2=new Intent(Intent.ACTION_VIEW,u2);
                startActivity(a2);

            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(password.equals("")) {
                    user();

                }else
                {
                    Toast.makeText(getApplicationContext(),"If You Wants to Change Password Then long Press ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        user.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                user();
                return false;
            }
        });



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                g1.setVisibility(View.INVISIBLE);
                img1.setBackgroundResource(R.drawable.back);
            }
        },3000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                firebasedate();
            }
        },5000);




       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }/*end of oncreate methode*/



    public  void new1()
    {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            Intent i1=new Intent(MainActivity.this,new1.class);
            startActivity(i1);

        } else {

            Toast.makeText(getApplicationContext(), "NO INTERNET CONNECTION", Toast.LENGTH_LONG).show();
            connected = false;
        }





    }
    public  void renew()
    {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            Intent i2=new Intent(MainActivity.this,renew.class);
            startActivity(i2);

        } else {
            Toast.makeText(getApplicationContext(), "NO INTERNET CONNECTION", Toast.LENGTH_LONG).show();
            connected = false;


        }




    }
    public  void form()
    {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            Intent i3=new Intent(MainActivity.this,form.class);
            startActivity(i3);

        } else {
            Toast.makeText(getApplicationContext(), "NO INTERNET CONNECTION", Toast.LENGTH_LONG).show();
            connected = false;


        }




    }
    public  void reward()
    {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            Intent i4=new Intent(MainActivity.this,reward.class);
            startActivity(i4);
        } else {
            Toast.makeText(getApplicationContext(), "NO INTERNET CONNECTION", Toast.LENGTH_LONG).show();
            connected = false;

        }




    }
    public  void firebase()
    {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue().toString();
                text.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
            }
        });

    }
    public  void firebase1()
    {


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message1");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue().toString();
                text.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();

            }
        });


    }
    public  void user()
    {
        Intent save=new Intent(MainActivity.this,pass.class);
        startActivity(save);
    }
    public void firebasedate()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("date");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue().toString();
                textdate.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();

            }
        });
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
