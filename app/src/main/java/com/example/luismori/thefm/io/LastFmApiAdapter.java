package com.example.luismori.thefm.io;

import retrofit.RestAdapter;

/**
 * Created by luismori on 7/15/15.
 */
public class LastFmApiAdapter {
    // instancia contruida de t odo el api de last fm
    private static LastFmApiService API_SERVICE;

    public static LastFmApiService getApiService() {
        if (API_SERVICE == null) {
            RestAdapter adapter = new RestAdapter.Builder()
                    .setEndpoint(ApiConstants.URL_BASE)
                    .setLogLevel(RestAdapter.LogLevel.BASIC)
                    .build();
            // le de los poderes para conectarse con el servicio
            API_SERVICE = adapter.create(LastFmApiService.class);
        }
        return API_SERVICE;
    }


}
