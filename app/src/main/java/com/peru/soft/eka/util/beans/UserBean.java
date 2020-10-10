package com.peru.soft.eka.util.beans;

public class UserBean {

    private String numeroRuc;
    private String razonSocial;
    private String usuarioSol;
    private String claveSol;
    private String nombreComercial;
    private String ubigeo;
    private String direccion;
    private String urbanizacion;
    private String departamento;
    private String provincia;
    private String distrito;
    private Boolean isProduccion;

    public UserBean() {

    }

    public UserBean(String numeroRuc, String razonSocial, String usuarioSol, String claveSol, String nombreComercial, String ubigeo, String direccion, String urbanizacion, String departamento, String provincia, String distrito, Boolean isProduccion) {
        this.numeroRuc = numeroRuc;
        this.razonSocial = razonSocial;
        this.usuarioSol = usuarioSol;
        this.claveSol = claveSol;
        this.nombreComercial = nombreComercial;
        this.ubigeo = ubigeo;
        this.direccion = direccion;
        this.urbanizacion = urbanizacion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.isProduccion = isProduccion;
    }

    public String getNumeroRuc() {
        return numeroRuc;
    }

    public void setNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getUsuarioSol() {
        return usuarioSol;
    }

    public void setUsuarioSol(String usuarioSol) {
        this.usuarioSol = usuarioSol;
    }

    public String getClaveSol() {
        return claveSol;
    }

    public void setClaveSol(String claveSol) {
        this.claveSol = claveSol;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Boolean getProduccion() {
        return isProduccion;
    }

    public void setProduccion(Boolean produccion) {
        isProduccion = produccion;
    }
}
