package interfaces;

import classesdedados.Exemplares;
import java.util.ArrayList;

/**
 *
 * @author edivan
 */
public interface CRUD {
    //      -x-     -x-     -x-     -x-     -x-     -x-     -x-     -x-     -x-
    //  classe Exemplares;
    // Incluir Exemplares
    void incluir(Exemplares Objeto) throws Exception;
    // Criação da Arralist 
    public ArrayList<Exemplares> recuperar() throws Exception;
    // Exclusão;
    void excluir(String nome) throws Exception;
    // Alterção dos exemplares
    void  alterar(Exemplares eAntigo, Exemplares eNovo) throws Exception;
    
}
