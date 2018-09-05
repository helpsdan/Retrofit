package com.example.logonrmlocal.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NossosEndoints {

    @GET("contatos.php")
    Call<List<Contato>> getContatos();
}
