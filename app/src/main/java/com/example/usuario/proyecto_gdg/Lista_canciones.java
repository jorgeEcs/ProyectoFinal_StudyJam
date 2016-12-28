package com.example.usuario.proyecto_gdg;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Lista_canciones extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView lv_canciones;
    private ArrayList<Cancion> dt_canciones;
    private Activity activity;
    private CustomAdapter adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_canciones);
        lv_canciones = (ListView)findViewById(R.id.lvLista_cancion);
        activity = this;
        dt_canciones=new ArrayList<Cancion>();
        llenarArrayList();
        adaptador =new CustomAdapter(activity,dt_canciones);
        lv_canciones.setAdapter(adaptador);
        lv_canciones.setOnItemClickListener(this);
    }

    private void llenarArrayList() {
        Resources r = getResources();
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_1),r.getString(R.string.posicion_1)));
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_2),r.getString(R.string.posicion_2)));
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_3),r.getString(R.string.posicion_3)));
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_4),r.getString(R.string.posicion_4)));
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_5),r.getString(R.string.posicion_5)));
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_6),r.getString(R.string.posicion_6)));
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_7),r.getString(R.string.posicion_7)));
        dt_canciones.add(new Cancion(r.getString(R.string.cancion_8),r.getString(R.string.posicion_8)));
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Cancion cancion = dt_canciones.get(position);
        Intent intent =new Intent(getApplicationContext(),Detalle_Cancion.class);
        intent.putExtra("cancion",cancion);
        startActivity(intent);
    }
}
