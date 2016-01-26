package com.mycompany.techmeet;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class InternetOfThings extends AppCompatActivity {

//    NotificationCompat.Builder notification ;
//    private static final int unique = 24016;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_of_things);

        //Fullscreen bitches
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView title = (TextView)findViewById(R.id.textView3);
        TextView text = (TextView)findViewById(R.id.textView4);

        //Applying fonts
        Typeface grand = Typeface.createFromAsset(this.getAssets(),
                "font/GrandHotel-Regular.otf");
        Typeface roboto = Typeface.createFromAsset(this.getAssets(),
                "font/Roboto-Light.ttf");
        title.setTypeface(grand);
        text.setTypeface(roboto);


//        notification = new NotificationCompat.Builder(this);
//        notification.setAutoCancel(true);
    }





}
