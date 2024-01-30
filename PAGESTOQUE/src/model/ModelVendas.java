/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
/**
 *
 * @author Usuario
 */
public class ModelVendas {
    private int idVenda;
    private int venda_cliente;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;

    public ModelVendas() {
    }

    
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getVenda_cliente() {
        return venda_cliente;
    }

    public void setVenda_cliente(int venda_cliente) {
        this.venda_cliente = venda_cliente;
    }

    public double getVenValorLiquido() {
        return venValorLiquido;
    }

    public void setVenValorLiquido(double venValorLiquido) {
        this.venValorLiquido = venValorLiquido;
    }

    public double getVenValorBruto() {
        return venValorBruto;
    }

    public void setVenValorBruto(double venValorBruto) {
        this.venValorBruto = venValorBruto;
    }

    public double getVenDesconto() {
        return venDesconto;
    }

    public void setVenDesconto(double venDesconto) {
        this.venDesconto = venDesconto;
    }
    
     public Date getVenDataVenda() {
        return venDataVenda;
    }

    public void setVenDataVenda(Date venDataVenda) {
        this.venDataVenda = venDataVenda;
    }
}