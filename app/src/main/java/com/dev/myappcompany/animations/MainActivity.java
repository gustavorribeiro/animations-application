package com.dev.myappcompany.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        Log.i("Info", "Imageview tapped");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        bartImageView.animate().alpha(0).setDuration(2000);

        homerImageView.animate().alpha(1).setDuration(2000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
