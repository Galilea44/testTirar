package ico.fes.poo2258;

public class PelotaDriver {
    public static void main(String[] args) {
        Pelota ball = new Pelota("Pelota de tenis", "Suave");
        System.out.println(ball.rebotar());
        System.out.println(ball.rodar());
        System.out.println(ball.girar());
        System.out.println(ball);
    }
}

