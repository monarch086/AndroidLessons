package com.example.student.androidlessons.LessonControls;

import android.view.View;
import android.widget.TextView;

/**
 * Created by student on 26.11.2017.
 */

public class ButtonListerner implements View.OnClickListener{


    private TextView textView;

    public ButtonListerner(TextView textView){
        this.textView = textView;
    }


    @Override
    public void onClick(View v) {

        textView.setText("Done!");
    }
}
