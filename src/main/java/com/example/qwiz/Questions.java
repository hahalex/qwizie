package com.example.qwiz;

public class Questions {
    private String questions;
    private String[] answers;

    public Questions(String questions, String[] answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public String correctAnswer() {
        return this.answers[answers.length - 1];
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}
