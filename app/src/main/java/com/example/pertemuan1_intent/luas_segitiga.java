package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luas_segitiga extends AppCompatActivity {
    EditText alas,tinggi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        alas = (EditText) findViewById(R.id.input_alas);
        tinggi = (EditText) findViewById(R.id.input_Tinggi);
        hitung = (Button) findViewById(R.id.btn_luas);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = alas.getText().toString();
                    String isitinggi = tinggi.getText().toString();
                    double alas = Double.parseDouble(isialas);
                    double tinggi = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(alas,tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }
            }
        });
    }
    public double LuasSegitiga(double alas,double tinggi){
        return alas*tinggi/2;
    }
}