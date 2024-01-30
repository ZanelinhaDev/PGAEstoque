/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelVendasProdutos;


public class DaoVendasProdutos extends Conexao {
    
/*Cadastrar uma venda no banco*/
public int salvarVendasProdDAO(ModelVendasProdutos pModelVendasProd){
    try {
        this.conectar();
        String query = "INSERT INTO tbl_vendas_produtos (fk_produto, "
                + "fk_vendas, "
                + "ven_pro_valor, "
                + "ven_pro_quantidade "
                + ") VALUES ("
                + "?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.getCon().prepareStatement(query);
        preparedStatement.setInt(1, pModelVendasProd.getProduto());
        preparedStatement.setInt(2, pModelVendasProd.getVendas());
        preparedStatement.setDouble(3, pModelVendasProd.getVen_pro_valor());
        preparedStatement.setInt(4, pModelVendasProd.getVen_pro_quantidade());

        int rowsInserted = preparedStatement.executeUpdate();
        return rowsInserted;
    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
    } finally {
        this.fecharConexao();
    }
}

    
/*Excluir uma venda do banco*/
public boolean excluirVendaProdDAO(int pidVendasProd) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas_produtos WHERE fk_vendas = " + pidVendasProd
        );
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }finally{
        this.fecharConexao();
    }
}

/*Alterar dados da venda*/
public boolean alterarVendaProdDAO(ModelVendasProdutos pModelVendasProd) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
            "UPDATE tbl_vendas_produtos SET " +
            "fk_produto = '" + pModelVendasProd.getProduto()+ "', " +
            "fk_vendas = '" + pModelVendasProd.getVendas()+ "', " +
            "ven_pro_valor = '" + pModelVendasProd.getVen_pro_valor()+ "', " +        
            "ven_pro_quantidade = '" + pModelVendasProd.getVen_pro_quantidade()+ "' " +
            "WHERE pk_id_venda_produto = " + pModelVendasProd.getIdvenda_produto()
        );
    } catch (Exception e) {
        return false;
    }
}

/*Retornar uma venda pelo código*/
public ModelVendasProdutos retornarVendaProdDAO(int pIdVendaProd) {
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    try {
        this.conectar();
        this.executarSQL("SELECT "
                + "pk_id_venda_produto, "
                + "fk_produto, "
                + "fk_vendas, "
                + "ven_pro_valor, "
                + "ven_pro_quantidade "
                + "FROM tbl_vendas_produtos WHERE pk_id_venda_produto = '" + pIdVendaProd + "'");
        while (this.getResultSet().next()) {
            modelVendasProdutos.setIdvenda_produto(this.getResultSet().getInt(1));
            modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
            modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
            modelVendasProdutos.setVen_pro_valor(this.getResultSet().getDouble(4));
            modelVendasProdutos.setVen_pro_quantidade(this.getResultSet().getInt(5));
        }
    } catch (Exception e) {
        
    }finally{
        this.fecharConexao();
    }
    return modelVendasProdutos;
}

/*Retornar uma lista completa de vendas*/
public ArrayList<ModelVendasProdutos> retornarListaVendasProdDAO() {
ArrayList<ModelVendasProdutos> listaModelVendasProd = new ArrayList<>();
ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
try {
    this.conectar();
    this.executarSQL("SELECT "
                + "pk_id_venda_produto, "
                + "fk_produto, "
                + "fk_vendas, "
                + "ven_pro_valor, "
                + "ven_pro_quantidade "
                + "FROM tbl_vendas_produtos;");
    while (this.getResultSet().next()) {
        modelVendasProdutos = new ModelVendasProdutos();
        modelVendasProdutos.setIdvenda_produto(this.getResultSet().getInt(1));
            modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
            modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
            modelVendasProdutos.setVen_pro_valor(this.getResultSet().getDouble(4));
            modelVendasProdutos.setVen_pro_quantidade(this.getResultSet().getInt(5));
        listaModelVendasProd.add(modelVendasProdutos);
    }
    
    }catch(Exception e) {
        e.printStackTrace();
    }finally{
        this.fecharConexao();
    }
    return listaModelVendasProd;
    }

public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
    try {
        this.conectar();
        int cont = pListaModelVendasProdutos.size();

        for (int i = 0; i < cont; i++) {
            String query = "INSERT INTO tbl_vendas_produtos ("
                    + "fk_vendas, "
                    + "ven_pro_valor, "
                    + "ven_pro_quantidade"
                    + ") VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = this.getCon().prepareStatement(query);
            preparedStatement.setInt(1, pListaModelVendasProdutos.get(i).getVendas());
            preparedStatement.setDouble(2, pListaModelVendasProdutos.get(i).getVen_pro_valor());
            preparedStatement.setInt(3, pListaModelVendasProdutos.get(i).getVen_pro_quantidade());

            preparedStatement.executeUpdate();
            preparedStatement.close(); 
        }

        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        
    }
}

}











    
    
    
    