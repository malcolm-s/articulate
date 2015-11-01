package com.malcolmstone.articulate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_confirm);

        Intent intent = getIntent();

        Integer numberOfPlayers = intent.getIntExtra(GameStartActivity.NUMBER_PLAYERS_MESSAGE, 1);
        Integer numberOfRounds = intent.getIntExtra(GameStartActivity.NUMBER_ROUNDS_MESSAGE, 1);

        TextView ltrPlayers = (TextView) findViewById(R.id.game_confirm_ltr_players);
        ltrPlayers.setText(Integer.toString(numberOfPlayers));

        TextView ltrRounds  = (TextView) findViewById(R.id.game_confirm_ltr_rounds);
        ltrRounds.setText(Integer.toString(numberOfRounds));
    }
}