package classesdedados;

/**
 *
 * @author edivan
 */
// classes de Status ativo ou inativo;
class tipoDeStatus {

    private int ativo = 0;
    private int inativo = 1;

    public tipoDeStatus() {
    }

    public tipoDeStatus(int ativo, int inativo) {
        this.ativo = ativo;
        this.inativo = inativo;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

}
