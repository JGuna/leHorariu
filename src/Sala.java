
public class Sala {
    
    private String codigo;
    private String tipo;
    private int capacidade;

    public Sala(String codigo, String tipo, int capacidade) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
