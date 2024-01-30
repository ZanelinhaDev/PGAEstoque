/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelVendas;

/**
 *
 * @author Usuario
 */

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class DaoVendas extends Conexao {
    
/*Cadastrar uma venda no banco*/
public int salvarVendasDAO(ModelVendas pModelVendas) {
    try {
        this.conectar();
        String query = "INSERT INTO tbl_vendas (fk_cliente, "
                + "ven_data_venda, "
                + "ven_valor, "
                + "ven_valor_liquido, "
                + "ven_valor_desconto"
                + ") VALUES ("
                + "?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.getCon().prepareStatement(query);
        preparedStatement.setInt(1, pModelVendas.getVenda_cliente());
        preparedStatement.setDate(2, pModelVendas.getVenDataVenda());
        preparedStatement.setDouble(3, pModelVendas.getVenValorBruto());
        preparedStatement.setDouble(4, pModelVendas.getVenValorLiquido());
        preparedStatement.setDouble(5, pModelVendas.getVenDesconto());

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
public boolean excluirVendaDAO(int pidVendas) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas WHERE pk_id_vendas = " + pidVendas
        );
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }finally{
        this.fecharConexao();
    }
}

/*Alterar dados da venda*/
public boolean alterarVendaDAO(ModelVendas pModelVendas) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
            "UPDATE tbl_vendas SET " +
            "fk_cliente = '" + pModelVendas.getVenda_cliente()+ "', " +
            "ven_data_venda = '" + pModelVendas.getVenDataVenda()+ "', " +
            "ven_valor = '" + pModelVendas.getVenValorBruto()+ "', " +        
            "ven_valor_liquido = '" + pModelVendas.getVenValorLiquido()+ "', " +
            "ven_valor_desconto = '" + pModelVendas.getVenDesconto()+ "' " +
            "WHERE pk_id_vendas = " + pModelVendas.getIdVenda()
        );
    } catch (Exception e) {
        return false;
    }
}

/*Retornar uma venda pelo código*/
public ModelVendas retornarVendaDAO(int pIdVenda) {
    ModelVendas modelVendas = new ModelVendas();
    try {
        this.conectar();
        this.executarSQL("SELECT "
                + "pk_id_vendas, "
                + "fk_cliente, "
                + "ven_data_venda, "
                + "ven_valor, "
                + "ven_valor_liquido, "
                + "ven_valor_desconto "
                + "FROM tbl_vendas WHERE pk_id_vendas = '" + pIdVenda + "'");
        while (this.getResultSet().next()) {
            modelVendas.setIdVenda(this.getResultSet().getInt(1));
            modelVendas.setVenda_cliente( this.getResultSet().getInt(2));
            modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
            modelVendas.setVenValorBruto(this.getResultSet().getDouble(4));
            modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
            modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
        }
    } catch (Exception e) {
        
    }finally{
        this.fecharConexao();
    }
    return modelVendas;
}

/*Retornar uma lista completa de vendas*/
public ArrayList<ModelVendas> retornarListaVendasDAO() {
ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
ModelVendas modelVendas = new ModelVendas();
try {
    this.conectar();
    this.executarSQL("SELECT "
                + "pk_id_vendas, "
                + "fk_cliente, "
                + "ven_data_venda, "
                + "ven_valor, "
                + "ven_valor_liquido, "
                + "ven_valor_desconto "
                + "FROM tbl_Vendas;");
    while (this.getResultSet().next()) {
        modelVendas = new ModelVendas();
        modelVendas.setIdVenda(this.getResultSet().getInt(1));
            modelVendas.setVenda_cliente( this.getResultSet().getInt(2));
            modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
            modelVendas.setVenValorBruto(this.getResultSet().getDouble(4));
            modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
            modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
        listaModelVendas.add(modelVendas);
    }
    
    }catch(Exception e) {
        e.printStackTrace();
    }finally{
        this.fecharConexao();
    }
    return listaModelVendas;
    }
}