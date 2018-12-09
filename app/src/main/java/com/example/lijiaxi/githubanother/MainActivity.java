package com.example.lijiaxi.githubanother;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import java.net.URLDecoder;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "cs125finalproject";
    private static RequestQueue requestQueue;
    public static Question[] questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = Volley.newRequestQueue(this);






    }

    void startAPICall() {
        try {
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                    Request.Method.GET,
                    "https://opentdb.com/api.php?amount=10&type=multiple&encode=url3986",
                    null,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(final JSONObject response) {
                            Log.d(TAG, response.toString());
                            try {
                                if (response.getInt("response_code") != 0) {
                                    throw(new Exception("Empty results"));
                                } else {
                                    questions = getQuestions(response);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();;
                            }
                        }
                    }, new Response.ErrorListener() {
                public void onErrorResponse(final VolleyError error) {
                    Log.w(TAG, error.toString());
                }
            });
            requestQueue.add(jsonObjectRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Question[] getQuestions(JSONObject response) {
        Question[] questions = new Question[10];
        try {
            JSONArray result = response.getJSONArray("results");
            for (int i = 0; i < questions.length; i++) {
                String question = result.getJSONObject(i).get("question").toString();
                question = URLDecoder.decode(question);
                String correct_answer = result.getJSONObject(i).get("correct_answer").toString();
                correct_answer = URLDecoder.decode(correct_answer);
                String[] answers = new String[4];
                answers[0] = correct_answer;

                for (int j = 1; j < answers.length; j++) {
                    answers[i] = result.getJSONObject(i).getJSONArray("incorrect_answers").get(j - 1).toString();
                    answers[j] = URLDecoder.decode(answers[j]);
                }
                questions[i] = new Question(question, correct_answer, answers);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}
