package com.peru.soft.eka.util.enums;

public enum CollectionEnum {

    USERS("users");

    private String ruta;

    private CollectionEnum(String ruta){
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
