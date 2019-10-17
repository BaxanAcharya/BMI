package com.biplav.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FeedbackActivity extends AppCompatActivity {

    TextView tvmyans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Bundle bundle=getIntent().getExtras();
        String stuff=bundle.getString("ans");

        tvmyans=findViewById(R.id.tvfinal);
        tvmyans.setText("You EMI is: "+stuff);

    }
}
