package proyecto1;

public class Tierra {
    String nombre;
    int satelites;
    double masa;
    double volumen;
    int diametro;
    int MediaSol;
    Tps tipo;
    boolean observable;

    public Tierra() {
        this.nombre = "Tierra.";
        this.satelites = 1;
        this.masa = 5.9722E24;
        this.volumen = 1.08321E12;
        this.diametro = 12756;
        this.MediaSol = 150000000;
        this.tipo = Tps.TERRESTRE;
        this.observable = true;
    }

    public void MostrarDatos() {
        System.out.println("NOMBRE DEL PLANETA: " + nombre);
        System.out.println("CANTIDAD/SATELITES: " + satelites);
        System.out.println("MASA/PLANETA: " + masa);
        System.out.println("VOLUMEN/PLANETA: " + volumen);
        System.out.println("DIAMETRO/PLANETA: " + diametro);
        System.out.println("DISTANCIA/SOL: " + MediaSol);
        System.out.println("TIPO/PLANETA: " + tipo);
        System.out.println("OBSERVABLE? " + observable);
    }

    public double Densidad() {
        return masa / volumen;
    }

    public boolean PlanetaEx() {
        double solKm = MediaSol * 1000000;
        double Solua = solKm / 149597870;
        return Solua > 3.4;
    }
}