package org.example.herenciamultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista, Artista{ //heredo con extends e implementa deportista y artista (asi hacemos herencia multiple)
    private int idActividadesExtra;                    //especializacion del alum. deportistra y artista
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numerCuenta, String carrera, double promedio, int idActividadesExtra, String deporte, String arte) {
        super(nombre, edad, numerCuenta, carrera, promedio);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;              // aquí estan los atributos de persona, alumno y los locales
    }

    public int getIdActividadesExtra() {
        return idActividadesExtra;
    }

    public void setIdActividadesExtra(int idActividadesExtra) {
        this.idActividadesExtra = idActividadesExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                " AlumnoDeportistaArtista{" +
                "idActividadesExtra=" + idActividadesExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }
// implemento los metodos abstractos
    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno esta ensayando  " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " Esta presentando su obra ");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " esta entrenando el deporte " + this.deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " esta en competencia del deporte " + this.deporte);
        return true;
    }
}
