public class ReproductorAudio {
    private int volumenActual;
    private String estado;

public ReproductorAudio() {
        this.volumenActual = 50;
        this.estado = "detenido";
    }

    public void play() {
        estado = "reproduciendo";
        System.out.println("Reproduciendo audio");
    }

    public void pause() {
        if (estado.equals("reproduciendo")) {
            estado = "pausado";
            System.out.println("audio pausado.");
        } else {
            System.out.println("No se puede pausar. El audio no está en reproducción.");
        }
    }

    public void cambiarVolumen(int nuevoVolumen) {
if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            volumenActual = nuevoVolumen;
            System.out.println("volumen cambiado a: " + volumenActual);
        } else {
            System.out.println("volumen inválido. Debe estar entre 0 y 100.");
        }
    }
}