package com.example.tabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button logar;
    TextView email;
    TextView senha;
    TextView alerta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_soli);

        logar=(Button)findViewById(R.id.logar);
        email=(TextView)findViewById(R.id.id_email);
        senha=(TextView)findViewById(R.id.id_password);
        alerta=(TextView)findViewById(R.id.id_alerta);

        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new Confirmar_User().verificar(email.getText().toString(),senha.getText().toString())){
                    logar.setText("");
                     new ConfirmarLogin().setConfirmacao(true);
                       confir();
                }else {
                    alerta.setText("UTILIZADOR NAO AUTORIZADO...");
                }

            }
        });
    }

    private void confir() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}