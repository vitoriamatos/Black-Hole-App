package com.example.blackhole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button start, duvida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start= (Button) findViewById(R.id.button);
        duvida=(Button) findViewById(R.id.button2);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaSimulado();
            }
        });



        duvida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teladuvida();
                finish();
            }
        });

    }




    private void telaSimulado(){
        startActivity(new Intent(MainActivity.this, telaSimulador.class));
    }


    private void teladuvida(){
        startActivity(new Intent(MainActivity.this, duvida.class));
    }
}
