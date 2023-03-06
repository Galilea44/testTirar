package ico.fes.poo2258;

public class PerroDriver {
    public static void main(String[] args) {
        Perro dog = new Perro("Chihuahua", "Burbuja");
        System.out.println(dog.ladrar());
        System.out.println(dog.comer());
        System.out.println(dog.dormir());
        System.out.println(dog);
    }
}
