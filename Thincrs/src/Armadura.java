// Clase Armadura
public class Armadura {
    private String material;
    private String color;

    public Armadura(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Getters y setters

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}