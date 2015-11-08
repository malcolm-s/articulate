package com.malcolmstone.articulate;

import com.malcolmstone.articulate.model.Category;
import com.malcolmstone.articulate.model.QuestionDefinition;

/**
 * Created by malcolm on 08/11/15.
 */
public class GameRoundPresenter {
    private GameRoundInterface view;

    GameRoundPresenter(GameRoundInterface view) {
        this.view = view;
    }

    private QuestionDefinition[] questions = new QuestionDefinition[]{
            new QuestionDefinition(new Category("category"), "definition"),
            new QuestionDefinition(new Category("category"), "definition"),
    };

    interface GameRoundInterface {
    }
}
