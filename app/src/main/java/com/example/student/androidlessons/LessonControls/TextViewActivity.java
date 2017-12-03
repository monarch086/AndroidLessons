package com.example.student.androidlessons.LessonControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.student.androidlessons.R;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getTextViews());
        //setContentView(R.layout.textview_layout);
       }


    public View getTextViews(){

        LinearLayout myLayout = new LinearLayout(this);



        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams textViewLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);



        TextView textView1 = new TextView(this);
        textView1.setText("text1");

        myLayout.addView(textView1,textViewLayoutParams);

        myLayout.setLayoutParams(layoutParams);
        myLayout.setOrientation(LinearLayout.HORIZONTAL);


       //-----------------------------------------------------------------------
        LinearLayout innerLayout = new LinearLayout(this);

        TextView textView2 = new TextView(this);
        textView2.setText("text2");

        innerLayout.addView(textView2,textViewLayoutParams);

        TextView textView3 = new TextView(this);
        textView3.setText("text3");

        innerLayout.addView(textView3,textViewLayoutParams);
        innerLayout.setOrientation(LinearLayout.VERTICAL);

        //-----------------------------------------------------------------------



        myLayout.addView(innerLayout,textViewLayoutParams);

        return myLayout;

    }
}
