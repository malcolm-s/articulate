package com.malcolmstone.articulate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CardsActivity extends AppCompatActivity {
    private RecyclerView mCardList;
    private RecyclerView.LayoutManager mCardListLayoutManager;
    private RecyclerView.Adapter mCardListAdapter;

    private String[] mData = new String[] {
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
            "David Bowie", "Joni Mitchell", "Jimi Hendrix",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        mCardList = (RecyclerView)findViewById(R.id.card_list);
        mCardList.setHasFixedSize(true);

        mCardList.setLayoutManager(mCardListLayoutManager = new LinearLayoutManager(this));

        mCardList.setAdapter(mCardListAdapter = new CardsAdapter(mData));
    }
}
