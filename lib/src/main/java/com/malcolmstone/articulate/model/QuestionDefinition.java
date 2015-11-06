package com.malcolmstone.articulate.model;

/**
 * Created by malcolm on 04/11/15.
 */
public class QuestionDefinition {
    private Category category;
    private String description;

    public QuestionDefinition(Category category, String description) {
        this.category = category;
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
