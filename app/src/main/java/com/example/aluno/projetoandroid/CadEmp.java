package com.example.aluno.projetoandroid;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CadEmp extends AppCompatActivity {


    //videooooooooooo https://www.youtube.com/watch?v=drnqZ7b6NMo


    private ImageView ImageViewFoto;
    private Button botaoImg;
    private EditText nome;
    private EditText localizacao;
    private EditText cardapio;
    private EditText telefone;
    private EditText email;
    private EditText senha1;
    private EditText senha2;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_emp);

        /* Descomnetar esse código e ajustar ele */

        nome = (EditText) findViewById(R.id.editTextNome2);
        localizacao = (EditText) findViewById(R.id.editTextLoca);
        cardapio = (EditText) findViewById(R.id.editTextCar);
        telefone = (EditText) findViewById(R.id.editTextTel);
        email = (EditText) findViewById(R.id.editTextEmail);
        senha1 = (EditText) findViewById(R.id.editTextSenha1);
        senha2 = (EditText) findViewById(R.id.editTextSenha2);
        btn = (Button) findViewById(R.id.buttonCadastrar);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //receber os dados dos campos de texto
                String n = nome.getText().toString();
                String l = localizacao.getText().toString();
                String c = cardapio.getText().toString();
                String t = telefone.getText().toString();
                String em = email.getText().toString();
                String s1 = senha1.getText().toString();
                String s2 = senha2.getText().toString();

                Empresa e = new Empresa();
                e.setNome(n);
                e.setCardapio(c);
                e.setTelefone(t);
                e.setEmail(em);
                e.setSenha1(s1);
                e.setSenha2(s2);

                //salvando
                e.save();

                nome.setText("");
                email.setText("");
                localizacao.setText("");
                cardapio.setText("");
                telefone.setText("");
                senha1.setText("");
                senha2.setText("");

            }
        });

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);
        }



        ImageViewFoto = (ImageView) findViewById(R.id.imagem);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tirarFoto();
            }
        });


        //depois que rodou uma vez comenta essas 3 linhas
        //SugarContext.init(getApplicationContext());
        //SchemaGenerator schemaGenerator = new SchemaGenerator(this);
        //schemaGenerator.createDatabase(new SugarDb(this).getDB());


        nome = (EditText) findViewById(R.id.editTextLoca);
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
    public void tirarFoto(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1 && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imagem = (Bitmap) extras.get("data");
            ImageViewFoto.setImageBitmap(imagem);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
