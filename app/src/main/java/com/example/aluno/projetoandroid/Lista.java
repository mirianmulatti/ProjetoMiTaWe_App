package com.example.aluno.projetoandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        ListView listview = (ListView) findViewById(R.id.listview);
//         String[] dados = new String[] { "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
//                "Honeycomb", "Ice Cream Sandwich", "Jelly Bean",
//                "KitKat", "Lollipop", "Marshmallow", "Nougat" };
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dados);
//        listview.setAdapter(adapter);


//        List<CadEmp> empresas = listview();
//        ArrayAdapter<empresas> adapter = new ArrayAdapter<empresas>()(this, android.R.layout.simple_list_item_1);
//
//        ListView listaNomes = (ListView) findViewById(R.id.lista);

    }



}
