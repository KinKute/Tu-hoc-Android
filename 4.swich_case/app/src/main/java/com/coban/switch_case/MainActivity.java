package com.coban.switch_case;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int thang = 0;
        String chuoi;
        switch (thang){
            case 1:
                chuoi = "Tháng 1";
                Log.d("QuangBao", chuoi);
                    break;
            case 2:
                chuoi = "Tháng 2";
                Log.d("QuangBao", chuoi);
                break;
            case 3:
                chuoi = "Tháng 3";
                Log.d("QuangBao", chuoi);
                break; //ngắt
            default: chuoi = "Không xác định"; //không có điều kiện đúng
                Log.d("QuangBao", chuoi);

        }
    }
}