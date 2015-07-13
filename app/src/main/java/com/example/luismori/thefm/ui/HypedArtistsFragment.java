package com.example.luismori.thefm.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luismori.thefm.MainActivity;
import com.example.luismori.thefm.R;


public class HypedArtistsFragment extends Fragment {

    public static final String LOG_TAG = HypedArtistsFragment.class.getName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // el inflater recibimos desde la actividad
        // viewgroud es el contenedor
        // Bundle guardamos datos cuando se mueva el cell

        View root = inflater.inflate(R.layout.fragment_hyped_artists, container, false);

        return root;

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

//        if(activity instanceof MainActivity) {
//            Log.i("It is attached", "yes");
//        }

    }
}
