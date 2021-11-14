/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import com.mycompany.mvbd.usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iplay
 */
public class UsuarioDAO {
    public void inserirUsuario(usuario u){
        try{
            String SQL = "INSERT INTO henrique_augusto.usuario (nome, codigo, telefone, cpf, email) VALUES (?,?,?,?,?)";
            Connection mC = Conexao.getConexao();
            PreparedStatement comando = mC.prepareStatement(SQL);
            comando.setString(1, u.getNome());
            comando.setInt(2, u.getCodigo());
            comando.setString(3, u.getTelefone());
            comando.setString(4, u.getCpf());
            comando.setString(5, u.getEmail());
            int retorno = comando.executeUpdate();
            if(retorno>0){
                JOptionPane.showMessageDialog(null, "Usuario: " +u.getNome()+ " inserido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Usuario: " +u.getNome()+ " não foi inserido com sucesso");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
