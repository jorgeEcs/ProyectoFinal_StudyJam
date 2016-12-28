package com.example.usuario.proyecto_gdg;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Lista_recetas extends AppCompatActivity implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Receta receta = dt_recetas.get(position);
        Intent intent =new Intent(getApplicationContext(),Detalle_Receta.class);
        intent.putExtra("receta",receta);
        startActivity(intent);
    }

    private ListView lv_recetas;
    private ArrayList<Receta> dt_recetas;
    private Activity activity;
    private CustomAdapter1 adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_recetas);
        lv_recetas = (ListView)findViewById(R.id.lvLista_receta);
        activity = this;
        dt_recetas=new ArrayList<Receta>();
        llenarArrayList();
        adaptador =new CustomAdapter1(activity,dt_recetas);
        lv_recetas.setAdapter(adaptador);
        lv_recetas.setOnItemClickListener(this);
    }
    private void llenarArrayList() {
        Resources r = getResources();
        dt_recetas.add(new Receta(r.getString(R.string.receta_1),r.getString(R.string.rec1)
                ,r.getString(R.string.rec1_ingr1)
                ,r.getString(R.string.rec1_ingr2)
                ,r.getString(R.string.rec1_ingr3)
                ,r.getString(R.string.rec1_ingr4)
                ,r.getString(R.string.rec1_ingr5)
                ,r.getString(R.string.rec1_ingr6)
                ,r.getString(R.string.rec1_ingr7)
                ,r.getString(R.string.rec1_ingr8)
                ,r.getString(R.string.rec1_ingr9)
                ,r.getString(R.string.rec1_ingr10)
                ,r.getString(R.string.rec1_ingr11)
                ,r.getString(R.string.rec1_ingr12)
                ,r.getString(R.string.rec1_ingr13)));
        dt_recetas.add(new Receta(r.getString(R.string.receta_2),r.getString(R.string.rec2)
                ,r.getString(R.string.rec2_ingr1)
                ,r.getString(R.string.rec2_ingr2)
                ,r.getString(R.string.rec2_ingr3)
                ,r.getString(R.string.rec2_ingr4)
                ,r.getString(R.string.rec2_ingr5)
                ,r.getString(R.string.rec2_ingr6)
                ,r.getString(R.string.rec2_ingr7)
                ,r.getString(R.string.rec2_ingr8)
                ,r.getString(R.string.rec2_ingr9)
                ,r.getString(R.string.rec2_ingr10)
                ,r.getString(R.string.rec2_ingr11)
                ,r.getString(R.string.rec2_ingr12)
                ,r.getString(R.string.rec2_ingr13)));
        dt_recetas.add(new Receta(r.getString(R.string.receta_3),r.getString(R.string.rec3)
                ,r.getString(R.string.rec3_ingr1)
                ,r.getString(R.string.rec3_ingr2)
                ,r.getString(R.string.rec3_ingr3)
                ,r.getString(R.string.rec3_ingr4)
                ,r.getString(R.string.rec3_ingr5)
                ,r.getString(R.string.rec3_ingr6)
                ,r.getString(R.string.rec3_ingr7)
                ,r.getString(R.string.rec3_ingr8)
                ,r.getString(R.string.rec3_ingr9)
                ,r.getString(R.string.rec3_ingr10)
                ,r.getString(R.string.rec3_ingr11)
                ,r.getString(R.string.rec3_ingr12)
                ,r.getString(R.string.rec1_ingr13)));
        dt_recetas.add(new Receta(r.getString(R.string.receta_4),r.getString(R.string.rec4)
                ,r.getString(R.string.rec4_ingr1)
                ,r.getString(R.string.rec4_ingr2)
                ,r.getString(R.string.rec4_ingr3)
                ,r.getString(R.string.rec4_ingr4)
                ,r.getString(R.string.rec4_ingr5)
                ,r.getString(R.string.rec4_ingr6)
                ,r.getString(R.string.rec4_ingr7)
                ,r.getString(R.string.rec4_ingr8)
                ,r.getString(R.string.rec4_ingr9)
                ,r.getString(R.string.rec4_ingr10)
                ,r.getString(R.string.rec4_ingr11)
                ,r.getString(R.string.rec4_ingr12)
                ,r.getString(R.string.rec4_ingr13)));
        dt_recetas.add(new Receta(r.getString(R.string.receta_5),r.getString(R.string.rec5)
                ,r.getString(R.string.rec5_ingr1)
                ,r.getString(R.string.rec5_ingr2)
                ,r.getString(R.string.rec5_ingr3)
                ,r.getString(R.string.rec5_ingr4)
                ,r.getString(R.string.rec5_ingr5)
                ,r.getString(R.string.rec5_ingr6)
                ,r.getString(R.string.rec5_ingr7)
                ,r.getString(R.string.rec5_ingr8)
                ,r.getString(R.string.rec5_ingr9)
                ,r.getString(R.string.rec5_ingr10)
                ,r.getString(R.string.rec5_ingr11)
                ,r.getString(R.string.rec5_ingr12)
                ,r.getString(R.string.rec5_ingr13)));
        dt_recetas.add(new Receta(r.getString(R.string.receta_6),r.getString(R.string.rec6)
                ,r.getString(R.string.rec6_ingr1)
                ,r.getString(R.string.rec6_ingr2)
                ,r.getString(R.string.rec6_ingr3)
                ,r.getString(R.string.rec6_ingr4)
                ,r.getString(R.string.rec6_ingr5)
                ,r.getString(R.string.rec6_ingr6)
                ,r.getString(R.string.rec6_ingr7)
                ,r.getString(R.string.rec6_ingr8)
                ,r.getString(R.string.rec6_ingr9)
                ,r.getString(R.string.rec6_ingr10)
                ,r.getString(R.string.rec6_ingr11)
                ,r.getString(R.string.rec6_ingr12)
                ,r.getString(R.string.rec6_ingr13)));
        dt_recetas.add(new Receta(r.getString(R.string.receta_7),r.getString(R.string.rec7)
                ,r.getString(R.string.rec7_ingr1)
                ,r.getString(R.string.rec7_ingr2)
                ,r.getString(R.string.rec7_ingr3)
                ,r.getString(R.string.rec7_ingr4)
                ,r.getString(R.string.rec7_ingr5)
                ,r.getString(R.string.rec7_ingr6)
                ,r.getString(R.string.rec7_ingr7)
                ,r.getString(R.string.rec7_ingr8)
                ,r.getString(R.string.rec7_ingr9)
                ,r.getString(R.string.rec7_ingr10)
                ,r.getString(R.string.rec7_ingr11)
                ,r.getString(R.string.rec7_ingr12)
                ,r.getString(R.string.rec7_ingr13)));
    }
}
