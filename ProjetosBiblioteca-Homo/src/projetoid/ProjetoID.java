
package projetoid;
import javax.swing.JOptionPane;

/**
 *
 * @author eugeniojulio
 */
public class ProjetoID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            GeradorIdentificador teste = new GeradorIdentificador();
            System.out.println("ID: " + teste.getID());
            System.out.println("ID: " + teste.getID());
            System.out.println("ID: " + teste.getID());
            teste.finalize();
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, erro);
        }
        
    }
    
}
