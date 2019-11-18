package com.cinthyasophia.perfildeusuario;

public class Empresa {
    private String razonSocial;
    private int cif;
    private String direccion;
    private String paginaWeb;
    private String correoE;

    public Empresa(String razonSocial, int cif, String direccion, String paginaWeb, String correoE) {
        this.razonSocial = razonSocial;
        this.cif = cif;
        this.direccion = direccion;
        this.paginaWeb = paginaWeb;
        this.correoE = correoE;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCif() {
        return cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public String getCorreoE() {
        return correoE;
    }
}
