package com.coban.funtion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ThongBao("Kin", 18);
        ThongBao("Bảo", 19);
        ThongBao("Vàng", 20);

    }

    private void ThongBao(String ten, int tuoi){
        Log.d("QuangBao", "Xin chào các bạn " + ten + ". Bạn đã " + tuoi);
    }
}