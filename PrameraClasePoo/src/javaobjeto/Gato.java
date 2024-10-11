package javaobjeto;

public class Gato {
    private String nombre;
    private String edad;
    private double peso;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
   
    void mostrarDatos() {
        System.out.println("NOMBRE DEL GATO: " + nombre);
        System.out.println("TIENE: " + edad);
    }

    int obtenerPeso() {
        return (int) peso;
    }

    void kilogramos(double kg) {
        peso = peso + kg;
        
    }
}

