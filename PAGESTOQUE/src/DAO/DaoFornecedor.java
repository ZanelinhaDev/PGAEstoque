/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelFornecedor;



/**
 *
 * @author Anderson Zanela
 */
public class DaoFornecedor extends Conexao {
    
    /*Cadastrar um fornecedor no banco*/
public boolean salvarFornecedorDAO(ModelFornecedor fModelFornecedor) {
    try {
        this.conectar();
            return this.executarSQL("INSERT INTO fornecedor (" 
            + "nomeFantasia,"
            + "email,"
            + "razaoSocial,"
            + "inscricaoEstadual,"
            + "cnpj,"
            + "telefone,"
            + "logradouro,"
            + "complemento,"
            + "bairro, "
            + "cidade, "        
            + "uf, "
            + "cep "
            + ") VALUES ("
            + "'" + fModelFornecedor.getForNome()+ "' ,"
            + "'" + fModelFornecedor.getForEmail()+ "' ,"
            + "'" + fModelFornecedor.getForRazaoSocial()+ "' ,"        
            + "'" + fModelFornecedor.getInscricaoEstadual()+ "' ,"
            + "'" + fModelFornecedor.getForCNPJ() + "',"
            + "'" + fModelFornecedor.getForTelefone()+ "' ,"
            + "'" + fModelFornecedor.getForLogradouro()+ "' ,"    
            + "'" + fModelFornecedor.getForComplemento()+ "' ,"
            + "'" + fModelFornecedor.getForBairro()+ "' ,"
            + "'" + fModelFornecedor.getForCidade() + "' ,"
            + "'" + fModelFornecedor.getForUF()+ "' ,"
            + "'" + fModelFornecedor.getForCEP()+ "');");        
        
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    return false;
}



/*Excluir um fornecedor do banco*/
public boolean excluirFornecedorDAO(int fIdFornecedor) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
                "DELETE FROM cliente WHERE ID_Fornecedor = " + fIdFornecedor
        );
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }finally{
        this.fecharConexao();
    }
}

/*Alterar dados do fornecedor*/
public boolean alterarFornecedorDAO(ModelFornecedor fModelFornecedor) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
        "UPDATE fornecedor SET"
        + "nomeFantasia" + "'" + fModelFornecedor.getForNome()+ "' ,"
        + "email" + "'" + fModelFornecedor.getForEmail() + "' ,"
        + "razaoSocial" + "'" + fModelFornecedor.getForRazaoSocial()+ "' ,"        
        + "inscricaoEstadual" + "'" + fModelFornecedor.getInscricaoEstadual()+ "' ,"
        + "cnpj" + "'" + fModelFornecedor.getForCNPJ()+ "' ,"
        + "telefone" + "'" + fModelFornecedor.getForTelefone()+ "' ," 
        + "logradouro" + "'" + fModelFornecedor.getForLogradouro()+ "' ,"        
        + "complemento" + "'" + fModelFornecedor.getForComplemento()+ "' ,"
        + "bairro" + "'" + fModelFornecedor.getForBairro()+ "' ,"
        + "cidade" + "'" + fModelFornecedor.getForCidade()+ "' ,"
        + "uf" + "'" + fModelFornecedor.getForUF()+ "' ,"        
        + "cep" + "'" + fModelFornecedor.getForCEP()+ "'"
        + "WHERE Id_Fornecedor = '" + fModelFornecedor.getIdFornecedor() + "'");
    } catch (Exception e) {
        return false;
    }
}

/*Retornar um fornecedor pelo código*/
public ModelFornecedor retornarFornecedorDAO(int fIdFornecedor) {
    ModelFornecedor modelfornecedor = new ModelFornecedor();
    try {
        this.conectar();
        this.executarSQL("SELECT "
            + "ID_Fornecedor,"
            + "nomeFantasia,"
            + "email,"
            + "razaoSocial,"
            + "inscricaoEstadual,"
            + "cnpj,"
            + "telefone,"
            + "logradouro,"
            + "complemento,"
            + "bairro, "
            + "cidade, "        
            + "uf, "
            + "cep "
                + "FROM fornecedor WHERE ID_Fornecedor = '" + fIdFornecedor + "'");
        while (this.getResultSet().next()) {
            modelfornecedor.setIdFornecedor(this.getResultSet().getInt(1));
            modelfornecedor.setForNome(this.getResultSet().getString(2));
            modelfornecedor.setForEmail(this.getResultSet().getString(3));
            modelfornecedor.setForRazaoSocial(this.getResultSet().getString(4));
            modelfornecedor.setInscricaoEstadual(this.getResultSet().getString(5));
            modelfornecedor.setForCNPJ(this.getResultSet().getString(6));
            modelfornecedor.setForTelefone(this.getResultSet().getString(7));
            modelfornecedor.setForLogradouro(this.getResultSet().getString(8));
            modelfornecedor.setForComplemento(this.getResultSet().getString(9));
            modelfornecedor.setForBairro(this.getResultSet().getString(10));
            modelfornecedor.setForCidade(this.getResultSet().getString(11));
            modelfornecedor.setForUF(this.getResultSet().getString(12));
            modelfornecedor.setForCEP(this.getResultSet().getString(13));
        }
    } catch (Exception e) {
       
    } finally {
        this.fecharConexao();
    }
    return modelfornecedor;
}
/*Retornar um fornecedor pelo código*/
public ModelFornecedor retornarFornecedorPeloNomeDAO(String nomeFornecedor) {
    ModelFornecedor modelfornecedor = new ModelFornecedor();
    try {
        this.conectar();
        this.executarSQL("SELECT "
            + "ID_Fornecedor,"
            + "nomeFantasia,"
            + "email,"
            + "razaoSocial,"
            + "inscricaoEstadual,"
            + "cnpj,"
            + "telefone,"
            + "logradouro,"
            + "complemento,"
            + "bairro, "
            + "cidade, "        
            + "uf, "
            + "cep "
                + "FROM fornecedor WHERE razaoSocial = '" + nomeFornecedor + "'");
        while (this.getResultSet().next()) {
            modelfornecedor.setIdFornecedor(this.getResultSet().getInt(1));
            modelfornecedor.setForNome(this.getResultSet().getString(2));
            modelfornecedor.setForEmail(this.getResultSet().getString(3));
            modelfornecedor.setForRazaoSocial(this.getResultSet().getString(4));
            modelfornecedor.setInscricaoEstadual(this.getResultSet().getString(5));
            modelfornecedor.setForCNPJ(this.getResultSet().getString(6));
            modelfornecedor.setForTelefone(this.getResultSet().getString(7));
            modelfornecedor.setForLogradouro(this.getResultSet().getString(8));
            modelfornecedor.setForComplemento(this.getResultSet().getString(9));
            modelfornecedor.setForBairro(this.getResultSet().getString(10));
            modelfornecedor.setForCidade(this.getResultSet().getString(11));
            modelfornecedor.setForUF(this.getResultSet().getString(12));
            modelfornecedor.setForCEP(this.getResultSet().getString(13));
        }
    } catch (Exception e) {
       
    } finally {
        this.fecharConexao();
    }
    return modelfornecedor;
}

/*Retornar uma lista completa de fornecedores*/
public ArrayList<ModelFornecedor> retornarListaFornecedorDAO() {
ArrayList<ModelFornecedor> listaModelFornecedores = new ArrayList<>();
ModelFornecedor modelfornecedor = new ModelFornecedor();
try {
    this.conectar();
    this.executarSQL("SELECT "
            + "ID_Fornecedor,"
            + "nomeFantasia,"
            + "email,"
            + "razaoSocial,"
            + "inscricaoEstadual,"
            + "cnpj,"
            + "telefone,"
            + "logradouro,"
            + "complemento,"
            + "bairro, "
            + "cidade, "        
            + "uf, "
            + "cep "
                + "FROM fornecedor;");
    while (this.getResultSet().next()) {
            modelfornecedor.setIdFornecedor(this.getResultSet().getInt(1));
            modelfornecedor.setForNome(this.getResultSet().getString(2));
            modelfornecedor.setForEmail(this.getResultSet().getString(3));
            modelfornecedor.setForRazaoSocial(this.getResultSet().getString(4));
            modelfornecedor.setInscricaoEstadual(this.getResultSet().getString(5));
            modelfornecedor.setForCNPJ(this.getResultSet().getString(6));
            modelfornecedor.setForTelefone(this.getResultSet().getString(7));
            modelfornecedor.setForLogradouro(this.getResultSet().getString(8));
            modelfornecedor.setForComplemento(this.getResultSet().getString(9));
            modelfornecedor.setForBairro(this.getResultSet().getString(10));
            modelfornecedor.setForCidade(this.getResultSet().getString(11));
            modelfornecedor.setForUF(this.getResultSet().getString(12));
            modelfornecedor.setForCEP(this.getResultSet().getString(13));
        listaModelFornecedores.add(modelfornecedor);
    }
    
    }catch(Exception e) {
        e.printStackTrace();
    }finally{
        this.fecharConexao();
    }
    return listaModelFornecedores;
    }

}


