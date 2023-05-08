package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leer(String ruta) throws IOException{    //forma 2 Throws (quiero decir que esta excep. tiene que ser procesada en el lugar donde sea llamado el método lee
        // try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println("Info:" + line);
            }

            //requiere un arch. del tipo file reader que recibe la ruta
            //FORMA1 }catch (IOException e){
            //e.printStackTrace();
            //Es un método de la clase arrojable que imprime el arrojable junto con otros detalles como el número de línea y el nombre de la clase donde pasó la excepción.
            //}

    }

    public void metodoUno(String ruta) throws IOException{ //ponemos el throws porque el metodo 1 mandó a llamar
       this.metodoDos(ruta);
    }
    public void metodoDos(String ruta)throws IOException{
        this.leer(ruta);
    }
}
