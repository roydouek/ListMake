package com.example.roydouek.listmake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class Details{
        String name;
        String phone;
        int age;
        String email;
        //build activity
        public Details(String name,String phone,int age,String email)
        {
            this.name = name;
            this.phone = phone;
            this.age = age;
            this.email = email;
        }
        public String getName()
        {
            return this.name;
        }
        public String getPhone()
        {
            return this.phone;
        }
        public String getEmail()
        {
            return this.email;
        }
        public int getAge()
        {
            return this.age;
        }
    }
}



