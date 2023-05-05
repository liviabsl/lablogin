package com.example.lablogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class formulario extends AppCompatActivity {

    public static final String EXTRA_FNAME = "package com.motoacademy.lablogin.FNAME";
    public static final String EXTRA_LNAME = "package com.motoacademy.lablogin.LNAME";

    private EditText mFname;
    private EditText mLname;
    private Button mButtonSave;
    private Button mButtonDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        mFname  = findViewById(R.id.main_name);
        mLname  = findViewById(R.id.last_name);
        mButtonSave = findViewById(R.id.save);
        mButtonDisplay = findViewById(R.id.display);

        mButtonSave.setEnabled(false);
        mLname.setEnabled(false);

        mFname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int start, int count, int after) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                mLname.setEnabled(!editable.toString().isEmpty());
            }
        });


        mLname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int start, int count, int after) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                mButtonSave.setEnabled(!editable.toString().isEmpty());
            }
        });

        mButtonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fName = mFname.getText().toString();
                String lName = mLname.getText().toString();

                MyDataBaseHelper myDB = new MyDataBaseHelper(formulario.this);
                myDB.addPerson(fName.trim(), lName.trim());

            }
        });

        mButtonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyDataBaseHelper myDB = new MyDataBaseHelper(formulario.this);

                Intent intent = new Intent(formulario.this, display.class);
                startActivity(intent);

            }
        });

    }
}