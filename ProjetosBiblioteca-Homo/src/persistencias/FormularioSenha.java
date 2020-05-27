
package persistencias;

import classesdedados.usuarioESenhas;
import gui.TelaMenuPrincipal;
import interfaces.CRUDsenha;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author edivan
 */
public class FormularioSenha implements CRUDsenha{
    
//    private String wordlist;
    private String senhas  = "admin";
    private String usuario  = "admin";

// Contrutores

    public FormularioSenha() {
//        this.wordlist = "";
        this.senhas = "admin";
        this.usuario = "admin";
    }
    
    public FormularioSenha(String senhas, String usuario){
//        this.wordlist = "";
        this.senhas = senhas;
        this.usuario = usuario;
    }
// Metodo get    

    public FormularioSenha(String wordlisttxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSenhas() {
        return senhas;
    }

    public void setSenhas(String senhas) {
        this.senhas = senhas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
//--------------------------------------------------------------------
//    @Override
//    public void incluirSenha(usuarioESenhas objeto) throws Exception {
//        try {
//            // Criação do arquivo
//            FileWriter fw = new FileWriter(arquivoExemplares, true);
//            
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(Objeto.toString() + "\n");
//            // Fechar o arquivo em chache
//            bw.close();
//        } catch (Exception e) {
//        }
//    
//    }

    @Override
    public void incluirSenha(usuarioESenhas objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void alterarSenha(usuarioESenhas antigaSenha, usuarioESenhas novaSenha) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirSenha(usuarioESenhas objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // 
    public boolean validaSenha (FormularioSenha objeto){
       return this.usuario.equals(objeto.usuario) && this.senhas.equals(objeto.senhas);
    }
   
}
