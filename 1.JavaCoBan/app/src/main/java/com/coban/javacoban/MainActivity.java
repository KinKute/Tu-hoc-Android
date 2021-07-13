package com.coban.javacoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // khai báo chuỗi
        String hoTen = "Nguyễn Trần Quang Bảo";

        // biến số
        int nam = 2021;

        // kiểm tra và thực thi bằng log chưa cần máy ảo
        Log.d("QuangBao", hoTen + " - " + nam);
    }
}