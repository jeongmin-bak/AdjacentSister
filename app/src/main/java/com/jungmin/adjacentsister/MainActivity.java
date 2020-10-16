package com.jungmin.adjacentsister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    //private TextView name,age;
    //private Button btn_logout;
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;

    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sessionManager = new SessionManager(this);
        //sessionManager.checkLogin();

        //name = findViewById(R.id.name);
        //age = findViewById(R.id.age);
        //btn_logout = findViewById(R.id.btn_logout);

        //HashMap<String, String> user = sessionManager.getUserDetail();
        //String mName = user.get(sessionManager.NAME);
        //String mAge = user.get(sessionManager.AGE);

        //name.setText(mName);
        //age.setText(mAge);

        //btn_logout.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View view) {
        //  sessionManager.logout();
        //}
        //});

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        setFrag(0);
                        break;
                    case R.id.action_content:
                        setFrag(1);
                        break;
                    case R.id.action_mypage:
                        setFrag(2);
                        break;
                }
                return true;
            }
        });


        frag1 = new Frag1();
        frag2 = new Frag2();
        frag3 = new Frag3();
        setFrag(0); //첫 프래그먼트 화면 지정
    }
    // 프래그먼트 교체가 일어나는 실행문이다.

    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch(n){
            case 0:
                ft.replace(R.id.main_frame, frag1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag2);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, frag3);
                ft.commit();
                break;

        }
    }
}