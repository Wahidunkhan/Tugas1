package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Halaman2 extends AppCompatActivity implements View.OnClickListener{

    EditText edtInput;
    Button btnEnter;

    public static final int RESULT_CODE = 110;
    public static final String EXTRA_VALUE = "extra_value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        edtInput = findViewById(R.id.klik);
        btnEnter = findViewById(R.id.touch);

        btnEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.touch) {
            String name = edtInput.getText().toString();

            Intent intent = new Intent();
            intent.putExtra(EXTRA_VALUE, name);
            setResult(RESULT_CODE, intent);
            finish();
        }

    }
}
