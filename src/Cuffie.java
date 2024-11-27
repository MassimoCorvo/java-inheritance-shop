public class Cuffie extends Prodotto {
    private String colore;
    private String tipo;

    public Cuffie(String nome, String marca, float prezzo, float iva, String colore, String tipo) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;

        if (tipo.equalsIgnoreCase("Wireless") || tipo.equalsIgnoreCase("Cablate"))
            this.tipo = tipo;
        else
            this.tipo = "Tipo non specificato";

        if (this.tipo.equals("Cablate"))
            this.setSconto(0.07f);

    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {

        if (tipo.equalsIgnoreCase("Wireless") || tipo.equalsIgnoreCase("Cablate"))
            this.tipo = tipo;

    }

}
