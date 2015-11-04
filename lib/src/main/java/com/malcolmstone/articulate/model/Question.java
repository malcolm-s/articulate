package com.malcolmstone.articulate.model;

/**
 * Created by malcolm on 01/11/15.
 */
public class Question {
    private QuestionDefinition definition;
    private boolean isPassed;
    private boolean isCorrectlyAnswered;

    public Question(QuestionDefinition definition) {
        this.definition = definition;
    }

    public boolean isCorrectlyAnswered() {
        return isCorrectlyAnswered;
    }

    public void setIsCorrectlyAnswered(boolean isCorrectlyAnswered) {
        this.isCorrectlyAnswered = isCorrectlyAnswered;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setIsPassed(boolean isPassed) {
        this.isPassed = isPassed;
    }

    public Category getCategory() {
        return definition.getCategory();
    }
}
