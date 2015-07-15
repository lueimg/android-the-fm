package com.example.luismori.thefm.io;

/**
 * Created by luismori on 7/15/15.
 */
public class ApiConstants {

    public static final String API_KEY = "a1b2dfb9a155e64363a78d4394004379";
    public static final String URL_BASE = "http://ws.audioscrobbler.com";
    public static final String PATH_V = "/2.0/";
    public static final String PARAM_METHOD = "method";
    public static final String PARAM_FORMAT = "format";
    public static final String PARAM_API_KEY = "api_key";
    public static final String VALUE_HYPED_ARTIST_METHOD = "chart.gethypedartists";
    public static final String VALUE_JSON = "json";
    // http://ws.audioscrobbler.com/2.0/?method=chart.gethypedartists&api_key=a1b2dfb9a155e64363a78d4394004379&format=json
    public static final String URL_HYPED_ARTISTS = PATH_V + "/?" +
            PARAM_API_KEY + "=" + API_KEY + "&" +
            PARAM_METHOD + "=" + VALUE_HYPED_ARTIST_METHOD + "&" +
            PARAM_FORMAT + "=" + VALUE_JSON;



}
