/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;;

/**
 *
 * @author Usuario
 */
public class ControllerProdutos {
    
    private DaoProdutos daoProdutos = new DaoProdutos();
    /*
    Salvar produtos controller
    */
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
           
    }
    /*
    exlcuir um produto pelo codigo
    */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
        
    }
    
    /*
    Alterar um produto 
    */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
        
    }
    /*
    Retornar produto pelo codigo
    */
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
  
    /*
    Retornar lista de produtos
    */
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
    
    /*
    Retornar produto pelo nome em lista 
    */
   public ModelProdutos retornarProdutoPeloNomeController(String pnomeProduto) {
        return this.daoProdutos.retornarProdutoPeloNomeDAO(pnomeProduto);
    }

    
    public boolean alterarQuantidadeProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarQuantidadeProdutoDAO(pListaModelProdutos);
    }
    
}

    

