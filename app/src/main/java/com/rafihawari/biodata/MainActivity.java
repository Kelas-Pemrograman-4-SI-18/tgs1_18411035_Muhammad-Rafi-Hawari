package com.rafihawari.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNama, edtNpm, edtAlamat, edtTempatTanggalLahir, edtJenisKelamin, edtNoTelp, edtEmail;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmDanNama);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNpm  = (EditText) findViewById(R.id.edtNpm);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtTempatTanggalLahir = (EditText) findViewById(R.id.edtTempatTanggalLahir);
        edtJenisKelamin = (EditText) findViewById(R.id.edtJenisKelamin);
        edtNoTelp = (EditText) findViewById(R.id.edtNoTelp);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNama = edtNama.getText().toString();
                String strNpm  = edtNpm.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strTempatTanggalLahir = edtTempatTanggalLahir.getText().toString();
                String strJenisKelamin = edtJenisKelamin.getText().toString();
                String strNoTelp = edtNoTelp.getText().toString();
                String strEmail = edtEmail.getText().toString();

                txtTampil.setText(strNama + "\n" + strNpm + "\n" + strAlamat + "\n" + strTempatTanggalLahir + "\n" + strJenisKelamin + "\n" + strNoTelp + "\n" + strEmail);
            }
        });
    }
}