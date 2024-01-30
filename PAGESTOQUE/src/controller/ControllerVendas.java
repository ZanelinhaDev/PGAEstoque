/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import DAO.DaoVendas;
import java.util.ArrayList;
import model.ModelVendas;

/**
 *
 * @author Usuario
 */
public class ControllerVendas {
    
    private DaoVendas daoVendas = new DaoVendas();
    /*
    Salvar vendas controller
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
           
    }
    /*
    exlcuir uma venda pelo codigo
    */
    public boolean excluirVendaController(int pidVendas){
        return this.daoVendas.excluirVendaDAO(pidVendas);
        
    }
    
    /*
    Alterar uma venda  
    */
    public boolean alterarVendaController(ModelVendas pModelVendas){
        return this.daoVendas.alterarVendaDAO(pModelVendas);
        
    }
    /*
    Retornar venda pelo codigo
    */
    public ModelVendas retornarVendaController(int pidVendas){
        return this.daoVendas.retornarVendaDAO(pidVendas);
    }
  
    /*
    Retornar lista de Vendas
    */
    public ArrayList<ModelVendas> retornarListaVendaController(){
        return this.daoVendas.retornarListaVendasDAO();
    }
  
    
}

    