package persistencias;

import classesdedados.Exemplares;
import interfaces.CRUD;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author edivan
 */
public class ExemplaresPersistencia  implements CRUD{
    private String arquivoExemplares = "";
    // Construtores 
    public ExemplaresPersistencia() {
    }
    
    public ExemplaresPersistencia(String arquivoExemplares){
        arquivoExemplares = arquivoExemplares;
    }

    @Override
    public void incluir(Exemplares Objeto) throws Exception {
        try {
            // Criação do arquivo
            FileWriter fw = new FileWriter(arquivoExemplares, true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Objeto.toString() + "\n");
            // Fechar o arquivo em chache
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Exemplares> recuperar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Exemplares eAntigo, Exemplares eNovo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
