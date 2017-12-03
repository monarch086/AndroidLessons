package com.example.student.androidlessons.ActivityCommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.student.androidlessons.R;

public class ActivityCalculator extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculator);


        Bundle extras = getIntent().getExtras();


        if (extras != null) {
            String productName = extras.getString("Product");
            Double productPrice = extras.getDouble("Price");

            TextView txtitem = (TextView) findViewById(R.id.txtItem);

            txtitem.setText(productName + " has price " + String.valueOf(productPrice));
        }
    }

    public void btnCalcOk(View view) {

        Intent intent = new Intent();
        intent.putExtra(ActivityCommunication.CALCULATOR_RESULT_DATA,"Good!");

        setResult(ActivityCommunication.CALCULATOR_RESULT_OK,intent);

        finish();
    }

    public void btnCalcCancel(View view) {

        setResult(ActivityCommunication.CALCULATOR_RESULT_CANCEL);

        finish();
    }

}
