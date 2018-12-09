package com.example.lijiaxi.githubanother;

public class Question {
    private String question;
    private String correctAnswer;
    private String[] answers;

    Question(String question, String correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
    }
    public String getQuestion() {
        return question;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String[] getAnswers() {
        return answers;
    }
}
