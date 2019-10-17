package com.biplav.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    float height, weight, result;
    EditText etheight, etweight;
    TextView tvBMI, tvans;
    Button btncalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etheight = findViewById(R.id.eth);
        etweight = findViewById(R.id.etw);
        tvBMI = findViewById(R.id.tvBMI);
        tvans = findViewById(R.id.tvans);
        btncalculate = findViewById(R.id.btnCal);

        btncalculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etheight.getText().toString())) {
            etheight.setError("Enter first no");
            return;
        } else if (TextUtils.isEmpty(etweight.getText().toString())) {
            etweight.setError("Enter second no");
            return;
        }
        height = Float.parseFloat(etheight.getText().toString());
        weight = Float.parseFloat(etweight.getText().toString());

        result=weight/(height*height);
        tvans.setText(result+ "");

        Intent intent=new Intent();
        intent = new Intent(MainActivity.this, FeedbackActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("ans", result+"");
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
