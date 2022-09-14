package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取按钮
        Button button = findViewById(R.id.login);

        //按钮进行监听
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                //前一个（MainActivity.this）是目前页面，后面一个是要跳转的下一个页面
                intent.setClass(MainActivity.this,loginActivity.class);
                startActivity(intent);
            }
        });
    }
}



//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //获取按钮
//        Button button = findViewById(R.id.button);
//
//        //按钮进行监听
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //监听按钮，如果点击，就跳转
//                Intent intent = new Intent();
//                //前一个（MainActivity.this）是目前页面，后面一个是要跳转的下一个页面
//                intent.setClass(MainActivity.this,NextActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//}
