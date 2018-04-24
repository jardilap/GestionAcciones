/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unal.gestiondeinversiones.vistas;
import poo.unal.gestiondeinversiones.modelo.*;

/**
 *
 * @author Juan_Ardila
 */
public class GestionDeInversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de la compania
        Company compa = new Company("Ariel");
        
        //Creacion clientes
        Persona p1 = new Persona("Juan", "Lopez", "jardilap@unal.edu.co", "3107654567", 21, "1234567890");
        Persona p2 = new Persona("Juanito", "Anchoa", "jarap@unal.edu.co", "3109854567", 78, "1019147372");
        Persona p3 = new Persona("Diego", "Costa", "dcosta@unal.edu.co", "3126787654", 18, "7362516278");
        Persona p4 = new Persona("Ousmane", "Dembele", "odembele@unal.edu.co", "3207657423", 20, "17658764325");
        Persona p5 = new Persona("Fidel", "Escobar", "fescobar@unal.edu.co", "3158765432", 19, "1019654876");
        Persona p6 = new Persona("Robert", "Lewandowski", "rlewandowski@unal.edu.co", "3147619283", 49, "1020654827");
        
        //Creacion assets
        
        Stock s1 = new Stock("Stock1", 3000, 1000, 5);
        Stock s2 = new Stock("Stock2", 4000, 1100, 4);
        Stock s3 = new Stock("Stock3", 5000, 1200, 3);
        Stock s4 = new Stock("Stock4", 6000, 1300, 2);
        Stock s5 = new Stock("Stock5", 7000, 1400, 1);
        Stock s6 = new Stock("Stock6", 8000, 1500, 7);
        
        DividendStock d1 = new DividendStock(4, "DStock1", 4000, 1200, 3);
        DividendStock d2 = new DividendStock(5, "DStock2", 5000, 1500, 4);
        DividendStock d3 = new DividendStock(6, "DStock3", 6000, 1600, 5);
        DividendStock d4 = new DividendStock(7, "DStock4", 7000, 1700, 6);
        DividendStock d5 = new DividendStock(8, "DStock5", 8000, 2100, 7);
        DividendStock d6 = new DividendStock(9, "DStock6", 9000, 2400, 8);
        
        MutualFund m1 = new MutualFund("Mutual1", 10000, 3000, 3);
        MutualFund m2 = new MutualFund("Mutual2", 11000, 4000, 2);
        MutualFund m3 = new MutualFund("Mutual3", 12000, 5000, 1);
        MutualFund m4 = new MutualFund("Mutual4", 13000, 6000, 6);
        MutualFund m5 = new MutualFund("Mutual5", 14000, 7000, 7);
        MutualFund m6 = new MutualFund("Mutual6", 15000, 8000, 4);
        
        Cash c1 = new Cash(30000);
        Cash c2 = new Cash(40000);
        Cash c3 = new Cash(50000);
        Cash c4 = new Cash(60000);
        Cash c5 = new Cash(70000);
        Cash c6 = new Cash(80000);
        Cash c7 = new Cash(90000);
        
        
        //Adicionar assets a los clientes
        p1.addAsset(s1);
        p1.addAsset(d1);
        p1.addAsset(m1);
        p1.addAsset(c1);
        
        p2.addAsset(s2);
        p2.addAsset(d2);
        p2.addAsset(m2);
        p2.addAsset(c2);
        
        p3.addAsset(s3);
        p3.addAsset(d3);
        p3.addAsset(m3);
        p3.addAsset(c3);
        
        p4.addAsset(s4);
        p4.addAsset(d4);
        p4.addAsset(m4);
        p4.addAsset(c4);
        
        p5.addAsset(s5);
        p5.addAsset(d5);
        p5.addAsset(m5);
        p5.addAsset(c5);
        
        p6.addAsset(s6);
        p6.addAsset(d6);
        p6.addAsset(m6);
        p6.addAsset(c6);
        p6.addAsset(c7);
        
        //Adicionar clientes a empresa
        
        compa.addCliente(p6);
        compa.addCliente(p5);
        compa.addCliente(p4);
        compa.addCliente(p3);
        compa.addCliente(p2);
        compa.addCliente(p1);
        
        
        //Metodos
        
        System.out.println("Valor total: " + compa.valorTotal());
        System.out.println("Valor total Cash: " + compa.valorCashValue());
        System.out.println("Valor total MutualFund: " + compa.valorMutualValue());
        System.out.println("Valor total DividendStock: " + compa.valorDividendValue());
        System.out.println("Valor total Stock: " + compa.valorStockValue());
        System.out.println("Beneficio total Cash: " + compa.valorCashProfit());
        System.out.println("Beneficio total MutualFund: " + compa.valorMutualProfit());
        System.out.println("Beneficio total DividendStock: " + compa.valorDividendProfit());
        System.out.println("Beneficio total Stock: " + compa.valorStockProfit());
        System.out.println("Beneficio total: " + compa.beneficioTotal());
        System.out.println("Valor total 0-20: " + compa.valorTotalJoven());
        System.out.println("Valor total 20-40: " + compa.valorTotalAdulto());
        System.out.println("Valor total 40-: " + compa.valorTotalAnciano());
        System.out.println("Beneficio total 0-20: " + compa.beneficioTotalJoven());
        System.out.println("Beneficio total 20-40: " + compa.beneficioTotalAdulto());
        System.out.println("Beneficio total 40-: " + compa.beneficioTotalAnciano());
        System.out.println("Cliente mayores beneficios: " + compa.mayoresBeneficios());
        System.out.println("Listado:");
        compa.ListadoCLientes();
        
        
        
        
    }
    
}
