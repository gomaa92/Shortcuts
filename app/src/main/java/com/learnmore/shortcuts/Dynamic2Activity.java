package com.learnmore.shortcuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Dynamic2Activity extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic2);
        textView = findViewById(R.id.textView2);
        String number = getIntent().getStringExtra("number");
        textView.setText(number);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Dynamic2Activity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
