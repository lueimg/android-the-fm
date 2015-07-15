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
import com.example.luismori.thefm.domain.Artist;
import com.example.luismori.thefm.ui.adapter.HypedArtistsAdapter;

import java.util.ArrayList;


public class HypedArtistsFragment extends Fragment {


    public static final int NUM_COLMNS = 2;

    public static final String LOG_TAG = HypedArtistsFragment.class.getName();

    // es una variable global que sera usado muchas veces
    private RecyclerView mHypedArtistsList;
    private HypedArtistsAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // dentro de un fragmento el contexto lo obtenemos por medio de un getActivity
        adapter = new HypedArtistsAdapter(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // el inflater recibimos desde la actividad
        // viewgroud es el contenedor
        // Bundle guardamos datos cuando se mueva el cell

        View root = inflater.inflate(R.layout.fragment_hyped_artists, container, false);
        mHypedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artist_list);
        setupArtistsList();
        setDummyContent();
        return root;

    }

    private void setupArtistsList() {
        // seteamos el layout manager
        // una actividad es un contexto
        // configuracion para el recycler view sea un grid
        mHypedArtistsList.setLayoutManager(new GridLayoutManager(getActivity(), NUM_COLMNS));
        mHypedArtistsList.setAdapter(adapter);
        mHypedArtistsList.addItemDecoration(new ItemOffsetDecoration(getActivity(), R.integer.offset));
    }

    private void setDummyContent() {
        ArrayList<Artist> artists = new ArrayList<Artist>();
        for (int i= 0; i < 10; i++) {
            artists.add(new Artist("Artist " + i));
        }
        adapter.addAll(artists);
    }


}
