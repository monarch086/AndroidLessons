package com.example.student.androidlessons.LessonControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.student.androidlessons.R;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.edittext_layout);
        setContentView(getEditText());
    }


    public View getEditText()
    {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);



        EditText edit1 = new EditText(this);
        edit1.setHint("Enter few lines");
        edit1.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_FLAG_MULTI_LINE);

        EditText edit2 = new EditText(this);
        edit2.setHint("Only numbers");
        edit2.setInputType(InputType.TYPE_CLASS_NUMBER);

        layout.addView(edit1);
        layout.addView(edit2);




        return layout;
    }
}
