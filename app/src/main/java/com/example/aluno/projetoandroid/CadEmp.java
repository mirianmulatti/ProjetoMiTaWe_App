package com.example.aluno.projetoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

public class CadEmp extends AppCompatActivity {
    private EditText nome;
    private EditText email;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_emp);


        //depois que rodou uma vez comenta essas 3 linhas
        //SugarContext.init(getApplicationContext());
        //SchemaGenerator schemaGenerator = new SchemaGenerator(this);
        //schemaGenerator.createDatabase(new SugarDb(this).getDB());


        nome = (EditText) findViewById(R.id.editTextNome);
        email = (EditText) findViewById(R.id.editTextEmail);
        btn = (Button) findViewById(R.id.buttonCadastrar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //receber os dados dos campos de texto
                String n = nome.getText().toString();
                String e = email.getText().toString();

                Pessoa p = new Pessoa();
                p.setNome(n);
                p.setEmail(e);

                //salvando
                p.save();

                nome.setText("");
                email.setText("");

            }
        });

    }
}
