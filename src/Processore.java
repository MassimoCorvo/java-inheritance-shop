public class Processore {
    private String modello;
    private int numeroCore;
    private String marca;
    
    public Processore(String modello, int numeroCore, String marca){
        this.modello = modello;
        this.numeroCore = numeroCore;
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroCore() {
        return numeroCore;
    }

    public void setNumeroCore(int numeroCore) {
        this.numeroCore = numeroCore;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
