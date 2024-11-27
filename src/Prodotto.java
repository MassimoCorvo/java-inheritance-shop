import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private float prezzo;
    private float iva;
    private float sconto;

    public Prodotto(String nome, String marca, float prezzo, float iva ){

        Random r = new Random();
        this.codice = r.nextInt(101);

        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;

        this.sconto = 0.02f;

    }

    public void stampaNomeECodice(){

        System.out.println( this.nome + "-" + this.codice );

    }

    public int getCodice(){
        return this.codice;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getmarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public float getPrezzo(){
        return this.prezzo;
    }

    public float getPrezzoConIva(){

        float ivaDecimali = this.iva / 100;
        float prezzoConIva = this.prezzo + this.prezzo * ivaDecimali;

       return prezzoConIva;

    }

    public void stampaPrezzoBase (){
        
        System.out.println("Il prezzo base è: " + this.prezzo + " euro");

    }

    public void stampaPrezzoConIva(){
        System.out.println("Il prezzo con iva è: " + getPrezzoConIva() + " euro");
    }

    public void setPrezzo(float prezzo){
        this.prezzo = prezzo;
    }

    public float getIva(){
        return this.iva;
    }

    public void setIva(float iva){
        this.iva = iva;
    }

    public float getSconto(){
        return this.sconto;
    }

    public void setSconto(float sconto){

        if( sconto > 0 && sconto < 1 )
            this.sconto = sconto;

    }

    public float calcolaPrezzoConSconto(){
       return this.getPrezzoConIva() * (1 - this.sconto);
    }
}

