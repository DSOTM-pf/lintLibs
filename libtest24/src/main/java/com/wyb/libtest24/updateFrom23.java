package com.wyb.libtest24;

import android.location.GpsStatus;
import android.location.LocationManager;
import android.util.Log;

public class updateFrom23 {

    LocationManager locationManager;
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

        locationManager.addNmeaListener(nmeaListener);
//        locationManager.addNmeaListener()
        /**************************/

    }
}
