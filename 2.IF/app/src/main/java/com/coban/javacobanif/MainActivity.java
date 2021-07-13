package com.coban.javacobanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // khai báo biến kiểu int
        int so = 5;

        // kiểm tra bằng if else
        if(so <= 25){
            // nếu điều kiện đúng
            Log.d("QuangBao", "Đúng");
        }else{
            // nếu điều kiện sai
            Log.d("QuangBao", "Sai");
        }

    }
}