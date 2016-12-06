package com.example.jorge.uf2pac1;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    public TextView songName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the layout of the Activity
        setContentView(R.layout.activity_main);

        //initialize views
        initializeViews();
    }

    public void initializeViews() {
        songName = (TextView) findViewById(R.id.songName);
        mediaPlayer = MediaPlayer.create(this, R.raw.lust_for_life);
        songName.setText("Lust_For_Life.mp3");

    }

    // play mp3 song
    public void play(View view) {
        mediaPlayer.start();

    }

    // pause mp3 song
    public void pause(View view) {
        mediaPlayer.pause();
    }


}
