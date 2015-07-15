package com.example.luismori.thefm.io.model;

import com.example.luismori.thefm.domain.Artist;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by luismori on 7/15/15.
 */
public class HypedArtistsResponse {
    // generamos el modelo anidado de la respuesta
    @SerializedName(JsonKeys.ARTISTS_RESULTS)
    HypedArtistsResults results;

    public ArrayList<Artist> getArtists(){
        return results.artists;
    }


    private class HypedArtistsResults {
        @SerializedName(JsonKeys.ARTISTS_ARRAY)
        ArrayList<Artist> artists;
    }
}
