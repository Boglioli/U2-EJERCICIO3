public class ControlRemoto {
    private ReproductorAudio reproductor;
    public ControlRemoto(ReproductorAudio reproductor) {
        this.reproductor = reproductor;
    }
    public void reproducir() {
        reproductor.play();
    }
    public void pausar() {
        reproductor.pause();
    }
    public void SubirVolumen(int volumen) {
        reproductor.cambiarVolumen(volumen);
    }
}
