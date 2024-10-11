package proyecto2;

public class EJW {
    public static void main(String[] args) {
        Carros auto = new Carros("Ford", 2018, 3, 5, 6, 250,
                Met.Combustible.DIESEL, Met.Tipocarro.EJECUTIVO,
                Met.Color.NEGRO);
        
        auto.MostrarDatos();
        
        auto.vActual = 100;
        System.out.println("Velocidad actual: " + auto.vActual);
        auto.Velocidad(20);
        auto.Lentitud(50);
        auto.Frenar();
    }
}