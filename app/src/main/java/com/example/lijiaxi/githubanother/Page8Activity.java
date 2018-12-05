package com.example.lijiaxi.githubanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        right();
        wrong1();
        wrong2();
        wrong3();
        back();
    }

    private void right() {
        Button restartButton = (Button) findViewById(R.id.answer1);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page8Activity.this, Page9Activity.class));
            }
        });
    }

    private void wrong1() {
        Button restartButton = (Button) findViewById(R.id.answer2);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page8Activity.this, FinalActivity.class));
            }
        });
    }

    private void wrong2() {
        Button restartButton = (Button) findViewById(R.id.answer3);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page8Activity.this, FinalActivity.class));
            }
        });
    }

    private void wrong3() {
        Button restartButton = (Button) findViewById(R.id.answer4);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page8Activity.this, FinalActivity.class));
            }
        });
    }

    private void back() {
        Button restartButton = (Button) findViewById(R.id.back);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page8Activity.this, MainActivity.class));
            }
        });
    }
}
