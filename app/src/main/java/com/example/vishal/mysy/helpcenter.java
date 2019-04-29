package com.example.vishal.mysy;

import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

public class helpcenter extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpcenter);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;
            int i = 0;
            ArrayList<String> list = (ArrayList<String>) getIntent().getSerializableExtra("list");
            int listSize = list.size();
            for (i = 0; i < listSize; i++) {

                Geocoder coder = new Geocoder(this);
                String locationName = list.get(i);
                Geocoder gc = new Geocoder(this);
                List<Address> addressList = null;
                try {
                    addressList = coder.getFromLocationName(locationName, 1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Address location = addressList.get(0);
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                LatLng helpcenter = new LatLng(latitude, longitude);
                googleMap.addMarker(new MarkerOptions().position(helpcenter)
                        .title(list.get(i)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(helpcenter, 6f));


            }
    }
}