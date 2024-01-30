/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.DaoFuncionario;
import java.util.ArrayList;
import model.ModelFuncionario;

/**
 *
 * @author Zanela
 */
public class ControllerFuncionario {
    
    private DaoFuncionario daoFuncionario = new DaoFuncionario();
    /*
    Salvar funcionario controller
    */
    public int salvarFuncionarioController(ModelFuncionario fModelFuncionario){
        return this.daoFuncionario.salvarFuncionarioDAO(fModelFuncionario);
           
    }
    /*
    exlcuir um funcionario pelo codigo
    */
    public boolean excluirFuncionarioController(int fCodigo){
        return this.daoFuncionario.excluirFuncionarioDAO(fCodigo);
        
    }
    
    /*
    Alterar um funcionario 
    */
    public boolean alterarFuncionarioController(ModelFuncionario fModelFuncionario){
        return this.daoFuncionario.alterarFuncionarioDAO(fModelFuncionario);
        
    }
    /*
    Retornar funcionario pelo codigo
    */
    public ModelFuncionario retornarFuncionarioController(int fCodigo){
        return this.daoFuncionario.retornarFuncionarioDAO(fCodigo);
    }
  
    /*
    Retornar lista de funcionario
    */
    public ArrayList<ModelFuncionario> retornarListaFuncionariosController(){
        return this.daoFuncionario.retornarListaFuncionarioDAO();
    }

    /*Validar login e senha*/
    public boolean getValidarFuncionarioController(ModelFuncionario pmodelFuncionario) {
        return this.daoFuncionario.ValidarFuncionarioDAO(pmodelFuncionario);
    }
    
    
    
}

    

