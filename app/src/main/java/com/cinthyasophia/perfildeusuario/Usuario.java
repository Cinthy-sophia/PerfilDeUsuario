package com.cinthyasophia.perfildeusuario;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.cinthyasophia.perfildeusuario.Util.Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Usuario {
    private Lib lib;
    private int nif;
    private String nombre;
    private String apellido;
    private GregorianCalendar fechaNac;
    private int edad;
    private String direccion;
    private Empresa empresa;
    private String alias;
    private String contra;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Usuario(int nif, String nombre, String apellido, Empresa empresa, String fechaNac, String direccion, String alias, String contra) {
        this.lib= new Lib();
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = lib.getFecha(fechaNac);
        this.edad= lib.getEdad(this.fechaNac);
        this.direccion = direccion;
        this.empresa= empresa;
        this.alias = alias;
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public int getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNac() {
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
        Date d= fechaNac.getTime();
        String date;
        date= format.format(d);
        return date;
    }

    public String getDireccion() {
        return direccion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getAlias() {
        return alias;
    }

    public String getContra() {
        return contra;
    }


}
