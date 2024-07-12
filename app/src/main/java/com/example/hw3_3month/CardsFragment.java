package com.example.hw3_3month;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.carousel.CarouselLayoutManager;

import java.util.ArrayList;
import java.util.List;


public class CardsFragment extends Fragment {


    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;
    private List<Cards> cardList;
@Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_cards, container, false);
    recyclerView = view.findViewById(R.id.rv_card);
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

    cardList = new ArrayList<>();
    cardAdapter = new CardAdapter(getContext(), cardList);
    recyclerView.setAdapter(cardAdapter);

    populateCardList();

    Button buttonSwitch = view.findViewById(R.id.btn_next2);
    buttonSwitch.setOnClickListener(v-> switchToNextFragment());
    return view;
    }


    private void populateCardList() {
        cardList.add(new Cards(R.drawable.cards_k_diamond));
        cardList.add(new Cards(R.drawable.cards_k_spade));
        cardList.add(new Cards(R.drawable.cards_q_heart));
        cardList.add(new Cards(R.drawable.cards_q_club));
        cardList.add(new Cards(R.drawable.cards_j_club));
        cardList.add(new Cards(R.drawable.cards_j_heart));



        cardAdapter.notifyDataSetChanged();

    }


    private void switchToNextFragment() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.rv_fragment, new MoviesFragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }
}