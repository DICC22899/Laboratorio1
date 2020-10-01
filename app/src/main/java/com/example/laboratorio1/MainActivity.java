package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Btn_Guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn_Guardar=(Button)findViewById(R.id.button);
        Btn_Guardar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Complete los campos necesarios.",Toast.LENGTH_SHORT).show();

            }
        });
    }
}