package com.example.lntfinalproject_mobileappsdevelopment_marcellinusbriansilvanus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends AppCompatActivity {

    private EditText edtPanjang, edtLebar, edtTinggi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        edtPanjang = (EditText) findViewById(R.id.txtPanjang);
        edtLebar = (EditText) findViewById(R.id.txtLebar);
        edtTinggi = (EditText) findViewById(R.id.txtTinggi);
        Button btnHitung = (Button) findViewById(R.id.btnHitung);
        tvHasil = (TextView) findViewById(R.id.tv_Hasil);
        btnHitung.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v.getId()==R.id.btnHitung){
            String panjang = edtPanjang.getText().toString().trim();
            String lebar = edtLebar.getText().toString().trim();
            String tinggi = edtTinggi.getText().toString().trim();
            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(panjang)){
                isEmptyFields = true;
                edtPanjang.setError("Field ini Tidak Boleh Kosong");
            }
            if (TextUtils.isEmpty(lebar)){
                isEmptyFields = true;
                edtLebar.setError("Field ini Tidak Boleh Kosong");
            }
            if (TextUtils.isEmpty(tinggi)){
                isEmptyFields = true;
                edtTinggi.setError("Field ini Tidak Boleh Kosong");
            }

            if (!isEmptyFields){
                double l = Double.parseDouble(lebar);
                double p = Double.parseDouble(panjang);
                double t = Double.parseDouble(tinggi);
                double volume = l*p*t;

                tvHasil.setText(String.valueOf(volume));
            }
        }
    }
}