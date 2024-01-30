/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoFornecedor;
import java.util.ArrayList;
import model.ModelFornecedor;

/**
 *
 * @author Zanela 
 */
public class ControllerFornecedor {
    
    
    private DaoFornecedor daoFornecedor = new DaoFornecedor();
    /*
    Salvar fornecedor controller
    */
    public boolean salvarFornecedorController(ModelFornecedor fModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(fModelFornecedor);
           
    }
    /*
    exlcuir um fornecedor pelo codigo
    */
    public boolean excluirFornecedorController(int fCodigo){
        return this.daoFornecedor.excluirFornecedorDAO(fCodigo);
        
    }
    
    /*
    Alterar um fornecedor 
    */
    public boolean alterarFornecedorController(ModelFornecedor fModelFornecedor){
        return this.daoFornecedor.alterarFornecedorDAO(fModelFornecedor);
        
    }
    /*
    Retornar fornecedor pelo codigo
    */
    public ModelFornecedor retornarFornecedorController(int fCodigo){
        return this.daoFornecedor.retornarFornecedorDAO(fCodigo);
    }
  
    public ModelFornecedor retornarFornecedorPeloNomeController(String nomeFornecedor){
        return this.daoFornecedor.retornarFornecedorPeloNomeDAO(nomeFornecedor);
    }
  
    /*
    Retornar lista de fornecedor
    */
    public ArrayList<ModelFornecedor> retornarListaFornecedorController(){
        return this.daoFornecedor.retornarListaFornecedorDAO();
    }
    
    }


