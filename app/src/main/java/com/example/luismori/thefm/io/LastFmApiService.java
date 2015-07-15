package com.example.luismori.thefm.io;

import com.example.luismori.thefm.io.model.HypedArtistsResponse;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by luismori on 7/15/15.
 */
public interface LastFmApiService {

    @GET(ApiConstants.URL_HYPED_ARTISTS)
    void getHypedArtists (Callback<HypedArtistsResponse> serverResponse);
}
