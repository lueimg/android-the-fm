package com.example.luismori.thefm.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luismori.thefm.MainActivity;
import com.example.luismori.thefm.R;


public class HypedArtistsFragment extends Fragment {

    public static final int NUM_COLMNS = 2;

    public static final String LOG_TAG = HypedArtistsFragment.class.getName();

    // es una variable global que sera usado muchas veces
    private RecyclerView mHypedArtistsList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // el inflater recibimos desde la actividad
        // viewgroud es el contenedor
        // Bundle guardamos datos cuando se mueva el cell

        View root = inflater.inflate(R.layout.fragment_hyped_artists, container, false);

        mHypedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artist_list);


        return root;

    }

    private void setupArtistsList() {
        // seteamos el layout manager
        // una actividad es un contexto
        mHypedArtistsList.setLayoutManager(new GridLayoutManager(getActivity(), NUM_COLMNS));
    }



}
