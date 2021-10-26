package com.example.fashionista.Women;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.fashionista.Men.MenCasual;
import com.example.fashionista.Men.MenCloth;
import com.example.fashionista.Men.MenFormal;
import com.example.fashionista.R;


public class WomenCloth extends AppCompatActivity {

    private ImageView formal;
    private ImageView casual;

    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.womens);

        formal = (ImageView) findViewById(R.id.formal);
        casual = (ImageView) findViewById(R.id.casual);

        formal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WomenCloth.this, WomenFormal.class));
            }
        });

        casual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WomenCloth.this, WomenCasual.class));
            }
        });

    }
}



