import java.util.Scanner;

public class TaresTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nueve caracteres (pueden ser X,O,_):");
        String cadena = entrada.nextLine();

        if (cadena.length() != 9) {                       //meto esta condicion para asegurarme que la cadena sea de 9 caracteres
            System.out.println("Introduzca nueve caracteres"); //el != (no es igual a)
            return;
        }
        for (int i = 0; i < cadena.length(); i++) {
            char unico = cadena.charAt(i);
            if (unico != 'X' && unico != 'O' && unico != '_') {            //solo uso '' y no "" por que es un char, si pongo "" me da error
                System.out.println("Introduzca unicamente los caracteres (X,Y,_)");  // en la linea 14 uso && para asegurar que se cumplan
                return;                                                              // las tres condiciones de caracteres.
            }
        }
        System.out.println("-----");
        System.out.println("|"+ cadena.substring(0,3)+"|");
        System.out.println("|"+ cadena.substring(3,6)+"|");
        System.out.println("|"+ cadena.substring(6,9)+"|");
        System.out.println("-----");
    }
}