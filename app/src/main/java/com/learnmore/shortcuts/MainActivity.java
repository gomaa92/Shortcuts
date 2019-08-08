package com.learnmore.shortcuts;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDynaicShortCuts();
    }

    private void createDynaicShortCuts() {
        ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);

        Intent intentOne = new Intent(MainActivity.this, ActivityMessageFragment.class);
        intentOne.setAction(Intent.ACTION_VIEW);

        Intent intentTwo = new Intent(MainActivity.this, Dynamic2Activity.class);
        intentTwo.setAction(Intent.ACTION_VIEW);


        ShortcutInfo shortcutInfo = new ShortcutInfo.Builder(this, "dynamic1")
                .setShortLabel("Dynamic1")
                .setLongLabel("Dynamic Long Label 1")
                .setIcon(Icon.createWithResource(this, R.mipmap.ic_launcher))
                .setIntent(intentOne)
                .build();
        //shortcutManager.setDynamicShortcuts(Arrays.asList(shortcutInfo));

        ShortcutInfo shortcutInfo2 = new ShortcutInfo.Builder(this, "dynamic2")
                .setShortLabel("Dynamic2")
                .setLongLabel("Dynamic Long Label 2")
                .setIcon(Icon.createWithResource(this, R.mipmap.ic_launcher_round))
                .setIntent(intentTwo)
                .build();
        shortcutManager.setDynamicShortcuts(Arrays.asList(shortcutInfo2, shortcutInfo));


    }

    public void activityOne(View view) {

        Intent intent = new Intent(MainActivity.this, Activity_one.class);
        startActivity(intent);
    }

    public void activityTwo(View view) {
        Intent intent = new Intent(MainActivity.this, Activity_three.class);
        startActivity(intent);
    }

}
