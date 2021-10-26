package com.example.fashionista.Men;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fashionista.R;


public class MenCloth extends AppCompatActivity {

    private ImageView formal;
    private ImageView casual;

    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mens);

        formal = (ImageView) findViewById(R.id.men_formal);
        casual = (ImageView) findViewById(R.id.men_casual);

        formal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenCloth.this, MenFormal.class));
            }
        });

        casual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenCloth.this, MenCasual.class));
            }
        });

    }
}

