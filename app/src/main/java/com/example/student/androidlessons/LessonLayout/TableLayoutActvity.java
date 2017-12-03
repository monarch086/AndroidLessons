package com.example.student.androidlessons.LessonLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.student.androidlessons.R;


public class TableLayoutActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.table_layout);
        setContentView(getTableLayout());
    }

    public View getTableLayout(){

        TableLayout layout = new TableLayout(this);

        layout.setLayoutParams(new TableLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));

        layout.setStretchAllColumns(true);


        TextView textView1 = new TextView(this);
        textView1.setText("text1");

        TextView textView2 = new TextView(this);
        textView2.setText("text2");

        TextView textView3 = new TextView(this);
        textView3.setText("text3");

        TextView textView4 = new TextView(this);
        textView4.setText("text4");

        textView4.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);

        TableRow.LayoutParams params = new TableRow.LayoutParams();
        params.span=3;

        textView4.setLayoutParams(params);


        TableRow row1 = new TableRow(this);
        TableRow row2 = new TableRow(this);



        row1.addView(textView1);
        row1.addView(textView2);
        row1.addView(textView3);

        row2.setBackgroundColor(0xffcccccc);
        row2.addView(textView4);


        layout.addView(row1);
        layout.addView(row2);


        return layout;
    }
}
