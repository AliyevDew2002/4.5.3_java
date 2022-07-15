package com.example.a451_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    TextView id; TextView pw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        id=findViewById(R.id.et_user_id);
        pw=findViewById(R.id.et_user_pw);
        Button login=findViewById(R.id.login_b_id);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity2();
            }
        });
    }
    void startActivity2(){
        Intent intent=new Intent(this,MainActivity2.class);
        String loginExtra="Id="+id.getText().toString()+" Password="+pw.getText().toString().trim();
        intent.putExtra("login",loginExtra);
        startActivity(intent);
    }
}