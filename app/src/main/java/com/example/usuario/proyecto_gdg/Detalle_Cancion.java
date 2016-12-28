package com.example.usuario.proyecto_gdg;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle_Cancion extends AppCompatActivity  {
    private TextView tv_nombre, tv_posicion;

    private Button btn_play;
    private Button btn_pause;
    private Button btn_stop;
    private MediaPlayer mediaPlayer;
    private int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle__cancion);
        tv_nombre = (TextView) findViewById(R.id.dc_tv_nombre);
        tv_posicion = (TextView) findViewById(R.id.dc_tv_duracion);
        Cancion cancion = (Cancion) getIntent().getSerializableExtra("cancion");
        tv_nombre.setText(cancion.getNombre());
        tv_posicion.setText(cancion.getPosicion());
        btn_play = (Button) findViewById(R.id.btn_play);
        btn_pause=(Button)findViewById(R.id.btn_pause);
        btn_stop =(Button)findViewById(R.id.btn_stop);
        n = Integer.parseInt(tv_posicion.getText().toString());
        mediaPlayer = new MediaPlayer();
        System.out.println("");
        System.out.println("n : "+n);
        System.out.println("");

    }
    public void play(View v)
    {
        playy(n);
        btn_play.setEnabled(false);
        btn_stop.setEnabled(true);
        btn_pause.setEnabled(true);
    }
    public void pausa(View v)
    {
        if (mediaPlayer.isPlaying())
        {
            mediaPlayer.pause();
            btn_stop.setEnabled(false);
            btn_play.setEnabled(true);
        }

    }
    public void stop(View v)
    {
        if (mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
            mediaPlayer.release();
            btn_pause.setEnabled(false);
            btn_stop.setEnabled(false);
            btn_play.setEnabled(true);
        }
    }
    public void envi(MediaPlayer f)
    {
        mediaPlayer=f;
    }
    public void playy(int r)
    {
        switch (r)
        {
            case 1:
                try {

                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.noche_de_paz);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
            case 2:
                try {

                    mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.bienvenida_la_navidad);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
            case 3:
                try {

                    mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.nino_manuelito);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
            case 4:
                try {

                    mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.papanoel_ya_viene);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
            case 5:
                try {

                    mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.los_pastorcitos);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
            case 6:
                try {

                    mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.burrito_sabanero);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
            case 7:
                try {

                    mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.los_reyes_magos);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
            case 8:
                try {

                    mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.que_emocion);
                    mediaPlayer.start();
                    envi(mediaPlayer);
                } catch (IllegalStateException e) {
                    Log.i("Media Player", "Error" + e.getMessage());
                }
                break;
        }
    }
}