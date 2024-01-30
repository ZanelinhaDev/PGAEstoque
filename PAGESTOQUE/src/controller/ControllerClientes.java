/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.DaoCliente;
import java.util.ArrayList;
import model.ModelClientes;

/**
 *
 * @author Usuario
 */
public class ControllerClientes {
    
    private DaoCliente daoCliente = new DaoCliente();
    /*
    Salvar clientes controller
    */
    public int salvarClienteController(ModelClientes pModelClientes){
        return this.daoCliente.salvarClienteDAO(pModelClientes);
           
    }
    /*
    exlcuir um cliente pelo codigo
    */
    public boolean excluirClienteController(int pCodigo){
        return this.daoCliente.excluirClienteDAO(pCodigo);
        
    }
    
    /*
    Alterar um cliente 
    */
    public boolean alterarClienteController(ModelClientes pModelClientes){
        return this.daoCliente.alterarClienteDAO(pModelClientes);
        
    }
    /*
    Retornar cliente pelo codigo
    */
    public ModelClientes retornarClienteController(int pCodigo){
        return this.daoCliente.retornarClienteDAO(pCodigo);
    }
  
    public ModelClientes retornarClientesNomeController(String pNomeCliente){
        return this.daoCliente.retornarClienteNomeDAO(pNomeCliente);
    }
  
    /*
    Retornar lista de cliente
    */
    public ArrayList<ModelClientes> retornarListaClienteController(){
        return this.daoCliente.retornarListaClientesDAO();
    }
    
}

    

