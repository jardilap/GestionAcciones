/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unal.gestiondeinversiones.modelo;

import java.util.*;
import java.lang.*;

/**
 *
 * @author Juan_Ardila
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private int edad;
    private String cedula;
    private ArrayList<Asset> activos;
    private ArrayList<Cash> cash;
    private ArrayList<DividendStock> dividendos;
    private ArrayList<MutualFund> mutual;
    private ArrayList<Stock> accion;
    

    public Persona(String nombre, String apellido, String email, String telefono, int edad, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.cedula = cedula;
    }
    
    public boolean addAsset (Asset a){
        
            if(a!=null){
                if(activos.size()<10){
                activos.add(a);
                return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        
    }
    
    public ArrayList<Asset> getAssets(){
        return activos;
    }

    public ArrayList<Cash> getCash() {
        return cash;
    }

    public ArrayList<DividendStock> getDividendos() {
        return dividendos;
    }

    public ArrayList<MutualFund> getMutual() {
        return mutual;
    }

    public ArrayList<Stock> getAccion() {
        return accion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
}
