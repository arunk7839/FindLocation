package joyee.findlocation;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;



public class MainActivity extends AppCompatActivity implements OnStreetViewPanoramaReadyCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StreetViewPanoramaFragment streetViewPanoramaFragment=(StreetViewPanoramaFragment)getFragmentManager().findFragmentById(R.id.streetViewPanorama);
        streetViewPanoramaFragment.getStreetViewPanoramaAsync(this);

    }
    @Override
    public void onStreetViewPanoramaReady(StreetViewPanorama Panorama) {
        Panorama.setStreetNamesEnabled(false);
        Panorama.setPosition(new LatLng(37.400546,-122.108668));
        StreetViewPanoramaCamera camera= StreetViewPanoramaCamera.builder().bearing(180).build();
        Panorama.animateTo(camera,1000);
    }
}









