package com.example.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler databaseHandler = new DatabaseHandler(this,
                "studentdb.sqlite", null, 1);
        databaseHandler.addStudent(new Student(1,"tam","go vap", "0123141551"));
    }
}