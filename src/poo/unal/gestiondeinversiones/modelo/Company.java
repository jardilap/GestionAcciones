/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unal.gestiondeinversiones.modelo;
import java.util.*;

/**
 *
 * @author Juan_Ardila
 */
public class Company {
    private ArrayList<Persona> clientes;
    private String NombreCompany;

    public Company(String NombreCompany) {
        this.NombreCompany = NombreCompany;
    }
    
    public boolean addCliente(Persona c){
        if(c!=null)
            return this.clientes.add(c);
        else
            return false;
        
    }
    
    public double valorTotal(){
        try{
            double valor = 0.0;
            for (Persona cliente : clientes) {
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getMarketvalue();
                }
            }
            return valor;
        }catch(NullPointerException e){
            return 0.0;
        }
    }
    
    public double beneficioTotal(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            for(Asset acciones :cliente.getAssets()){
                valor += acciones.getProfit();
            }
        }
        return valor;
    }
    
    public double valorTotalJoven(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            if(cliente.getEdad()<20){
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getMarketvalue();
                }
            }
        }
        return valor;
    }
    
    public double beneficioTotalJoven(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            if(cliente.getEdad()<20){    
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getProfit();
                }
            }
        }
        return valor;
    }
    
    public double valorTotalAdulto(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            if(cliente.getEdad()>=20 && cliente.getEdad()<40){
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getMarketvalue();
                }
            }
        }
        return valor;
    }
    
    public double beneficioTotalAdulto(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            if(cliente.getEdad()>=20 && cliente.getEdad()<40){    
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getProfit();
                }
            }
        }
        return valor;
    }
    
    public double valorTotalAnciano(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            if(cliente.getEdad()>=40){
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getMarketvalue();
                }
            }
        }
        return valor;
    }
    
    public double beneficioTotalAnciano(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            if(cliente.getEdad()>=40){    
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getProfit();
                }
            }
        }
        return valor;
    }
    
    public Persona mayoresBeneficios(){
        Persona persona = null;
        double valor = 0.0;
        double valor2 = 0.0;
        for (Persona cliente : clientes) {
                for(Asset acciones :cliente.getAssets()){
                    valor += acciones.getProfit();
                }
                if(valor2<valor){
                    valor2 = valor;
                    persona = cliente;
                }
                valor = 0.0;
            
        }
        return persona;
    }
    
    public void ListadoCLientes(){
        double valor;
        for (Persona cliente : clientes) {
            valor = 0.0;
            for(Asset acciones :cliente.getAssets()){
                valor += acciones.getMarketvalue();
            }
            System.out.println(cliente.getNombre() + "; " +
                    cliente.getApellido() + "; " + valor);
        }
    }
    
    public double valorCashValue(){
        try{
            double valor = 0.0;
            for (Persona cliente : clientes) {
                for(Cash acciones :cliente.getCash()){
                    valor += acciones.getMarketvalue();
                }
            }
            return valor;
        }catch(NullPointerException e){
            return 0.0;
        }
    }
    
    public double valorCashProfit(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            for(Cash acciones :cliente.getCash()){
                valor += acciones.getProfit();
            }
        }
        return valor;
    }
    
    public double valorMutualValue(){
        try{
            double valor = 0.0;
            for (Persona cliente : clientes) {
                for(MutualFund acciones :cliente.getMutual()){
                    valor += acciones.getMarketvalue();
                }
            }
            return valor;
        }catch(NullPointerException e){
            return 0.0;
        }
    }
    
    public double valorMutualProfit(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            for(MutualFund acciones :cliente.getMutual()){
                valor += acciones.getProfit();
            }
        }
        return valor;
    }
    
    public double valorDividendValue(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            for(DividendStock acciones :cliente.getDividendos()){
                valor += acciones.getMarketvalue();
            }
        }
        return valor;
    }
    
    public double valorDividendProfit(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            for(DividendStock acciones :cliente.getDividendos()){
                valor += acciones.getProfit();
            }
        }
        return valor;
    }
    
    public double valorStockValue(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            for(Stock acciones :cliente.getAccion()){
                valor += acciones.getMarketvalue();
            }
        }
        return valor;
    }
    
    public double valorStockProfit(){
        double valor = 0.0;
        for (Persona cliente : clientes) {
            for(Stock acciones :cliente.getAccion()){
                valor += acciones.getProfit();
            }
        }
        return valor;
    }
    
}
