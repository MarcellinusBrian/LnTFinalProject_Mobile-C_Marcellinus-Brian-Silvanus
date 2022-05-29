package com.example.lntfinalproject_mobileappsdevelopment_marcellinusbriansilvanus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Lingkaran extends AppCompatActivity {

    EditText txjari, txluas, txkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
    }

    public void myClickHandler(View v){
        txjari = (EditText) findViewById(R.id.txJari);
        txluas = (EditText) findViewById(R.id.txLuas);
        txkeliling = (EditText) findViewById(R.id.txKeliling);
        switch (v.getId()){
            case R.id.btnProses:
                int jari = Integer.parseInt(txjari.getText().toString());

                double luas = 3.14 * jari * jari;
                double keliling = 2 * 3.14 * jari;

                txluas.setText(String.valueOf(luas));
                txkeliling.setText(String.valueOf(keliling));

                break;
            case R.id.btnHapus:
                txjari.setText("");
                txluas.setText("");
                txkeliling.setText("");

                break;

        }
    }
}