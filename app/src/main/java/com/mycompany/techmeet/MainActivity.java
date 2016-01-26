package com.mycompany.techmeet;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    //Declaration of pending indent
    private PendingIntent pendingIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fullscreen bitches
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView title = (TextView) findViewById(R.id.textView);
        Button btevent = (Button) findViewById(R.id.button3);
        Button btmap = (Button) findViewById(R.id.button2);
        Button btievent = (Button) findViewById(R.id.button);
        //Applying fonts
        Typeface grand = Typeface.createFromAsset(this.getAssets(),
                "font/GrandHotel-Regular.otf");
        Typeface roboto = Typeface.createFromAsset(this.getAssets(),
                "font/Roboto-Light.ttf");
        title.setTypeface(grand);
        btevent.setTypeface(roboto);
        btievent.setTypeface(roboto);
        btmap.setTypeface(roboto);

        //All the notification bullshit starts here

        Intent myIntent = new Intent(this , NotifyService.class); //Creates a service which is invoke din the future for the notification
        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        pendingIntent = PendingIntent.getService(this, 0, myIntent, 0);

        //Setting time at which notification should be issued
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.SECOND, 3);
        calendar.set(Calendar.MINUTE, 51);
        calendar.set(Calendar.HOUR, 9);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.add(Calendar.DAY_OF_MONTH, 25);

        //Telling the alarm guy to do his job

        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),pendingIntent);


        //Making sure the above lines were not ignored by android
        Toast.makeText(MainActivity.this, "Start Alarm", Toast.LENGTH_LONG).show();
    }



    public void events(View v){
        Intent intent =new Intent(this,Events.class);
        startActivity(intent);
    }


}
