package com.example.lijiaxi.githubanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalPageActivity extends PageActivity {


    private TextView mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        update();
        home();
    }
    private void home() {
        Button restartButton = (Button) findViewById(R.id.returnbutton);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinalPageActivity.this, MainActivity.class));
            }
        });
    }
    private void update() {
        mScore = (TextView) findViewById(R.id.scoreView);
        mScore.setText(" CONGRATULATIONS! your score is " + score);
    }


}
