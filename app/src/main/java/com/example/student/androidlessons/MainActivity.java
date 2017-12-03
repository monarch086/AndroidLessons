package com.example.student.androidlessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import com.example.student.androidlessons.ActivityCommunication.ActivityCommunication;
import com.example.student.androidlessons.LessonControls.TimePickerActivity;
import com.example.student.androidlessons.LessonLayout.LinearLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btnLinearLayout = (Button)findViewById(R.id.btnLinearLayout);
        Button btnActivityCommunication = (Button)findViewById(R.id.btnActivityCommunication);
        Button btnTimePicker = (Button)findViewById(R.id.btnTimePicker);

        final MainActivity me = this;


        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity= new Intent(me, LinearLayoutActivity.class);

                startActivity(activity);
            }
        });


        btnActivityCommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity= new Intent(me, ActivityCommunication.class);

                startActivity(activity);
            }
        });


        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity= new Intent(me, TimePickerActivity.class);

                startActivity(activity);
            }
        });
    }
}
