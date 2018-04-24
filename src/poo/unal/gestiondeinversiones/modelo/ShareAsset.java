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
public abstract class ShareAsset implements Asset{
    
    protected String symbol;
    protected double totalCost;
    protected double currentPrice;
    protected double totalShares;

    public ShareAsset(String symbol, double totalCost, double currentPrice, double totalShares) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
        this.totalShares = totalShares;
    }

    @Override
    public double getMarketvalue() {
        return totalShares*currentPrice;
    }

    @Override
    public double getProfit() {
        return totalShares*currentPrice-totalCost;
    }
    
}
