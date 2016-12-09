package com.example.roydouek.listmake;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    static int count = 1;
    public static void GetDetails(MainActivity.Details collector2)
    {
        Map<String , MainActivity.Details[]> kMap = new HashMap<String, MainActivity.Details[]>();
        String nameGiver = "item" + count;
        kMap.put (nameGiver,new MainActivity.Details[count]);

    }
}
