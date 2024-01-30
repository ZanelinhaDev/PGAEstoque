/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.DaoVendasProdutos;
import java.util.ArrayList;
import model.ModelVendasProdutos;
/**
 *
 * @author Usuario
 */
public class ControllerVendasProdutos {


    
    private DaoVendasProdutos daoVendasProdutos = new DaoVendasProdutos();
    /*
    Salvar vendas de produtos controller
    */
    public int salvarVendasProdController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdDAO(pModelVendasProdutos);
           
    }
    /*
    exlcuir uma venda de produto pelo codigo
    */
    public boolean excluirVendaProdController(int pidVendasProd){
        return this.daoVendasProdutos.excluirVendaProdDAO(pidVendasProd);
        
    }
    
    /*
    Alterar uma venda  
    */
    public boolean alterarVendaProdController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.alterarVendaProdDAO(pModelVendasProdutos);
        
    }
    /*
    Retornar venda pelo codigo
    */
    public ModelVendasProdutos retornarVendaProdController(int pIdVendaProd){
        return this.daoVendasProdutos.retornarVendaProdDAO(pIdVendaProd);
    }
  
    /*
    Retornar lista de Vendas
    */
    public ArrayList<ModelVendasProdutos> retornarListaVendaProdController(){
        return this.daoVendasProdutos.retornarListaVendasProdDAO();
    }

    public boolean salvarVendasProdutoController(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(plistaModelVendasProdutos);
    }
  
    
}

    