package com.example.usuario.proyecto_gdg;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView img1;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.los_reyes_magos);
        mediaPlayer.start();
        img1 = (ImageView) findViewById(R.id.img_1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_1);
        img1.startAnimation(animation);
    }
    public void canciones(View v)
    {
        Intent intent =new Intent(getApplicationContext(),Lista_canciones.class);
        startActivity(intent);
        mediaPlayer.stop();
    }
    public void recetas(View v)
    {
        Intent intent1 = new Intent(getApplicationContext(),Lista_recetas.class);
        startActivity(intent1);
        mediaPlayer.stop();
    }
}
