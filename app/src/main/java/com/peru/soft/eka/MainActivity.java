package com.peru.soft.eka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1 = findViewById(R.id.txt1);

        Button btn1 = findViewById(R.id.btn1);
               btn1.setOnClickListener(b -> {
                   Intent intent= new Intent (this, FormularioSunatActivity.class);
                   startActivity(intent);
               });
    }


    public void onClickCheckBox(View view) {

        switch (view.getId()) {
            case(R.id.checkbox_videojuegos) :
                Toast.makeText(this, "Me gusta los videoJuegos y soy gay", Toast.LENGTH_LONG).show();
                break;
            case(R.id.checkbox_deportes) :
                Toast.makeText(this, "Ella es hermosa", Toast.LENGTH_LONG).show();
                break;
        }

    }
}