package com.jungmin.adjacentsister;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag3 extends Fragment {
    private TextView textView, textView3;
    private Button btn_mypass, btn_myinfo, btn_logout;
    private View view;
    SessionManager sessionManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag3, container, false);

        sessionManager = new SessionManager(getActivity());

        btn_mypass = view.findViewById(R.id.btn_mypass);
        btn_mypass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), MypageActivity.class);
                startActivity(intent);
            }
        });

        btn_myinfo = view.findViewById(R.id.btn_myinfo);
        btn_myinfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), ChangeInfoActivity.class);
                startActivity(intent);
            }
        });

        //logout
        btn_logout = view.findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                sessionManager.logout();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        TextView email = (TextView) view.findViewById(R.id.btn_send);
        email.setOnClickListener(new TextView.OnClickListener() {
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("plain/text");
                String[] address = {"pjm9673@gmail.com"};
                email.putExtra(Intent.EXTRA_EMAIL, address);
                email.putExtra(Intent.EXTRA_SUBJECT, "test@test");
                email.putExtra(Intent.EXTRA_TEXT, "내용");
                startActivity(email);
            }
        });
        return view;
    }
}
