package com.example.simuladordatesla;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup motorView;
    RadioGroup pinturaView;
    RadioGroup interiorView;
    RadioGroup paaView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        motorView = findViewById(R.id.motor);
        pinturaView = findViewById(R.id.pintura);
        interiorView = findViewById(R.id.interior);
        paaView = findViewById(R.id.paa);
        textView = findViewById(R.id.button);

        Button buttonApply = findViewById(R.id.button);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int motorId = motorView.getCheckedRadioButtonId();
                int pinturaId = pinturaView.getCheckedRadioButtonId();
                int interiorId = interiorView.getCheckedRadioButtonId();
                int paaId = paaView.getCheckedRadioButtonId();

                int motorPreco = 220878;
                int pinturaPreco = 0;
                int interiorPreco = 0;
                int paaPreco = 0;

                if (motorId == 2131230932) {
                    motorPreco = 267996;
                }

                if (pinturaId == 2131231001 || pinturaId == 2131231002) {
                    pinturaPreco = 5235;
                }

                if (pinturaId == 2131231003) {
                    pinturaPreco = 10470;
                }

                if (interiorId == 2131230905) {
                    interiorPreco = 5235;
                }

                if (paaId == 2131231006) {
                    paaPreco = 5235;
                }

                int valorTotal = motorPreco + pinturaPreco + interiorPreco + paaPreco;
                textView.setText("Valor total: " + valorTotal);
            }
        });
    }

}