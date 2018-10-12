package com.example.test.applistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activitydetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String savedExtra = getIntent().getStringExtra("system");
        TextView myText = (TextView) findViewById(R.id.textID);
        myText.setText(savedExtra);
    }
}
