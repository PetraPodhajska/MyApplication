package com.example.localhost.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class apka1 extends AppCompatActivity {
    private EditText vst_vaha;
    private EditText vst_vyska;
    private TextView outBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apka1);

        vst_vaha = (EditText) findViewById(R.id.vstup_hmotnost);
        vst_vyska = (EditText) findViewById(R.id.vstup_vyska);
        outBMI = (TextView) findViewById(R.id.vystup);
    }

    public void onButtonbmi(View view){
        double vaha= 0, vyska= 0, bmi;
        try{
        vaha = Double.parseDouble(vst_vaha.getText().toString());
        vyska = Double.parseDouble(vst_vyska.getText().toString());
        }catch (NumberFormatException e) {
            Toast myToast = Toast.makeText(
                    getApplication(), "Špatný vstup!", Toast.LENGTH_SHORT
            );
        } finally {
            if (vaha!=0 && vyska!=0){
                bmi = vaha/Math.pow(vyska/100,2);
                outBMI.setText(String.format("%.2f", bmi));
            }
        }
        //Toast myToast = Toast.makeText(
        //        getApplication(), "Nelechtej mě", Toast.LENGTH_SHORT

        // );

        //myToast.show();
    }
}
