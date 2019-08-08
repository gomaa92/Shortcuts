package com.learnmore.shortcuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityMessageFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_fragment);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new MessageFragment()).commit();
    }
}
