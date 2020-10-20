package com.jungmin.adjacentsister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MypageActivity extends AppCompatActivity {
    SessionManager sessionManager;
    private EditText pass;
    private Button btn_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        sessionManager = new SessionManager(this);
        pass = findViewById(R.id.pass);
        btn_check = findViewById(R.id.btn_check);

        Intent intent = getIntent();
        //final String userID = intent.getStringExtra("userID");
        final String userPass = intent.getStringExtra("userPass");

        HashMap<String, String> user = sessionManager.getUserDetail();
        final String mPass = user.get(sessionManager.PASS);
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pass_check = pass.getText().toString();

                if(mPass.equals(pass_check)){
                    Toast.makeText(getApplicationContext(), "비밀번호가 일치합니다.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MypageActivity.this, PassWordActivity.class);
                    //intent.putExtra("userId",userID);
                    //intent.putExtra("userPass",userPass);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "비밀번호를 다시 입력하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}