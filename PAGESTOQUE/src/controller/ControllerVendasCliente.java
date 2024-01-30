/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.ModelVendasCliente;
import DAO.DaoVendasCliente;


/**
 *
 * @author Usuario
 */
public class ControllerVendasCliente {
    private DaoVendasCliente daoVendasCliente = new DaoVendasCliente();
    
   public ArrayList<ModelVendasCliente> retornarListaVendaController(){
       return this.daoVendasCliente.retornarListaVendasDAO();
    } 
}