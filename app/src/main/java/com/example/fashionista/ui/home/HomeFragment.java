package com.example.fashionista.ui.home;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fashionista.Men.MenCloth;
import com.example.fashionista.Men.MenFormal;
import com.example.fashionista.R;
import com.example.fashionista.Women.WomenCloth;

public class HomeFragment extends Fragment {

    private ImageView male;
    private ImageView female;


    public static MenFormal newInstance()
    {
        return  new MenFormal();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_home, container, false);

        male = v.findViewById(R.id.men);
        female = v.findViewById(R.id.women);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), MenCloth.class));
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WomenCloth.class));
            }
        });

        return v;
    }
}
