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

    public QuestionsListAdapter(Context context) {
        super(context, -1, new QuestionDefinition[0]);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        QuestionDefinition questionDefinition = questionDefinitions[position];

        if (convertView != null) {
            return bindViewData(convertView, questionDefinition);
        } else {
            View questionsView = getLayoutInflater().inflate(R.layout.question_view, parent, false);

            return bindViewData(questionsView, questionDefinition);
        }
    }

    private LayoutInflater getLayoutInflater() {
        return (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    private View bindViewData(View view, QuestionDefinition questionDefinition) {
        ((TextView) view.findViewById(R.id.category)).setText(questionDefinition.getCategory().getName());
        ((TextView) view.findViewById(R.id.description)).setText(questionDefinition.getDescription());

        return view;
    }
}
