package com.example.lijiaxi.githubanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PageActivity extends AppCompatActivity {


    public QuestionLiarbry myQuestions = new QuestionLiarbry();

    private TextView mQuestionView;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;
    private Button mChoice4;
    private Button back;

    private String mAnswer;
    public int score = 0;
    public int questionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        mQuestionView = (TextView)findViewById(R.id.questionView) ;
        mChoice1 = (Button)findViewById(R.id.answer1);
        mChoice2 = (Button)findViewById(R.id.answer2);
        mChoice3 = (Button)findViewById(R.id.answer_3);
        mChoice4 = (Button)findViewById(R.id.answer4);
        back = (Button)findViewById(R.id.back);

        updateQuestion();

        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChoice1.getText() == mAnswer) {
                    score++;
                    Toast.makeText(PageActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    updateQuestion();
                } else {
                    Toast.makeText(PageActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });

        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChoice2.getText() == mAnswer) {
                    score++;
                    Toast.makeText(PageActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    updateQuestion();
                } else {
                    Toast.makeText(PageActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });

        mChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChoice3.getText() == mAnswer) {
                    score++;
                    Toast.makeText(PageActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    updateQuestion();
                } else {
                    Toast.makeText(PageActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });

        mChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChoice4.getText() == mAnswer) {
                    score++;
                    Toast.makeText(PageActivity.this, "Correct", Toast.LENGTH_LONG).show();
                    updateQuestion();
                } else {
                    Toast.makeText(PageActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PageActivity.this, MainActivity.class));
            }
        });

    }

    private void updateQuestion() {
        if (questionNumber == 3) {
            startActivity(new Intent(PageActivity.this, AnotherActivity.class));
        }
        mQuestionView.setText(myQuestions.getQuestion(questionNumber));
        mChoice1.setText(myQuestions.getChoice1(questionNumber));
        mChoice2.setText(myQuestions.getChoice2(questionNumber));
        mChoice3.setText(myQuestions.getChoice3(questionNumber));
        mChoice4.setText(myQuestions.getChoice4(questionNumber));
        mAnswer = myQuestions.getCorrect(questionNumber);

        questionNumber++;
    }
}
