package com.example.android.animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class second extends AppCompatActivity {
    public void translate(View V){

        ImageView two=findViewById(R.id.two);
        for(int i=0;i<=1;) {
            two.animate().translationXBy(500f).setDuration(2000);
            two.animate().translationXBy(-500f).setDuration(2000);
            two.animate().translationXBy(-500f).setDuration(2000);        //Problem==Supporting only last animation.!!
            two.animate().translationXBy(500f).setDuration(2000);
            i++;
        }
    }

    public void nextanimation(View V){
        Button next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(second.this,third.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
