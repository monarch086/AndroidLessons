package com.example.student.androidlessons.LessonControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.student.androidlessons.R;

import java.util.Calendar;

public class TimePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.timepicker_layout);
//
//
//        Button btnWhatTime = (Button)findViewById(R.id.btnWhatTime);
//        final TextView txtTimePicker = (TextView)findViewById(R.id.txtTimePicker);
//        final TimePicker timePicker = (TimePicker)findViewById(R.id.timePicker);
//
//        btnWhatTime.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            txtTimePicker.setText(   timePicker.getHour()+":"+timePicker.getMinute()  );
//            }
//        });

        setContentView(TimePickerManulal());
        Toast.makeText(this,"Hello!",Toast.LENGTH_LONG);
    }


    public View TimePickerManulal()
    {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);



        TimePicker timePicker = new TimePicker(this);
        layout.addView(timePicker);


        Calendar now = Calendar.getInstance();

        timePicker.setHour(now.get(Calendar.HOUR_OF_DAY));
        timePicker.setMinute(now.get(Calendar.MINUTE));

        final TextView txtTime = new TextView(this);
        layout.addView(txtTime);


        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {

                txtTime.setText("onTimeChanged fired: "+hourOfDay+":" + minute);
            }
        });

        //final Button




        return layout;
    }
}
