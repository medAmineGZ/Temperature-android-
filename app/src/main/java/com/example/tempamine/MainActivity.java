package com.example.tempamine;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import  com.example.tempamine.R ;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText editTextC;
    EditText editTextF;
    Double a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextC = findViewById(R.id.textinc);
        editTextF =  findViewById(R.id.textinf);
        b1 = findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celcuse=editTextC.getText().toString();
                String F=editTextF.getText().toString();




                if ((celcuse.isEmpty()) && (F.isEmpty()))
                {
                    Toast.makeText(MainActivity.this, "please write a number ", Toast.LENGTH_SHORT).show();
                }
                else if ((!celcuse.isEmpty()) && (!F.isEmpty()))
                {
                    Toast.makeText(MainActivity.this, "please write only one number ", Toast.LENGTH_SHORT).show();
                }

                else if ((!celcuse.isEmpty()) && (F.isEmpty()))
                {
                    a = Double.parseDouble(String.valueOf(editTextC.getText()));
                    Double b = a * 9 / 5 + 32;
                    String r = String.valueOf(b);
                    editTextF.setText(r);
                    Toast.makeText(MainActivity.this, r + "°F", Toast.LENGTH_SHORT).show();
                }
                else if ((celcuse.isEmpty()) &&  (!F.isEmpty()) )
                {
                    a = Double.parseDouble(String.valueOf(editTextF.getText()));
                    Double b = a - 32;
                    Double c = b * 5 / 9;
                    String r = String.valueOf(c);
                    editTextC.setText(r);
                    Toast.makeText(MainActivity.this, r + "°C", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }


    public void reset(View view) {

        editTextC.setText("");
        editTextF.setText("");
    }
}