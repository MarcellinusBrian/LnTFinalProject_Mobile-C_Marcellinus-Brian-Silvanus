package com.example.lntfinalproject_mobileappsdevelopment_marcellinusbriansilvanus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    EditText A, T;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        A = (EditText) findViewById(R.id.txAlas);
        T = (EditText) findViewById(R.id.txTinggi);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.Hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //notifikasi jika alas dan tinggi tidak diisi
                if (A.length()==0 && T.length()==0){
                    Toast.makeText(getApplication(), "Alas dan Tinggi harus diisi", Toast.LENGTH_SHORT).show();
                }
                //notifikasi jika panjang tidak diisi
                else if (A.length()==0){
                    Toast.makeText(getApplication(), "Alas tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
                //notifikasi jika tinggi tidak diisi
                else if (T.length()==0){
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }else{
                    String isialas = A.getText().toString();
                    String isitinggi = T.getText().toString();
                    double A = Double.parseDouble(isialas);
                    double T = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(A, T);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double A, double T){return A*T/2;}
}