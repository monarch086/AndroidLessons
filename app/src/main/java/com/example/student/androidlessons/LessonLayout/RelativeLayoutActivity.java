package com.example.student.androidlessons.LessonLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.student.androidlessons.R;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.relative_layout_lesson);
        setContentView(getRelativeLayout());
    }


    public View getRelativeLayout()
    {
        RelativeLayout myLayout = new RelativeLayout(this);

        myLayout.setMinimumHeight(300);
        myLayout.setMinimumWidth(300);


        TextView textView1 = new TextView(this);
        textView1.setText("text1");
        textView1.setId(1);


        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params1.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        params1.addRule(RelativeLayout.CENTER_IN_PARENT);

        myLayout.addView(textView1,params1);



        TextView textView2 = new TextView(this);
        textView2.setText("text2");
        textView2.setId(2);


        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        params2.addRule(RelativeLayout.CENTER_IN_PARENT);

        myLayout.addView(textView2,params2);




        TextView textView3 = new TextView(this);
        textView3.setText("text3");
        textView3.setId(3);

        RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        params3.addRule(RelativeLayout.CENTER_IN_PARENT);

        myLayout.addView(textView3,params3);


        TextView textView4 = new TextView(this);
        textView4.setText("text4");
        textView4.setId(4);

        RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params4.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        params4.addRule(RelativeLayout.CENTER_IN_PARENT);
        params4.addRule(RelativeLayout.BELOW,textView3.getId());

        myLayout.addView(textView4,params4);



        TextView textView5 = new TextView(this);
        textView5.setText("text5");
        textView5.setId(5);

        RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params5.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        params5.addRule(RelativeLayout.CENTER_IN_PARENT);

        myLayout.addView(textView5,params5);


        TextView textView6 = new TextView(this);
        textView6.setText("text6");
        textView6.setId(6);

        RelativeLayout.LayoutParams params6 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params6.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        params6.addRule(RelativeLayout.CENTER_IN_PARENT);
        params6.addRule(RelativeLayout.BELOW,textView5.getId());

        myLayout.addView(textView6,params6);







        return  myLayout;
    }
}
