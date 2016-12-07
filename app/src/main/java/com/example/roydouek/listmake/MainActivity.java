package com.example.roydouek.listmake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class Details{
        String name;
        int phone;
        int age;
        String email;
        //build activity
        public Details(String name,int phone,int age,String email)
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
        public int getPhone()
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

        public void setAll(View view){
            //input - name.
            TextView setName = (TextView) findViewById(R.id.Name);
            this.name = setName.getText().toString();
            //input - email.
            TextView setEmail = (TextView) findViewById(R.id.Email);
            this.email = setEmail.getText().toString();
        }
    }
}



