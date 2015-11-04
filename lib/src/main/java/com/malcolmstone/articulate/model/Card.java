package com.malcolmstone.articulate.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by malcolm on 01/11/15.
 */
public class Card {
    private Question[] questions;
    private Category category;

    public Card(Question[] questions, Category category) {
        this.questions = questions;
        this.category = category;
    }

    public Question getQuestionToAnswer() throws Exception {
        for (Question q : questions) {
            if (q.getCategory() == category) {
                return q;
            }
        }

        throw new Exception("Could not find question for category: " + category.getName());
    }
}
