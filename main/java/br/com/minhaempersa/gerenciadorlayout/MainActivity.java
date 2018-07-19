package br.com.minhaempersa.gerenciadorlayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.idButton);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText texto = findViewById(R.id.idTextView);
        int duracao = Toast.LENGTH_SHORT;
        String nome = texto.getText().toString();
        Context contexto = getApplicationContext();

        Toast toast = Toast.makeText(contexto, nome, duracao);
        toast.show();

        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);



    }
}
