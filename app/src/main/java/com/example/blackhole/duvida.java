package com.example.blackhole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class duvida extends AppCompatActivity {

    private Button entendi;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duvida);


        entendi=(Button) findViewById(R.id.button3);

        entendi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teladuvida();
                finish();
            }
        });




    }


    private void teladuvida(){
        startActivity(new Intent(duvida.this, MainActivity.class));
    }


    public void onBackPressed(){

        startActivity(new Intent(duvida.this, MainActivity.class));
        finish();


    }
}
