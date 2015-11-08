package com.malcolmstone.articulate.data;

import com.malcolmstone.articulate.model.Category;
import com.malcolmstone.articulate.model.QuestionDefinition;

/**
 * Created by malcolm on 08/11/15.
 */
public class LocalStorage implements QuestionDefinitionRepository {
    @Override
    public QuestionDefinition[] getQuestionDefinitions(Category category) {
        return new QuestionDefinition[0];
    }
}
