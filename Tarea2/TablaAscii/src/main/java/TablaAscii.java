import java.util.Scanner;

public class TablaAscii {
    public static void main(String[] args) {
        Scanner texto= new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String cadena = texto.nextLine();
        boolean salida= true;
        for (int i=0; i<cadena.length()-1; i++){   //i++ es un operador post incremento. Estabelecí la
                                                                            //condición con un for
                if(((int) cadena.charAt(i+1)-(int)cadena.charAt(i) != 1)){ //uso el casting en el (int)
                salida = false;                                //aquí indico que si la secuencia no va de 1 a 1
                }                                              // obtendré un false
        }
        System.out.println("=>"+salida);
    }

}

