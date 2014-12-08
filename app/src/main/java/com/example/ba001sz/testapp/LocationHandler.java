package com.example.ba001sz.testapp;

/**
 * Created by BA001SZ on 12/3/2014.
 */

import android.location.Location;
import android.os.Bundle;
import android.location.LocationListener;
import android.widget.TextView;

public class LocationHandler implements LocationListener
{
    public void onLocationChanged(Location location) {
        // Called when a new location is found by the network location provider.
        //makeUseOfNewLocation(location);

    }

    public void onStatusChanged(String provider, int status, Bundle extras) {}

    public void onProviderEnabled(String provider) {}

    public void onProviderDisabled(String provider) {}
}
