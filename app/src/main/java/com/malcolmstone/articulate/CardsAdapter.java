package com.malcolmstone.articulate;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by root on 29/10/15.
 */
public class CardsAdapter extends RecyclerView.Adapter {
    public static class CardsViewHolder extends RecyclerView.ViewHolder {
        public TextView mHeaderTextView;
        public TextView mDescriptionTextView;
        public CardView mCardView;

        public CardsViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);
            mHeaderTextView = (TextView) itemView.findViewById(R.id.card_header);
            mDescriptionTextView = (TextView) itemView.findViewById(R.id.card_description);
        }
    }

    private String[] mCards;

    public CardsAdapter(String[] cards) {
        mCards = cards;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.cards_view, parent, false);

        return new CardsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CardsViewHolder viewHolder = (CardsViewHolder) holder;

        String text = mCards[position];

        viewHolder.mHeaderTextView.setText(text.toUpperCase());
        viewHolder.mDescriptionTextView.setText(text);
    }

    @Override
    public int getItemCount() {
        return mCards.length;
    }
}
