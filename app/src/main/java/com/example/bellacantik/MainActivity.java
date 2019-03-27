package com.example.bellacantik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edNPM;
    EditText edNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edNPM = (EditText) findViewById(R.id.edNPM);
        edNama = (EditText) findViewById(R.id.edNama);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String npm = edNPM.getText().toString();
                String nama = edNama.getText().toString();

                if (npm.equals("16411029") && nama.equals("Bella Savira")) {
                    Intent a = new Intent(MainActivity.this, Main2Activity.class);
                    a.putExtra("npm" , npm);
                    a.putExtra("nama", nama);
                    startActivity(a);
                    finish();

                } else if (npm.equals("16411029") && nama.equals("Bella Savira")) {
                    Intent a = new Intent(MainActivity.this, Main2Activity.class);
                    a.putExtra("npm" , npm);
                    a.putExtra("nama", nama);
                    startActivity(a);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),"Inputan salah", Toast.LENGTH_LONG)
                            .show();

                }


            }
        });
    }
}
