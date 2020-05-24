package classesdedados;
/**
 *
 * @author edivan
 */
public class Exemplares {
    private float anodePublicacao;
    private float dataDeAquisicao = 0;
    private double precoDeCompra = 0;
    private int edicao = 0;
    private tipoDeStatus status = null;
    private String descrição = "";

    public Exemplares() {
    }
 
    
    
    public float getAnodePublicacao() {
        return anodePublicacao;
    }

    public void setAnodePublicacao(float anodePublicacao) {
        this.anodePublicacao = anodePublicacao;
    }

    public float getDataDeAquisicao() {
        return dataDeAquisicao;
    }

    public void setDataDeAquisicao(float dataDeAquisicao) {
        this.dataDeAquisicao = dataDeAquisicao;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public tipoDeStatus getStatus() {
        return status;
    }

    public void setStatus(tipoDeStatus status) {
        this.status = status;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public String toString() {
        return "Exemplares{" + "anodePublicacao=" + anodePublicacao + ", dataDeAquisicao=" + dataDeAquisicao + ", precoDeCompra=" + precoDeCompra + ", edicao=" + edicao + ", status=" + status + ", descri\u00e7\u00e3o=" + descrição + '}';
    }
    
    
    
}
