/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unal.gestiondeinversiones.vistas;
import java.util.Scanner;
import poo.unal.gestiondeinversiones.modelo.*;

/**
 *
 * @author Juan_Ardila
 */
public class GestionDeInversiones {
    
    public static int seleccionarOpcion(){
       Scanner teclado = new Scanner(System.in);
       int opcion = -1; 
       System.out.println("Presione: \n");
       System.out.println(""
               + "1. Ingresar Cliente\n"
               + "2. Ingresar Stock\n"
               + "3. Ingresar MutualFund\n"
               + "4. Ingresar DividendStock\n"
               + "5. Ingresar Cash\n"
               + "6. Valor total\n"
               + "7. Valor total Cash\n"
               + "8. Valor total MutualFund\n"
               + "9. Valor total DividendStock\n"
               + "10. Valor total Stock\n"
               + "11. Beneficio total Cash\n"
               + "12. beneficio total MutualFund\n"
               + "13. Beneficio total DividendDStock\n"
               + "14. Beneficio total Stock\n"
               + "15. Beneficio total\n"
               + "16. Valor total 0-20\n"
               + "17. Valor total 20-40\n"
               + "18. Valor total 40 o mas\n"
               + "19. Beneficio total 0-20\n"
               + "20. Beneficio total 20-40\n"
               + "21. Beneficio total 40 o mas\n"
               + "22. Clientes con mayores beneficios\n"
               + "23. Listado Clientes\n"
               + "24. Salir\n");
       opcion = teclado.nextInt();
       return opcion;  
    }
    public static int seleccionarOpcionCliente(Company compa){
       Scanner teclado = new Scanner(System.in);
       int opcion = -1; 
        System.out.println("Seleccione cliente:\n");
       for(int i = 0; i<compa.getClientes().size();i++){
            if(compa.getClientes().get(i)!=null)
                System.out.println(i+ ". " + compa.getClientes().get(i).getNombre() + "\n");
       }
       
       opcion = teclado.nextInt();
       return opcion;  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de la compania
        
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Company compa = new Company("Ariel");
        do{
            opcion=seleccionarOpcion();
            switch(opcion){
                case 1:
                    //Creacion clientes
                    System.out.print("Ingresa nombre del cliente:\n");
                    String nombreCliente = teclado.nextLine();
                    System.out.print("Ingresa apellido del cliente:\n");
                    String apellidoCliente = teclado.nextLine();
                    System.out.print("Ingresa email del cliente:\n");
                    String email = teclado.nextLine();
                    System.out.print("Ingresa telefono del cliente:\n");
                    String telefono = teclado.nextLine();
                    System.out.print("Ingresa edad del cliente:\n");
                    int edad = teclado.nextInt();
                    System.out.print("Ingresa cedula del cliente:\n");
                    String cedula = teclado.next();
                    Persona p1 = new Persona(nombreCliente, apellidoCliente, email, telefono, edad, cedula);
                    compa.addCliente(p1);
                    System.out.println("¡Cliente creado con exito!");
                    break;
                case 2:
                    //Ingresar Stock
                    System.out.print("Ingrese simbolo de la accion:\n");
                    String symbol = teclado.next();
                    System.out.print("Ingrese Costo total:\n");
                    double totalCost = teclado.nextDouble();
                    System.out.print("Ingrese precio actual:\n");
                    double currentPrice = teclado.nextDouble();
                    System.out.print("Ingrese total shares:\n");
                    double totalShares = teclado.nextDouble();
                    Stock si = new Stock(symbol, totalCost, currentPrice, totalShares);
                    int intCliente;
                    intCliente = seleccionarOpcionCliente(compa);
                    compa.getClientes().get(intCliente).addAsset(si);
                    
                    break;
                case 3:
                    //Ingresar MutualFund
                    System.out.print("Ingrese simbolo de la accion:\n");
                    String symbolM = teclado.next();
                    System.out.print("Ingrese Costo total:\n");
                    double totalCostM = teclado.nextDouble();
                    System.out.print("Ingrese precio actual:\n");
                    double currentPriceM = teclado.nextDouble();
                    System.out.print("Ingrese total shares:\n");
                    double totalSharesM = teclado.nextDouble();
                    MutualFund mi = new MutualFund(symbolM, totalCostM, currentPriceM, totalSharesM);
                    int intCliente2;
                    intCliente2 = seleccionarOpcionCliente(compa);
                    compa.getClientes().get(intCliente2).addAsset(mi);
                    
                    break;
                case 4:
                    //Ingresar DividendStock
                    System.out.print("Ingrese simbolo de la accion:\n");
                    String symbolD = teclado.next();
                    System.out.print("Ingrese Costo total:\n");
                    double totalCostD = teclado.nextDouble();
                    System.out.print("Ingrese precio actual:\n");
                    double currentPriceD = teclado.nextDouble();
                    System.out.print("Ingrese total shares:\n");
                    double totalSharesD = teclado.nextDouble();
                    System.out.print("Ingrese dividendos:\n");
                    double dividens = teclado.nextDouble();
                    DividendStock di = new DividendStock(dividens, symbolD, totalCostD, currentPriceD, totalSharesD);
                    int intCliente3;
                    intCliente3 = seleccionarOpcionCliente(compa);
                    compa.getClientes().get(intCliente3).addAsset(di);
                    
                    break;
                case 5:
                    //Ingresar Cash
                    System.out.print("Ingrese monto:\n");
                    double amount = teclado.nextDouble();
                    Cash ci = new Cash(amount);
                    int intCliente4;
                    intCliente4 = seleccionarOpcionCliente(compa);
                    compa.getClientes().get(intCliente4).addAsset(ci);
                    
                    break;
                case 6:
                    //Valor total
                    System.out.println("Valor total: " + compa.valorTotal());
        
                    
                    break;
                case 7:
                    //Valor total Cash
                    System.out.println("Valor total Cash: " + compa.valorCashValue());
        
                    break;
                case 8:
                    //Valor total MutualFund
                    System.out.println("Valor total MutualFund: " + compa.valorMutualValue());
        
                    break;
                case 9:
                    //Valor total DividendStock
                    System.out.println("Valor total DividendStock: " + compa.valorDividendValue());
        
                    break;
                case 10:
                    //Valor total Stock
                    System.out.println("Valor total Stock: " + compa.valorStockValue());
        
                    break;
                case 11:
                    //Beneficio total Cash
                    System.out.println("Beneficio total Cash: " + compa.valorCashProfit());
        
                    break;
                case 12:
                    //Beneficio total MutualFund
                    System.out.println("Beneficio total MutualFund: " + compa.valorMutualProfit());
        
                    break;
                case 13:
                    //Beneficio total DividendStock
                    System.out.println("Beneficio total DividendStock: " + compa.valorDividendProfit());
        
                    break;
                case 14:
                    //Beneficio total Stock
                    System.out.println("Beneficio total Stock: " + compa.valorStockProfit());
        
                    break;
                case 15:
                    //Beneficio Total
                    System.out.println("Beneficio total: " + compa.beneficioTotal());
        
                    break;
                case 16:
                    //Valor total 0-20 años
                    System.out.println("Valor total 0-20: " + compa.valorTotalJoven());
        
                    break;
                case 17:
                    //Valor total 20-40 años
                    System.out.println("Valor total 20-40: " + compa.valorTotalAdulto());
        
                    break;
                case 18:
                    //Valor total 40 o más años
                    System.out.println("Valor total 40-: " + compa.valorTotalAnciano());
        
                    break;
                case 19:
                    //Beneficio total 0-20 años
                    System.out.println("Beneficio total 0-20: " + compa.beneficioTotalJoven());
        
                    break;
                case 20:
                    //Beneficio total 20-40 años
                    System.out.println("Beneficio total 20-40: " + compa.beneficioTotalAdulto());
        
                    break;
                case 21:
                    //beneficio total 40 o más años
                    System.out.println("Beneficio total 40-: " + compa.beneficioTotalAnciano());
        
                    break;
                case 22:
                    //Cliente mayores beneficios
                    System.out.println("Cliente mayores beneficios: "
                        + compa.mayoresBeneficios().getNombre() + " " 
                        + compa.mayoresBeneficios().getApellido() + " con cedula: " 
                        + compa.mayoresBeneficios().getCedula());
        
                    break;
                case 23:
                    //Listado Clientes
                    System.out.println("Listado clientes:");
                    compa.ListadoCLientes();
                    break;
                default:
                    break;
            }
        }while(opcion!=24);
        /*
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
        System.out.println("Cliente mayores beneficios: "
                + compa.mayoresBeneficios().getNombre() + " " 
                + compa.mayoresBeneficios().getApellido() + " con cedula: " 
                + compa.mayoresBeneficios().getCedula());
        System.out.println("Listado:");
        compa.ListadoCLientes();
        */
        
        
        
        
    }
    
}
