package com.example.mjaque.logosquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TRON", "Inicio de la Aplicación.");
        setContentView(R.layout.activity_main);

        ivLogo = (ImageView)findViewById(R.id.ivLogo);
        Log.d("TRON", "Encontrado ImageView");
        this.ivLogo.setClickable(true);
        this.ivLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TRON", "Pulsada la imagen");
                Intent intent = new Intent(MainActivity.this, LogosActivity.class);
                startActivity(intent);
            }
        });
    }
}
