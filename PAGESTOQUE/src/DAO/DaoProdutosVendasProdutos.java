/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author Usuario
 */
public class DaoProdutosVendasProdutos extends Conexao {
    
    public ArrayList<ModelProdutosVendasProdutos> ListaProdutosVendasProdutosDao (int pCodigoVenda){
      ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
      ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
      ModelProdutos modelProdutos = new ModelProdutos();
      ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
      
        try {
            this.conectar();
            this.executarSQL("SELECT produto.ID_Produto, "
                    + "produto.quantidadeAdquirida, "
                    + "produto.nomeProduto, "
                    + "produto.precoVenda, "
                    + "tbl_vendas_produtos.fk_produto, "
                    + "tbl_vendas_produtos.fk_vendas, "
                    + "tbl_vendas_produtos.pk_id_venda_produto, "
                    + "tbl_vendas_produtos.ven_pro_quantidade, "
                    + "tbl_vendas_produtos.ven_pro_valor "
                    + "FROM tbl_vendas_produtos "
                    + "INNER JOIN produto ON produto.ID_Produto = tbl_vendas_produtos.fk_produto "
                    + "WHERE tbl_vendas_produtos.fk_vendas = '" + pCodigoVenda + "';");
            
            while (this.getResultSet().next()){
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();
                
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProQuantidade(this.getResultSet().getDouble(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProPrecoVenda(this.getResultSet().getDouble(4));
                
               modelVendasProdutos.setProduto(this.getResultSet().getInt(5));
               modelVendasProdutos.setVendas(this.getResultSet().getInt(6));
               modelVendasProdutos.setIdvenda_produto(this.getResultSet().getInt(7));
               modelVendasProdutos.setVen_pro_quantidade(this.getResultSet().getInt(8));
               modelVendasProdutos.setVen_pro_valor(this.getResultSet().getInt(9));
               
               modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
               modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);
               
               listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
      return listaModelProdutosVendasProdutos;
    }
    
    
    
}