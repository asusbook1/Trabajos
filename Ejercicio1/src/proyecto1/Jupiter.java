package proyecto1;

public class Jupiter {
    String nombre2;
    int satelites2;
    double masa2;
    double volumen2;
    int diametro2;
    int MediaSol2;
    Tps tipo;
    boolean observable2;

    public Jupiter() {
        this.nombre2 = "Jupiter";
        this.satelites2 = 79;
        this.masa2 = 1.898E27;
        this.volumen2 = 1.43128E15;
        this.diametro2 = 139820;
        this.MediaSol2 = 750000000;
        this.tipo = Tps.GASEOSO;
        this.observable2 = true;
    }
    
    public void MostrarDatos2() {
        System.out.println("NOMBRE DEL PLANETA: " + nombre2);
        System.out.println("CANTIDAD/SATELITES: " + satelites2);
        System.out.println("MASA/PLANETA: " + masa2);
        System.out.println("VOLUMEN/PLANETA: " + volumen2);
        System.out.println("DIAMETRO/PLANETA: " + diametro2);
        System.out.println("DISTANCIA/SOL: " + MediaSol2);
        System.out.println("TIPO/PLANETA: " + tipo);
        System.out.println("OBSERVABLE? " + observable2);
    }

    public double Densidad2() {
        return masa2 / volumen2;
    }

    public boolean PlanetaEx2() {
        double solKm2 = MediaSol2 * 1000000;
        double Solua2 = solKm2 / 149597870.7;
        return Solua2 < 3.4;
    }
}

