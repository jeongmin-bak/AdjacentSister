package com.jungmin.adjacentsister;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Frag1 extends Fragment {
    private ImageButton btn_measure, btn_list, btn_map;
    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

        btn_measure = view.findViewById(R.id.btn_measure);
        btn_list = view.findViewById(R.id.btn_list);
        btn_map = view.findViewById(R.id.btn_map);

        btn_measure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ShopList.class);
                startActivity(intent);
            }
        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MapActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
