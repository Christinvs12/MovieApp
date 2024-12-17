package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    String getuname,getpass,str1="admin",str2="123456",invalid="entered password or userid incorrect";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.uname);
        et2=(EditText) findViewById(R.id.pass);
        b1=(Button) findViewById(R.id.log);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getuname=et1.getText().toString();
                getpass=et2.getText().toString();
                if(getuname.equals(str1) && getpass.equals(str2))
                {
                    Intent ob=new Intent(getApplicationContext(),Menuapp.class);
                    startActivity(ob);
                }
                else {
                    Toast.makeText(getApplicationContext(),invalid,Toast.LENGTH_LONG).show();
                }



            }
        });

        };
    }
