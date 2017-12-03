package com.example.student.androidlessons.LessonControls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.student.androidlessons.R;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.button_layout);
        setContentView(getButton());
    }

    public void btnListener(View sender){

        Button btn = (Button)sender;

        btn.setText("Done");
    }



    public View getButton(){

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);


        Button button1 = new Button(this);
        button1.setText("Button1");

        final TextView textView = new TextView(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button 1 Done!");
            }
        });

        layout.addView(button1);
        layout.addView(textView);


        Button button2 = new Button(this);
        button2.setText("Button2");

        TextView textView2 = new TextView(this);


        ButtonListerner listener = new ButtonListerner(textView2);
        button2.setOnClickListener(listener);


        layout.addView(button2);
        layout.addView(textView2);



        return layout;
    }
}
