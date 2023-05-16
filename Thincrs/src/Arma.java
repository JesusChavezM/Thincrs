
public class Arma {
    private String tipo;
    private String color;
    private int tamano;
    private int danio;

    public Arma(String tipo, String color, int tamano, int danio) {
        this.tipo = tipo;
        this.color = color;
        this.tamano = tamano;
        this.danio = danio;
    }

    // Getters y setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }
}