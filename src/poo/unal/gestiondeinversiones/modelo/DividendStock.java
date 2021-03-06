/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unal.gestiondeinversiones.modelo;

/**
 *
 * @author Juan_Ardila
 */
public class DividendStock extends Stock{
    private double dividens;

    public DividendStock(double dividens, String symbol, double totalCost, double currentPrice, double totalShares) {
        super(symbol, totalCost, currentPrice, totalShares);
        this.dividens = dividens;
    }

    @Override
    public double getMarketvalue() {
        return super.getMarketvalue()+this.dividens; 
    }

    public double getDividens() {
        return dividens;
    }

    public void setDividens(double dividens) {
        this.dividens = dividens;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(double totalShares) {
        this.totalShares = totalShares;
    }
    
    
    
}
