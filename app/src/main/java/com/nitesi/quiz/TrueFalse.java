package com.nitesi.quiz;

/**
 * Created by nitesi on 23-03-2015.
 */
public class TrueFalse
{
    private int questionId;
    private boolean isTrueQuestion;

    public TrueFalse(int questionId, boolean isTrueQuestion) {
        this.questionId = questionId;
        this.isTrueQuestion = isTrueQuestion;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean isTrueQuestion() {
        return isTrueQuestion;
    }

    public void setTrueQuestion(boolean isTrueQuestion) {
        this.isTrueQuestion = isTrueQuestion;
    }
}
