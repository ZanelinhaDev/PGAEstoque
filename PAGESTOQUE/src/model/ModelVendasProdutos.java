/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class ModelVendasProdutos {
  private int Idvenda_produto;
  private int Produto;
  private int Vendas;
  private double ven_pro_valor;
  private int ven_pro_quantidade;

    public ModelVendasProdutos() {
    }
  
    public int getIdvenda_produto() {
        return Idvenda_produto;
    }

    public void setIdvenda_produto(int Idvenda_produto) {
        this.Idvenda_produto = Idvenda_produto;
    }

    public int getProduto() {
        return Produto;
    }

    public void setProduto(int Produto) {
        this.Produto = Produto;
    }

    public int getVendas() {
        return Vendas;
    }

    public void setVendas(int Vendas) {
        this.Vendas = Vendas;
    }

    public double getVen_pro_valor() {
        return ven_pro_valor;
    }

    public void setVen_pro_valor(double ven_pro_valor) {
        this.ven_pro_valor = ven_pro_valor;
    }

    public int getVen_pro_quantidade() {
        return ven_pro_quantidade;
    }

    public void setVen_pro_quantidade(int ven_pro_quantidade) {
        this.ven_pro_quantidade = ven_pro_quantidade;
    }
  
  
}