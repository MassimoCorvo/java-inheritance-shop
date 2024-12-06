public class Televisore extends Prodotto{

    private int dimensione;
    private boolean smartTv;
    private Schermo schermo;

    public Televisore(String nome, String marca, float prezzo, float iva, int dimensione, boolean smartTv, Schermo schermo) {
        super(nome, marca, prezzo, iva);
        this.dimensione = dimensione;
        this.smartTv = smartTv;

        if( !this.smartTv )
            this.setSconto(0.1f);

        this.schermo = schermo;
    }

    public int getDimensione(){
        return this.dimensione;
    }

    public void setDimensione(int dimensione){
        this.dimensione = dimensione;
    }

    public boolean getSmartTv(){
        return this.smartTv;
    }

    public void setSmartTv(boolean smart){
        this.smartTv = smart;
    }

}
