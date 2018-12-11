package com.renard.dt3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        int images[] = {R.drawable.chinese, R.drawable.indian, R.drawable.italian};
        v_flipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        // Foreach loop for image slider
        for (int image : images) {
            flipperImages( image );
        }
    }


    // Animation settings for image slider
    public void flipperImages(int image) {
        ImageView imageView = new ImageView( this );
        imageView.setBackgroundResource( image );

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(5000);
        v_flipper.setAutoStart( true );

        //Animation
        v_flipper.setInAnimation( this, android.R.anim.slide_in_left );
        v_flipper.setOutAnimation( this, android.R.anim.slide_out_right );
    }
}
