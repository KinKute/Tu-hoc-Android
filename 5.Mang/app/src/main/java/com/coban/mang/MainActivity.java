package com.coban.mang;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tạo mảng
        ArrayList<String> arrayName = new ArrayList<>(); // cấp phát vùng nhớ

        // thêm phần tử vào mảng
        arrayName.add("Đà Lạt");   // vị trí: 0 - đếm 1
        arrayName.add("Lâm Đồng"); // vị trí: 1 - đếm 2
        arrayName.add("Việt Nam"); // vị trí: 2 - đếm 3

        // lấy kích thước mảng (số lượng phần tử)
        Log.d("QuangBao", "SIZE " + arrayName.size());

        // truy cập vào một phần tử nào đó
        Log.d("QuangBao", "Phần tử " + arrayName.get(0));

        // xóa phần tử
        arrayName.remove(0);

        //Log.d("QuangBao", "Phần tử " + arrayName.get(0));

        for (String ten : arrayName){
            Log.d("QuangBao", ten);
        }

    }
}