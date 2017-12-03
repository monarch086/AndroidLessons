package com.example.student.androidlessons.ActivityCommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.student.androidlessons.R;

public class ActivityCommunication extends AppCompatActivity {

    private static final int REQUEST_CALCULATOR=1;

    public  static final int CALCULATOR_RESULT_OK=1;
    public  static final int CALCULATOR_RESULT_CANCEL=2;


    public  static final String CALCULATOR_RESULT_DATA="CALCULATOR_RESULT_DATA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
    }

    public void onCalculatorClick(View view){

        Intent intent = new Intent(this,ActivityCalculator.class);

        intent.putExtra("Product","Phone");
        intent.putExtra("Price",190.5);


        //startActivity(intent);

        startActivityForResult(intent,REQUEST_CALCULATOR);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent){

        TextView txtResult = (TextView)findViewById(R.id.txtcalcresult);


        if (requestCode==REQUEST_CALCULATOR)
        {
            if (resultCode==CALCULATOR_RESULT_OK){

                String data = intent.getStringExtra(CALCULATOR_RESULT_DATA);

                txtResult.setText(data);
            }
            else
            {
                txtResult.setText("Was canceled");
            }
        }
        else
        {
            super.onActivityResult(requestCode,resultCode,intent);
        }

    }
}
