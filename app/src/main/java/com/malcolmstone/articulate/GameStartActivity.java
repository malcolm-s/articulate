package com.malcolmstone.articulate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class GameStartActivity extends AppCompatActivity {
    public static final String NUMBER_PLAYERS_MESSAGE = "NUMBER_PLAYERS";
    public static final String NUMBER_ROUNDS_MESSAGE = "NUMBER_ROUNDS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bindFabClick();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void bindFabClick() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(getGoConfirmIntent());
            }
        });
    }

    private Intent getGoConfirmIntent() {
        Intent intent = new Intent(this, CardsActivity.class);

        //intent.putExtra(NUMBER_PLAYERS_MESSAGE, getNumberOfPlayers());
        //intent.putExtra(NUMBER_ROUNDS_MESSAGE, getNumberOfRounds());

        return intent;
    }

    private int getNumberOfPlayers() {
        EditText txtPlayers = (EditText)findViewById(R.id.game_start_txt_players);

        return Integer.parseInt(txtPlayers.getText().toString());
    }

    private int getNumberOfRounds() {
        EditText txtRounds = (EditText)findViewById(R.id.game_start_txt_rounds);

        return Integer.parseInt(txtRounds.getText().toString());
    }
}
