// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Personaje personaje = new Personaje("Mario", "Fontanero");
        Armadura armadura = new Armadura("Hierro", "Rojo");
        Arma arma = new Arma("Espada", "Plateada", 100, 50);

        // Acceder a los atributos y métodos de los objetos
        System.out.println("Nombre del personaje: " + personaje.getNombre());
        System.out.println("Tipo de personaje: " + personaje.getTipo());

        System.out.println("\t Arma");
        System.out.println("Material de la armadura: " + armadura.getMaterial());
        System.out.println("Color de la armadura: " + armadura.getColor());

        System.out.println("\t Arma");
        System.out.println("Tipo de arma: " + arma.getTipo());
        System.out.println("Color del arma: " + arma.getColor());
        System.out.println("Tamaño del arma: " + arma.getTamano());
        System.out.println("Daño del arma: " + arma.getDanio());
    }
}
