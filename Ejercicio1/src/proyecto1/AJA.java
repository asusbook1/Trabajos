package proyecto1;

public class AJA {
    public static void main(String[] args) {
        Tierra an = new Tierra();
        Jupiter bn = new Jupiter();

        an.MostrarDatos();
        System.out.println("DENSIDAD/PLANETA " + an.Densidad());
        System.out.println("PLANETA EXTERIOR? " + an.PlanetaEx());

        System.out.println();

        bn.MostrarDatos2();
        System.out.println("DENSIDAD/PLANETA " + bn.Densidad2());
        System.out.println("PLANETA EXTERIOR? " + bn.PlanetaEx2());
    }
}