package com.example.hw3_3month;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MoviesFragment extends Fragment {
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<Movies> moviesList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        recyclerView = view.findViewById(R.id.rv_movie);

        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));

        moviesList = new ArrayList<>();
        movieAdapter = new MovieAdapter(requireContext(), moviesList);
        recyclerView.setAdapter(movieAdapter);

        populateMoviesList();

        return view;
    }

    private void populateMoviesList() {
        moviesList.add(new Movies("Плохие парни", R.mipmap.ic_vegas_foreground));
        moviesList.add(new Movies("Мальчишник в Вегасе", R.mipmap.ic_boys_foreground));
        moviesList.add(new Movies("Побег из Шоушенка", R.mipmap.ic_showshenk_foreground));
        moviesList.add(new Movies("Зеленая миля", R.mipmap.ic_green_foreground));
        moviesList.add(new Movies("1+1", R.mipmap.ic_one_foreground));
        moviesList.add(new Movies("Огни большого города", R.mipmap.ic_light_foreground));
        moviesList.add(new Movies("Жизнь прекрасна", R.mipmap.ic_life_foreground));
        moviesList.add(new Movies("Плохие парни", R.mipmap.ic_vegas_foreground));
        moviesList.add(new Movies("Мальчишник в Вегасе", R.mipmap.ic_boys_foreground));
        moviesList.add(new Movies("Побег из Шоушенка", R.mipmap.ic_showshenk_foreground));
        moviesList.add(new Movies("Зеленая миля", R.mipmap.ic_green_foreground));
        moviesList.add(new Movies("1+1", R.mipmap.ic_one_foreground));
        moviesList.add(new Movies("Огни большого города", R.mipmap.ic_light_foreground));
        moviesList.add(new Movies("Жизнь прекрасна", R.mipmap.ic_life_foreground));

        movieAdapter.notifyDataSetChanged();
    }
}
