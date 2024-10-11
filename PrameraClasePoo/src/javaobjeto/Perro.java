package javaobjeto;

public class Perro {
    String nombre2;
    String edad2;
    double peso2;
    
    void mostrarDatos2() {
        System.out.println("  ");
        System.out.println("NOMBRE DEL PERRO: " + nombre2);
        System.out.println("TIENE: " + edad2);
      
    }

    int obtenerPeso2() {
        return (int) peso2;
    }

    void kilogramos2(double kg2) {
        peso2 = peso2 + kg2;
        
    }
}

