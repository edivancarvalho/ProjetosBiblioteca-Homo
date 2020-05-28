package Lixo;

import classesdedados.usuarioESenhas;
import java.util.ArrayList;

/**
 *
 * @author edivan
 */
// Create (Criação), Retrieve (Consulta), Update (Atualização) e Delete (Destruição)
public interface CRUDsenha {
    void incluirSenha (usuarioESenhas objeto) throws Exception;
    void alterarSenha (usuarioESenhas antigaSenha, usuarioESenhas novaSenha) throws Exception;
    void excluirSenha (usuarioESenhas objeto) throws Exception;
    //public ArrayList<usuarioESenhas> consultaSenha (usuarioESenhas objeto) throws Exception;
    
    
}
