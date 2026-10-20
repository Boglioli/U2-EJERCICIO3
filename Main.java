public class Main {
    public static void main(String[] args) {
        ReproductorAudio reproductor = new ReproductorAudio();
        ControlRemoto control = new ControlRemoto(reproductor);
        control.reproducir();
        control.SubirVolumen(70);
        control.pausar();
    }
}