package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageView = findViewById(R.id.imageViewMoeda);
        button = findViewById(R.id.buttonVoltar);
        Bundle bundle = getIntent().getExtras();

        int numero = bundle.getInt("numero");

        if(numero == 0) {
            imageView.setImageResource(R.drawable.moeda_cara);
        } else {
            imageView.setImageResource(R.drawable.moeda_coroa);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}