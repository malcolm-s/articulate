package com.malcolmstone.articulate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.jakewharton.rxbinding.view.RxView;
import com.malcolmstone.articulate.model.Question;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

public class GameRoundActivity extends AppCompatActivity {
    private QuestionsListAdapter adapter;
    private Timer timer;

    @Bind(R.id.questions_list)
    ListView questionsList;

    @Bind(R.id.question_timer)
    ProgressBar questionTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_round);

        ButterKnife.bind(this);

        this.adapter = new QuestionsListAdapter(this);
        questionsList.setAdapter(adapter);

        startTimer();
    }

    private void startTimer() {
        Observable
                .interval(0, 1, TimeUnit.SECONDS)
                .take(R.integer.question_duration)
                .forEach(new Action1<Long>() {
                             @Override
                             public void call(Long aLong) {
                                 int current = questionTimer.getProgress();
                                 questionTimer.setProgress(current + 10);
                             }
                         }
                );
    }

    private void goRoundActivity() {
        Intent intent = new Intent(this, GameRoundActivity.class);
        startActivity(intent);
    }
}
