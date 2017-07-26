package com.ernestg.edittextautofillanimationbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.editText);
        int distanceMoved = 2000;
        view.setY(view.getY() + distanceMoved);
        view.animate().translationY(view.getY() - distanceMoved).setDuration(4000);
    }
}
