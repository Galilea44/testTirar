package ico.fes;

public class MaquinaDeCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaDeCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public MaquinaDeCafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if(vasos <= 200){
            this.vasos = vasos;
        }else{
            System.out.println("Se necesita un vaso de 200 ml de capacidad");

        }
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void Americano(){
        if(this.agua >= 180 && this.cafe >= 15 && this.vasos >= 1 ){
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos-= 1;
            System.out.println("AMERICANO ---Aún hay suficientes recursos para seguir sirviendo café---");
            System.out.println("-Cantidad de agua:" + this.agua + "ml" +" -Cantidad de café:" + this.cafe + "g" + " -Cantidad de crema:" + this.crema + "ml");
        }else{
            System.out.println("Ya no hay suficientes recursos para seguir sirviendo café");
            Cantidades();
        }
    }
    public void Expreso(){
        if(this.agua >= 120 && this.cafe >= 20 && this.vasos >= 1 ){
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos-= 1;
            System.out.println("EXPRESO ---Aún hay suficientes recursos para seguir sirviendo café---");
            System.out.println("Cantidad de agua:" + this.agua + "ml" +" -Cantidad de café:" + this.cafe + "g" + " -Cantidad de crema" + this.crema + "ml");
        }else{
            System.out.println("Ya no hay suficientes recursos para seguir sirviendo café");
            Cantidades();
        }
    }
    public void Capuchino(){
        if(this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos >= 1 ){
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos-= 1;
            System.out.println("CAPUCHINO ---Aún hay suficientes recursos para seguir sirviendo café---");
            System.out.println("Cantidad de agua:" + this.agua + "ml" +" -Cantidad de café:" + this.cafe + "g" + " -Cantidad de crema:" + this.crema + "ml");
    } else{
            System.out.println("Ya no hay suficientes recursos para seguir sirviendo café");
            Cantidades();
        }
    }
    public void Cantidades(){
        System.out.println("-Cantidad de agua:" + this.agua + "ml" +" -Cantidad de café:" + this.cafe + "g" + " -Cantidad de crema:" + this.crema + "ml");
    }
}
