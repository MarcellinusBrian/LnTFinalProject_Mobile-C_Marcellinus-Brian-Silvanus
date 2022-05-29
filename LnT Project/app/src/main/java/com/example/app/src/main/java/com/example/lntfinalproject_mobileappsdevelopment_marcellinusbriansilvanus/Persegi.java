package com.example.lntfinalproject_mobileappsdevelopment_marcellinusbriansilvanus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {

    private EditText txSisi;
    private EditText tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        txSisi = (EditText) findViewById(R.id.txSisi);
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        tvHasil = (TextView)findViewById(R.id.tvHasil);
        btnCalculate.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v.getId() == R.id.btnCalculate){
            String sisi = txSisi.getText().toString().trim();
            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(sisi)){
                isEmptyFields = true;
                txSisi.setError("Tidak Beolh Kosong");
            }
            if(!isEmptyFields){
                double s = Double.parseDouble(sisi);
                double luas = s*s;

                tvHasil.setText(String.valueOf(luas));
            }

        }
    }
}