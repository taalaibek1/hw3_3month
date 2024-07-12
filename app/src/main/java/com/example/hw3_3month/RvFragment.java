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

import java.util.ArrayList;
import java.util.List;

public class RvFragment extends Fragment {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<Users> userList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rv, container, false);

        recyclerView = view.findViewById(R.id.rv_user);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        userList = new ArrayList<>();
        userAdapter = new UserAdapter(getContext(), userList);

        recyclerView.setAdapter(userAdapter);

        populateUserList();

        Button buttonSwitch = view.findViewById(R.id.btn_next);
        buttonSwitch.setOnClickListener(v-> switchToNextFragment());

        return view;
    }

    private void populateUserList() {
        userList.add(new Users("Mark Zuckerberg", R.mipmap.ic_mark_round, 39));
        userList.add(new Users("Joe Mask", R.mipmap.ic_joe_round, 35));
        userList.add(new Users("Alice Wonderland", R.mipmap.ic_alice_round, 40));
        userList.add(new Users("Jhon Doe", R.mipmap.ic_jhon_round, 22));
        userList.add(new Users("Chris Brown", R.mipmap.ic_chris_round, 35));
        userList.add(new Users("Julia Smith", R.mipmap.ic_julia_round, 37));

        userList.add(new Users("Mark Zuckerberg", R.mipmap.ic_mark_round, 39));
        userList.add(new Users("Joe Mask", R.mipmap.ic_joe_round, 35));
        userList.add(new Users("Alice Wonderland", R.mipmap.ic_alice_round, 40));
        userList.add(new Users("Jhon Doe", R.mipmap.ic_jhon_round, 22));
        userList.add(new Users("Chris Brown", R.mipmap.ic_chris_round, 35));
        userList.add(new Users("Julia Smith", R.mipmap.ic_julia_round, 37));

        userList.add(new Users("Mark Zuckerberg", R.mipmap.ic_mark_round, 39));
        userList.add(new Users("Joe Mask", R.mipmap.ic_joe_round, 35));
        userList.add(new Users("Alice Wonderland", R.mipmap.ic_alice_round, 40));
        userList.add(new Users("Jhon Doe", R.mipmap.ic_jhon_round, 22));
        userList.add(new Users("Chris Brown", R.mipmap.ic_chris_round, 35));
        userList.add(new Users("Julia Smith", R.mipmap.ic_julia_round, 37));



        userAdapter.notifyDataSetChanged();
    }

    private void switchToNextFragment() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.rv_fragment, new CardsFragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
