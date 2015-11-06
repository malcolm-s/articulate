package com.malcolmstone.articulate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.malcolmstone.articulate.model.QuestionDefinition;

/**
 * Created by malcolm on 05/11/15.
 */
public class QuestionsListAdapter extends ArrayAdapter<QuestionDefinition> {
    private QuestionDefinition[] questionDefinitions;

    public QuestionsListAdapter(Context context, QuestionDefinition[] questionDefinitions) {
        super(context, -1, questionDefinitions);

        this.questionDefinitions = questionDefinitions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View questionsView = getLayoutInflater().inflate(R.layout.question_view, parent, false);
        QuestionDefinition questionDefinition = questionDefinitions[position];

        ((TextView) questionsView.findViewById(R.id.category)).setText(questionDefinition.getCategory().getName());
        ((TextView) questionsView.findViewById(R.id.description)).setText(questionDefinition.getDescription());

        return questionsView;
    }

    private LayoutInflater getLayoutInflater() {
        return (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
