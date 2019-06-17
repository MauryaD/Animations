package com.example.android.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class third extends AppCompatActivity {
    public void scale(View v){
        ImageView one=findViewById(R.id.one);
        one.animate().scaleXBy(.5f).setDuration(2000);
        one.animate().scaleYBy(0.5f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}
