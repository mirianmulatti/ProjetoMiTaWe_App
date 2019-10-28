package com.example.aluno.projetoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button botaoCadRes;
    private Button botaoCadCli;
    private Button botaoLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoCadCli = (Button) findViewById(R.id.botaoCadCli);
        botaoCadRes = (Button) findViewById(R.id.botaoCadRes);
        botaoLogin = (Button) findViewById(R.id.botaoLogin);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, TelaLogin.class);
                startActivity(it);
            }
        });
        botaoCadRes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadEmp.class);
                startActivity(it);
            }
        });
        botaoCadCli.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadCli.class);
                startActivity(it);
            }
        });
    }
}
