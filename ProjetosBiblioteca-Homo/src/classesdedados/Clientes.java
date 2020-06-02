/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesdedados;
// fonte https://youtu.be/A45DIRWzlKo
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edivan
 */
public class Clientes {
    private String nome;
    private String email;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String salvar() throws IOException{
        
        // aqui ele salva mais esta sobreescrevedo o arquivo; | colocar [,true] para que o arquivo nao seja
        //substituido
        try {
            FileWriter fw = new FileWriter("clientes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
//            pw.println("Nome: " + this.nome );
//            pw.println("Email: " + this.email);
//            pw.println("CPF: " + this.cpf);
// ---> aasim para salva os dados em uma unica linha;
            pw.printf("Nome: " + this.nome + ", Email: " +this.email+ ", CPF: " + this.cpf + "\n");
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Cadastro realizado com Sucesso";
    }
    
}
