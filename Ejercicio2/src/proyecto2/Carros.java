package proyecto2;

public class Carros {
    String marca;
    int modelo;
    int motor;
    int puertas;
    int asientos;
    int vMaxima;
    int vActual;
    Met.Combustible combustible;
    Met.Tipocarro tipocarro;
    Met.Color color;

    public Carros(String marca, int modelo, int motor, int puertas,
            int asientos, int vMaxima, Met.Combustible combustible, 
            Met.Tipocarro tipocarro, Met.Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.motor = motor;
        this.asientos = asientos;
        this.vMaxima = vMaxima;
        this.color = color;
        this.vActual = 0;
        this.combustible = combustible;
        this.tipocarro = tipocarro;
    }
    public void Velocidad(int alto) {
        if (vActual + alto > vMaxima) {
        } 
        else {
            vActual =  vActual + alto;
            System.out.println("VELOCIDAD ACTUAL: " + vActual);
        }
    }

    public void Lentitud(int bajo) {
        if (vActual - bajo < 0) {
            System.out.println("NO SE PUEDE BAJAR A UNA VELOCIDAD NEGATIVA");
        } else {
            vActual = vActual - bajo;
            System.out.println("VELOCIDAD ACTUAL: " + vActual);
        }
    }
    
    public void Frenar() {
        vActual = 0;
        System.out.println("VELOCIDAD ACTUAL: " + vActual);
        System.out.println("No se puede descremental a una velocidad negativa");
    }

    public void MostrarDatos() {
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("MOTOR: " + motor);
        System.out.println("TIPO/COMBUSTIBLE: " + combustible);
        System.out.println("TIPO/CARRO: " + tipocarro);
        System.out.println("NUMERO/PUERTAS: " + puertas);
        System.out.println("CANTIDAD/ASIENTOS: " + asientos);
        System.out.println("VELOCIDAD MAXIMA: " + vMaxima);
        System.out.println("COLOR:  " + color);
    }
}