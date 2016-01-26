package com.mycompany.techmeet;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class SocialMediaAnalysis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_analysis);

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
    }

}
