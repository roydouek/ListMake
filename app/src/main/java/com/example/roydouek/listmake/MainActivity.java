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
    }
    public void SetAll(View view){
        Details newcontact;
        int phonenum;
        int agenum;
        TextView setName = (TextView) findViewById(R.id.Name);
        TextView setEmail = (TextView) findViewById(R.id.Email);
        TextView setPhone = (TextView) findViewById(R.id.PhoneNumber);
        TextView setAge = (TextView) findViewById(R.id.Age);
        String phone = setPhone.getText().toString();
        String age = setPhone.getText().toString();
        if (isNumeric(age)==false)
            setAge.setHint("age - only numbers!");

        if (isNumeric(phone)==false)
            setPhone.setHint("phone - only numbers!");

        if (isNumeric(phone)&&isNumeric(age)) {
            agenum = Integer.parseInt(age);
            phonenum = Integer.parseInt(phone);
            //create new contact
            newcontact = new Details(setName.getText().toString(), phonenum, agenum, setEmail.getText().toString());
            GetSetAll(newcontact);
        }

    }
    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
    public static void GetSetAll(Details collector)
    {
        Main2Activity.GetDetails(collector);
    }
}



