package com.example.mapbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mapbox.common.MapboxOptions
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapView

class MainActivity : AppCompatActivity() {
    lateinit var mapView : MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapboxOptions.accessToken = "pk.eyJ1Ijoic3QxMDEwMzcwNCIsImEiOiJjbTE5YWJ1cjcwM3UyMmpyMTU4dXoxb2IxIn0.3SGuVJBtoxgfraWYUUqrtQ "
        setContentView(R.layout.activity_main)


        // Create a map programmatically and set the initial camera
        mapView =findViewById(R.id.mapView)
        mapView.mapboxMap.setCamera(
            CameraOptions.Builder()
                .center(Point.fromLngLat(28.218, -25.732))
                .pitch(0.0)
                .zoom(12.0)
                .bearing(180.0)
                .build()
        )
        // Add the map view to the activity (you can also add it to other views as a child)

        Log.v("appdebug",mapView.mapboxMap.cameraState.zoom.toString())

    }
}