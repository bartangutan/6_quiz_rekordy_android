package com.example.quizrekordy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolder {
    @GET("db.json")
    public Call<List<Rekord>> getRekord();
}
