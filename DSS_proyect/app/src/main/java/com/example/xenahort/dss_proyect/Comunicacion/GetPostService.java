/*
 * *
 *  * Created by Juan Carlos Serrano Pérez on 6/01/19 13:06
 *  * Any question send an email to juan.carlos.wow.95@gmail.com
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 29/12/18 20:45
 *
 */

package com.example.xenahort.dss_proyect.Comunicacion;

import com.example.xenahort.dss_proyect.ElementosGestion.Farmacia;
import com.example.xenahort.dss_proyect.ElementosGestion.Producto;
import com.example.xenahort.dss_proyect.ElementosGestion.Respuesta;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetPostService {

    @GET("/rest/pharmacies")
    Call<List<Farmacia>> getAllPharm();

    @GET("/rest/products")
    Call<List<Producto>> getAllProduct();

    @POST("/rest/orders")
    @FormUrlEncoded
    Call<Respuesta> crearPedido(@Field("email") String email,
                                @Field("type") String type,
                                @Field("date") String date,
                                @Field("cart") String products);
}
