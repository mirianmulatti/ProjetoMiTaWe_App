package com.example.aluno.projetoandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.orm.query.Select;

import java.util.List;

public class Lista extends AppCompatActivity {

    private List<Empresa> list;

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

        try{
            list = Select.from(Empresa.class).list();
            String nomesEmpresas[] = new String[list.size()];
            for (int i = 0; i < list.size(); i++){
                nomesEmpresas[i] = list.get(i).getNome();
            }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomesEmpresas);
        listview.setAdapter(adapter);
        } catch (Exception e){
            System.out.println("<=================================================>");
            e.printStackTrace();
            System.out.println("<=================================================>");
        }


        Toast.makeText(this, list.get(0).getNome(), Toast.LENGTH_SHORT).show();

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
