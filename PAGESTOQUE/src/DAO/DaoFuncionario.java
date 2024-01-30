/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.ModelFuncionario;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class DaoFuncionario extends Conexao {

    /*Cadastrar um funcionario no banco*/
    public int salvarFuncionarioDAO(ModelFuncionario fModelFuncionario) {
        try {
            this.conectar();
            String query = "INSERT INTO funcionario (nomeFuncionario, "
                    + "email, "
                    + "telefone, "
                    + "cpf, "
                    + "senha, "
                    + "cargo, "
                    + "logradouro, "
                    + "complemento, "
                    + "bairro, "
                    + "cidade, "
                    + "uf, "
                    + "cep"
                    + ") VALUES ("
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = this.getCon().prepareStatement(query);
            preparedStatement.setString(1, fModelFuncionario.getFunNome());
            preparedStatement.setString(2, fModelFuncionario.getFunEmail());
            preparedStatement.setString(3, fModelFuncionario.getFunTelefone());
            preparedStatement.setString(4, fModelFuncionario.getFunCPF());
            preparedStatement.setString(5, fModelFuncionario.getFunSenha());
            preparedStatement.setString(6, fModelFuncionario.getFunCargo());
            preparedStatement.setString(7, fModelFuncionario.getFunLogradouro());
            preparedStatement.setString(8, fModelFuncionario.getFunComplemento());
            preparedStatement.setString(9, fModelFuncionario.getFunBairro());
            preparedStatement.setString(10, fModelFuncionario.getFunCidade());
            preparedStatement.setString(11, fModelFuncionario.getFunUF());
            preparedStatement.setString(12, fModelFuncionario.getFunCEP());

            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /*Excluir um funcionario do banco*/
    public boolean excluirFuncionarioDAO(int fIdFuncionario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM funcionario WHERE ID_Funcionario = " + fIdFuncionario
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /*Alterar dados do funcionario*/
    public boolean alterarFuncionarioDAO(ModelFuncionario fModelFuncionario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE funcionario SET "
                    + "nomeFuncionario = '" + fModelFuncionario.getFunNome() + "', "
                    + "email= '" + fModelFuncionario.getFunEmail() + "', "
                    + "telefone = '" + fModelFuncionario.getFunTelefone() + "', "
                    + "cpf = '" + fModelFuncionario.getFunCPF() + "', "
                    + "senha = '" + fModelFuncionario.getFunSenha() + "', "
                    + "cargo = '" + fModelFuncionario.getFunCargo() + "', "
                    + "logradouro = '" + fModelFuncionario.getFunLogradouro() + "', "
                    + "complemento = '" + fModelFuncionario.getFunComplemento() + "', "
                    + "bairro = '" + fModelFuncionario.getFunBairro() + "', "
                    + "cidade = '" + fModelFuncionario.getFunCidade() + "', "
                    + "uf = '" + fModelFuncionario.getFunUF() + "', "
                    + "cep = '" + fModelFuncionario.getFunCEP() + "' "
                    + "WHERE ID_Funcionario = " + fModelFuncionario.getIdFuncionario()
            );
        } catch (Exception e) {
            return false;
        }
    }

    /*Retornar um funcionario pelo código*/
    public ModelFuncionario retornarFuncionarioDAO(int pIdFuncionario) {
        ModelFuncionario modelFuncionario = new ModelFuncionario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "ID_Funcionario, "
                    + "nomeFuncionario, "
                    + "email, "
                    + "telefone, "
                    + "cpf, "
                    + "senha, "
                    + "cargo, "
                    + "logradouro, "
                    + "complemento, "
                    + "bairro, "
                    + "uf, "
                    + "cep "
                    + "FROM funcionario WHERE ID_Funcionario = '" + pIdFuncionario + "'");
            while (this.getResultSet().next()) {
                modelFuncionario.setIdFuncionario(this.getResultSet().getInt(1));
                modelFuncionario.setFunNome(this.getResultSet().getString(2));
                modelFuncionario.setFunEmail(this.getResultSet().getString(3));
                modelFuncionario.setFunTelefone(this.getResultSet().getString(4));
                modelFuncionario.setFunCPF(this.getResultSet().getString(5));
                modelFuncionario.setFunSenha(this.getResultSet().getString(6));
                modelFuncionario.setFunCargo(this.getResultSet().getString(7));
                modelFuncionario.setFunLogradouro(this.getResultSet().getString(8));
                modelFuncionario.setFunComplemento(this.getResultSet().getString(9));
                modelFuncionario.setFunBairro(this.getResultSet().getString(10));
                modelFuncionario.setFunUF(this.getResultSet().getString(11));
                modelFuncionario.setFunCEP(this.getResultSet().getString(12));
            }
        } catch (Exception e) {

        } finally {
            this.fecharConexao();
        }
        return modelFuncionario;
    }

    /*Retornar uma lista completa de clientes*/
    public ArrayList<ModelFuncionario> retornarListaFuncionarioDAO() {
        ArrayList<ModelFuncionario> listaModelFuncionarios = new ArrayList<>();
        ModelFuncionario modelFuncionario = new ModelFuncionario();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "ID_Funcionario, "
                    + "nomeFuncionario, "
                    + "email, "
                    + "telefone, "
                    + "cpf, "
                    + "senha, "
                    + "cargo,"
                    + "logradouro, "
                    + "complemento, "
                    + "bairro, "
                    + "cidade, "
                    + "uf, "
                    + "cep "
                    + "FROM funcionario;");
            while (this.getResultSet().next()) {
                modelFuncionario = new ModelFuncionario();
                modelFuncionario.setIdFuncionario(this.getResultSet().getInt(1));
                modelFuncionario.setFunNome(this.getResultSet().getString(2));
                modelFuncionario.setFunEmail(this.getResultSet().getString(3));
                modelFuncionario.setFunTelefone(this.getResultSet().getString(4));
                modelFuncionario.setFunCPF(this.getResultSet().getString(5));
                modelFuncionario.setFunSenha(this.getResultSet().getString(6));
                modelFuncionario.setFunCargo(this.getResultSet().getString(7));
                modelFuncionario.setFunLogradouro(this.getResultSet().getString(8));
                modelFuncionario.setFunComplemento(this.getResultSet().getString(9));
                modelFuncionario.setFunBairro(this.getResultSet().getString(10));
                modelFuncionario.setFunCidade(this.getResultSet().getString(11));
                modelFuncionario.setFunUF(this.getResultSet().getString(12));
                modelFuncionario.setFunCEP(this.getResultSet().getString(13));
                listaModelFuncionarios.add(modelFuncionario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelFuncionarios;

    }
    
 /*Validar Login*/
    public boolean ValidarFuncionarioDAO(ModelFuncionario pmodelFuncionario) {

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "ID_Funcionario, "
                    + "senha "
                    + "FROM funcionario WHERE ID_Funcionario = '" + pmodelFuncionario.getIdFuncionario() + "' AND senha = '" + pmodelFuncionario.getFunSenha() + "'");

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();

        }
    }
}
