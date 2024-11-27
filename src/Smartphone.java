public class Smartphone extends Prodotto{

    private int codiceImei;
    private int memoria;

    public Smartphone(String nome, String marca, float prezzo, float iva, int codiceImei, int memoria) {
        super(nome, marca, prezzo, iva);
        this.codiceImei = codiceImei;
        this.memoria = memoria;
    }

    public int getCodiceImei(){
        return this.codiceImei;
    }

    public void setCodiceImei(int codiceImei){
        this.codiceImei = codiceImei;
    }

    public int getMemoria(){
        return this.memoria;
    }

    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
}
