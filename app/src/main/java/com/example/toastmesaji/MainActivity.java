package com.example.toastmesaji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnMessage;
    EditText textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnMessage=findViewById(R.id.buton);
        textMessage=findViewById(R.id.text);
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=textMessage.getText().toString();
                Toast.makeText(MainActivity.this, "hi man what' up "+name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}