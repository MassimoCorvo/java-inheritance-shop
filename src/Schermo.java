public class Schermo {
    private float pollici;
    private boolean touchscreen;
    private String risoluzione;

    public Schermo(float pollici, boolean touchscreen, String risoluzione){
        this.pollici = pollici;
        this.touchscreen = touchscreen;
        this.risoluzione = risoluzione;
    }

    public float getPollici() {
        return pollici;
    }

    public void setPollici(float pollici) {
        this.pollici = pollici;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String getRisoluzione() {
        return risoluzione;
    }

    public void setRisoluzione(String risoluzione) {
        this.risoluzione = risoluzione;
    }
    
}
