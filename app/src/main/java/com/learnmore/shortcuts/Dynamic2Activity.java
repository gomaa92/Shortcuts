package com.learnmore.shortcuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Dynamic2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic2);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Dynamic2Activity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
