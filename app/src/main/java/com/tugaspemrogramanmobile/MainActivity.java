package com.tugaspemrogramanmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Biodata;
    EditText Nama,NIM,Prodi;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Biodata = (TextView) findViewById(R.id.Biodata);

        Nama = (EditText) findViewById(R.id.EditTextNama);
        NIM = (EditText) findViewById(R.id.EditTextNim);
        Prodi = (EditText) findViewById(R.id.EditTextProdi);
        Submit = (Button) findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNama = Nama.getText().toString();
                String strNIM = NIM.getText().toString();
                String strProdi = Prodi.getText().toString();

                Biodata.setText(strNama + "\n" + strNIM +"\n"+ strProdi);
            }
        });

    }
}