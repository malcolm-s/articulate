package com.malcolmstone.articulate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleExpandableListAdapter;

import com.malcolmstone.articulate.model.Category;
import com.malcolmstone.articulate.model.QuestionDefinition;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GameRoundActivity extends AppCompatActivity implements GameRoundPresenter.GameRoundInterface {
    private QuestionsListAdapter adapter;

    @Bind(R.id.questions_list)
    ListView questionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_round);

        ButterKnife.bind(this);

        this.adapter = new QuestionsListAdapter(this);
        questionsList.setAdapter(adapter);
    }
}
