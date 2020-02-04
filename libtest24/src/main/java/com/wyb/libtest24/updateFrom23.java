package com.wyb.libtest24;

import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class updateFrom23 {

    LocationManager locationManager;


    @RequiresPermission(ACCESS_FINE_LOCATION)

    public void test_ACCESS_FINE_LOCATION()
    {
        /************
         * android.permission.ACCESS_FINE_LOCATION
         * android.location.LocationManager.addNmeaListener(android.location.OnNmeaMessageListener)boolean
         * **************/
        GpsStatus.NmeaListener nmeaListener = new GpsStatus.NmeaListener() {
            public void onNmeaReceived(long timestamp, String nmea) {
                //check nmea's checksum
                Log.d("GPS-NMEA", nmea);

            }
        };
        OnNmeaMessageListener onNmeaMessageListener = new OnNmeaMessageListener() {
            @Override
            public void onNmeaMessage(String message, long timestamp) {
                //test
            }
        };
        locationManager.addNmeaListener(onNmeaMessageListener);
//        locationManager.addNmeaListener()
        /**************************/

    }
}
