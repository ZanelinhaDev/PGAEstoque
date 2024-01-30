/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelVendas;
import model.ModelVendasCliente;
import model.ModelClientes;

/**
 *
 * @author Usuario
 */
public class DaoVendasCliente extends Conexao {
    public ArrayList<ModelVendasCliente> retornarListaVendasDAO() {
        ArrayList<ModelVendasCliente> listaModelVendasClientes = new ArrayList<>();
        ModelVendas modelVendas;
        ModelClientes modelClientes;
        ModelVendasCliente modelVendasCliente;

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "tbl_vendas.pk_id_vendas, "
                    + "tbl_vendas.fk_cliente, "
                    + "tbl_vendas.ven_data_venda, "
                    + "tbl_vendas.ven_valor_liquido, "
                    + "tbl_vendas.ven_valor, "
                    + "tbl_vendas.ven_valor_desconto, "
                    + "cliente.ID_Cliente, "
                    + "cliente.nomeCliente, "
                    + "cliente.email, "
                    + "cliente.telefone, "
                    + "cliente.cpf, "
                    + "cliente.logradouro, "
                    + "cliente.complemento, "
                    + "cliente.bairro, "
                    + "cliente.cidade, "
                    + "cliente.uf, "
                    + "cliente.cep "
                    + "FROM tbl_vendas "
                    + "INNER JOIN cliente ON tbl_vendas.fk_cliente = cliente.ID_Cliente;");

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelClientes = new ModelClientes();
                modelVendasCliente = new ModelVendasCliente();

                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setVenda_cliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(4));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));

                modelClientes.setIdCliente(this.getResultSet().getInt(7));
                modelClientes.setCliNome(this.getResultSet().getString(8));
                modelClientes.setCliEmail(this.getResultSet().getString(9));
                modelClientes.setCliTelefone(this.getResultSet().getString(10));
                modelClientes.setCliCPF(this.getResultSet().getString(11));
                modelClientes.setCliLogradouro(this.getResultSet().getString(12));
                modelClientes.setCliComplemento(this.getResultSet().getString(13));
                modelClientes.setCliBairro(this.getResultSet().getString(14));
                modelClientes.setCliCidade(this.getResultSet().getString(15));
                modelClientes.setCliUF(this.getResultSet().getString(16));
                modelClientes.setCliCEP(this.getResultSet().getString(17));

                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelClientes(modelClientes);

                listaModelVendasClientes.add(modelVendasCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelVendasClientes;
    }
}