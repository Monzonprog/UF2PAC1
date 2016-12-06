package com.example.jorge.uf2pac1;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    public TextView nombre;
    private AnimationDrawable animacionRepro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (TextView) findViewById(R.id.nombre);
        mediaPlayer = MediaPlayer.create(this, R.raw.lust_for_life);
        nombre.setText("Lust For Life");

        ImageView animacionRepro = (ImageView) findViewById(R.id.animacionView);
        animacionRepro.setBackgroundResource(R.drawable.animacion);

    }


    // Función para iniciar la reproducción
    public void play(View view) {
        mediaPlayer.start();
        animacionRepro.start();
    }

    // Función para pausar la reproducción
    public void pause(View view) {
        mediaPlayer.pause();
        animacionRepro.stop();

    }


}
