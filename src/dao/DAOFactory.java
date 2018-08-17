/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author André Luiz & Eduardo Gautier
 * @since 06/07/2018 - 15h23
 * @version 1.0 meta charset
 */
public class DAOFactory {
    private static final ClienteDAO CDAO = new ClienteDAO();
    private static final VeiculoDAO VDAO = new VeiculoDAO();
    private static final UsuarioDAO UDAO = new UsuarioDAO();

    public static ClienteDAO getClienteDAO() {
        return CDAO;
    }
    
    public  static VeiculoDAO getVeiculoDAO() {
        return VDAO;
    }
    
    public static UsuarioDAO getUsuarioDAO(){
        return UDAO;
    }
}