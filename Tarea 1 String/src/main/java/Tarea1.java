import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre, profesión y tu país: ");
        String datos = teclado.nextLine();
        String [] division = datos.split(" ");
        System.out.println("Nombre:" + division[0].toUpperCase() + "\nProfesión:" + division[1].toUpperCase() + "\nPaís:" + division[2].toUpperCase());
    }
}
