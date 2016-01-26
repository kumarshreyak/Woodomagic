package com.mycompany.techmeet;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.support.v7.app.NotificationCompat;

/**
 * Created by Shreyak Kumar on 25-01-2016.
 */
public class NotifyService extends Service {
    NotificationCompat.Builder notification;
    private static final int unique =1000;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        Uri sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);


        Intent intent1 = new Intent(this.getApplicationContext(), InternetOfThings.class);
        PendingIntent pIntent = PendingIntent.getActivity(this.getApplicationContext(), 0, intent1, 0);


        notification.setSmallIcon(R.mipmap.ic_launcher);
        notification.setTicker("An event is about to begin");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Techmeet'16");
        notification.setContentText("IOT , 9pm ,A1 building");
        notification.setContentIntent(pIntent);

        NotificationManager mNM = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        mNM.notify(unique,notification.build());
//        Notification mNotify = new Notification.Builder(this)
//                .setContentTitle("Internet of things")
//                .setContentText("9pm A1 building")
//                .setSmallIcon(R.mipmap.ic_launcher)
//                .setContentIntent(pIntent)
//                .setSound(sound)
//                .build();

//        mNM.notify(unique, mNotify);
    }
}

