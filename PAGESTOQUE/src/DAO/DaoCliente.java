/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelClientes;
import java.sql.SQLException;
import java.sql.PreparedStatement;



/**
 *
 * @author Usuario
 */
public class DaoCliente extends Conexao {
    
    /*Cadastrar um cliente no banco*/
public int salvarClienteDAO(ModelClientes pModelClientes) {
    try {
        this.conectar();
        String query = "INSERT INTO cliente (nomeCliente, "
                + "email, "
                + "telefone, "
                + "cpf, "
                + "logradouro, "
                + "complemento, "
                + "bairro, "
                + "cidade, "
                + "uf, "
                + "cep"
                + ") VALUES ("
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.getCon().prepareStatement(query);
        preparedStatement.setString(1, pModelClientes.getCliNome());
        preparedStatement.setString(2, pModelClientes.getCliEmail());
        preparedStatement.setString(3, pModelClientes.getCliTelefone());
        preparedStatement.setString(4, pModelClientes.getCliCPF());
        preparedStatement.setString(5, pModelClientes.getCliLogradouro());
        preparedStatement.setString(6, pModelClientes.getCliComplemento());
        preparedStatement.setString(7, pModelClientes.getCliBairro());
        preparedStatement.setString(8, pModelClientes.getCliCidade());
        preparedStatement.setString(9, pModelClientes.getCliUF());
        preparedStatement.setString(10, pModelClientes.getCliCEP());
        
        int rowsInserted = preparedStatement.executeUpdate();

        return rowsInserted;

    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
    } finally {
        this.fecharConexao();
    }
}



/*Excluir um cliente do banco*/
public boolean excluirClienteDAO(int pIdCliente) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
                "DELETE FROM cliente WHERE ID_Cliente = " + pIdCliente
        );
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }finally{
        this.fecharConexao();
    }
}

/* Alterar dados do cliente */
public boolean alterarClienteDAO(ModelClientes pModelCliente) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
            "UPDATE cliente SET " +
            "nomeCliente = '" + pModelCliente.getCliNome() + "', " +
            "email = '" + pModelCliente.getCliEmail()+ "', " +
            "telefone = '" + pModelCliente.getCliEmail()+ "', " +
            "cpf = '" + pModelCliente.getCliEmail()+ "', " +        
            "logradouro = '" + pModelCliente.getCliEmail()+ "', " +
            "complemento = '" + pModelCliente.getCliEmail()+ "', " +       
            "bairro = '" + pModelCliente.getCliEmail()+ "', " +       
            "cidade = '" + pModelCliente.getCliEmail()+ "', " +       
            "uf = '" + pModelCliente.getCliEmail()+ "', " +       
            "cep = '" + pModelCliente.getCliEmail()+ "' " +      
            "WHERE ID_Cliente = " + pModelCliente.getIdCliente()
        );
    } catch (Exception e) {
        return false;
    }

}

/*Retornar um cliente pelo código*/
public ModelClientes retornarClienteDAO(int pIdCliente) {
    ModelClientes modelClientes = new ModelClientes();
    try {
        this.conectar();
        this.executarSQL("SELECT "
                + "ID_Cliente, "
                + "nomeCliente, "
                + "email, "
                + "telefone, "
                + "cpf, "
                + "logradouro, "
                + "complemento, "
                + "bairro, "
                + "cidade, "
                + "uf, "
                + "cep "
                + "FROM cliente WHERE ID_Cliente = '" + pIdCliente + "'");
        while (this.getResultSet().next()) {
            
            modelClientes.setIdCliente(this.getResultSet().getInt(1));
            modelClientes.setCliNome(this.getResultSet().getString(2));
            modelClientes.setCliEmail(this.getResultSet().getString(3));
            modelClientes.setCliTelefone(this.getResultSet().getString(4));
            modelClientes.setCliCPF(this.getResultSet().getString(5));
            modelClientes.setCliLogradouro(this.getResultSet().getString(6));
            modelClientes.setCliComplemento(this.getResultSet().getString(7));
            modelClientes.setCliBairro(this.getResultSet().getString(8));
            modelClientes.setCliCidade(this.getResultSet().getString(9));
            modelClientes.setCliUF(this.getResultSet().getString(10));
            modelClientes.setCliCEP(this.getResultSet().getString(11));
        }
    } catch (Exception e) {
       
    } finally {
        this.fecharConexao();
    }
    return modelClientes;
}
/*Retornar um cliente pelo código*/
public ModelClientes retornarClienteNomeDAO(String pNomeCliente) {
    ModelClientes modelClientes = new ModelClientes();
    try {
        this.conectar();
        this.executarSQL("SELECT "
                + "ID_Cliente, "
                + "nomeCliente, "
                + "email, "
                + "telefone, "
                + "cpf, "
                + "logradouro, "
                + "complemento, "
                + "bairro, "
                + "cidade, "
                + "uf, "
                + "cep "
                + "FROM cliente WHERE nomeCliente = '" + pNomeCliente + "'");
        while (this.getResultSet().next()) {
            
            modelClientes.setIdCliente(this.getResultSet().getInt(1));
            modelClientes.setCliNome(this.getResultSet().getString(2));
            modelClientes.setCliEmail(this.getResultSet().getString(3));
            modelClientes.setCliTelefone(this.getResultSet().getString(4));
            modelClientes.setCliCPF(this.getResultSet().getString(5));
            modelClientes.setCliLogradouro(this.getResultSet().getString(6));
            modelClientes.setCliComplemento(this.getResultSet().getString(7));
            modelClientes.setCliBairro(this.getResultSet().getString(8));
            modelClientes.setCliCidade(this.getResultSet().getString(9));
            modelClientes.setCliUF(this.getResultSet().getString(10));
            modelClientes.setCliCEP(this.getResultSet().getString(11));
        }
    } catch (Exception e) {
       
    } finally {
        this.fecharConexao();
    }
    return modelClientes;
}

/*Retornar uma lista completa de clientes*/
public ArrayList<ModelClientes> retornarListaClientesDAO() {
ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
ModelClientes modelClientes = new ModelClientes();
try {
    this.conectar();
    this.executarSQL("SELECT "
                + "ID_Cliente, "
                + "nomeCliente, "
                + "email, "
                + "telefone, "
                + "cpf, "
                + "logradouro, "
                + "complemento, "
                + "bairro, "
                + "cidade, "
                + "uf, "
                + "cep "
                + "FROM cliente;");
    while (this.getResultSet().next()) {
        modelClientes = new ModelClientes();
         modelClientes.setIdCliente(this.getResultSet().getInt(1));
            modelClientes.setCliNome(this.getResultSet().getString(2));
            modelClientes.setCliEmail(this.getResultSet().getString(3));
            modelClientes.setCliTelefone(this.getResultSet().getString(4));
            modelClientes.setCliCPF(this.getResultSet().getString(5));
            modelClientes.setCliLogradouro(this.getResultSet().getString(6));
            modelClientes.setCliComplemento(this.getResultSet().getString(7));
            modelClientes.setCliBairro(this.getResultSet().getString(8));
            modelClientes.setCliCidade(this.getResultSet().getString(9));
            modelClientes.setCliUF(this.getResultSet().getString(10));
            modelClientes.setCliCEP(this.getResultSet().getString(11));
        listaModelClientes.add(modelClientes);
    }
    
    }catch(Exception e) {
        e.printStackTrace();
    }finally{
        this.fecharConexao();
    }
    return listaModelClientes;
    }

}


