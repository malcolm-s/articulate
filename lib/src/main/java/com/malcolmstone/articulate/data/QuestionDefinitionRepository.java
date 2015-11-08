package com.malcolmstone.articulate.data;

import com.malcolmstone.articulate.model.Category;
import com.malcolmstone.articulate.model.Question;
import com.malcolmstone.articulate.model.QuestionDefinition;

/**
 * Created by malcolm on 08/11/15.
 */
public interface QuestionDefinitionRepository {
    QuestionDefinition[] getQuestionDefinitions(Category category);
}
