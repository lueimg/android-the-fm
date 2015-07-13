package com.example.luismori.thefm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.luismori.thefm.ui.HypedArtistsFragment;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // cuando se voltee el cell , el bundle devuelve ya la instancia del fragment anterior
        if (savedInstanceState == null){
            // conectamos el fragmento con la actividad
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.main_container, new HypedArtistsFragment())
                    .commit();
        }



    }


}
