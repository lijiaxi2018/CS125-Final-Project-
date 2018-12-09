package com.example.lijiaxi.githubanother;

public class QuestionLiarbry {
    private String[] questions = {
            "Question 1 A",
            "Question 2 B",
            "Question 3 C"
    };

    private String[][] choice = {
            {"A", "B", "C", "D"},
            {"A", "B", "C", "D"},
            {"A", "B", "C", "D"}
    };

    private String[] correct = {
            "A",
            "B",
            "C"
    };

    public String getQuestion(int a) {
        String que = questions[a];
        return que;
    }

    public String getChoice1(int a) {
        String cho1 = choice[a][0];
        return cho1;
    }

    public String getChoice2(int a) {
        String cho2 = choice[a][1];
        return cho2;
    }

    public String getChoice3(int a) {
        String cho3 = choice[a][2];
        return cho3;
    }

    public String getChoice4(int a) {
        String cho3 = choice[a][3];
        return cho3;
    }

    public String getCorrect(int a) {
        String answer = correct[a];
        return answer;
    }
}
