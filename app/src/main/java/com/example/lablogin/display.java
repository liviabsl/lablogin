package com.example.lablogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class display extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;
    MyDataBaseHelper myDB;
    ArrayList<String> id, fName, lName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        recyclerView = findViewById()
    }
}