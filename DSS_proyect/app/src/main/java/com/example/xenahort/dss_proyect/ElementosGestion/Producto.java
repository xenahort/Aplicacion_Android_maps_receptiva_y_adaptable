/*
 * *
 *  * Created by Juan Carlos Serrano Pérez on 6/01/19 13:07
 *  * Any question send an email to juan.carlos.wow.95@gmail.com
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 6/01/19 12:03
 *
 */

package com.example.xenahort.dss_proyect.ElementosGestion;

import java.io.Serializable;

public class Producto implements Serializable {

    private String description;
    private String name;
    private String pharmacy;
    private String price;
    private int unidad;

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public void incrementarUnidad(){
        ++this.unidad;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + "    " + this.price + "€";
    }
}
