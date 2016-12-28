package com.example.usuario.proyecto_gdg;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Detalle_Receta extends AppCompatActivity {
    private TextView titulo;
    private TextView ing_1;
    private TextView ing_2;
    private TextView ing_3;
    private TextView ing_4;
    private TextView ing_5;
    private TextView ing_6;
    private TextView ing_7;
    private TextView ing_8;
    private TextView ing_9;
    private TextView ing_10;
    private TextView ing_11;
    private TextView ing_12;
    private TextView ing_13;
    private TextView preparacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle__receta);
        titulo =(TextView)findViewById(R.id.tv_Titulo_rec);
        ing_1 =(TextView)findViewById(R.id.tv_ingr1);
        ing_2 =(TextView)findViewById(R.id.tv_ingr2);
        ing_3 = (TextView)findViewById(R.id.tv_ingr3);
        ing_4 = (TextView)findViewById(R.id.tv_ingr4);
        ing_5 = (TextView)findViewById(R.id.tv_ingr5);
        ing_6 = (TextView)findViewById(R.id.tv_ingr6);
        ing_7 = (TextView)findViewById(R.id.tv_ingr7);
        ing_8 = (TextView)findViewById(R.id.tv_ingr8);
        ing_9 = (TextView)findViewById(R.id.tv_ingr9);
        ing_10 = (TextView)findViewById(R.id.tv_ingr10);
        ing_11 = (TextView)findViewById(R.id.tv_ingr11);
        ing_12 = (TextView)findViewById(R.id.tv_ingr12);
        ing_13 = (TextView)findViewById(R.id.tv_ingr13);
        preparacion =(TextView)findViewById(R.id.tv_prep);
        Receta receta = (Receta) getIntent().getSerializableExtra("receta");
        titulo.setText(receta.getNombre());
        Resources r = getResources();
        preparacion.setText(receta.getPrepara());
        ing_1.setText(receta.getIng1());
        ing_2.setText(receta.getIng2());
        ing_3.setText(receta.getIng3());
        ing_4.setText(receta.getIng4());
        ing_5.setText(receta.getIng5());
        ing_6.setText(receta.getIng6());
        ing_7.setText(receta.getIng7());
        ing_8.setText(receta.getIng8());
        ing_9.setText(receta.getIng9());
        ing_10.setText(receta.getIng10());
        ing_11.setText(receta.getIng11());
        ing_12.setText(receta.getIng12());
        ing_13.setText(receta.getIng13());
    }
}
