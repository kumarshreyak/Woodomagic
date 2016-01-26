package com.mycompany.techmeet;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;


public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        //Fullscreen bitches
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView title = (TextView) findViewById(R.id.textView2);
        //Applying fonts
        Typeface grand = Typeface.createFromAsset(this.getAssets(),
                "font/GrandHotel-Regular.otf");
        title.setTypeface(grand);
    }


    public void iot(View view){
        Intent i = new Intent(this,InternetOfThings.class);
        startActivity(i);
    }
    public void pd(View view){
        Intent i = new Intent(this,PortfolioDefender.class);
        startActivity(i);
    }
    public void pe(View view){
        Intent i = new Intent(this,ProductExhibition.class);
        startActivity(i);
    }
    public void sma(View view){
        Intent i = new Intent(this,SocialMediaAnalysis.class);
        startActivity(i);
    }
    public void hm(View view){
        Intent i = new Intent(this,HardwareModelling.class);
        startActivity(i);
    }
    public void tq(View view){
        Intent i = new Intent(this,TechQuiz.class);
        startActivity(i);
    }
    public void sd(View view){
        Intent i = new Intent(this,SoftwareDevelopment.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_events, menu);
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
}
