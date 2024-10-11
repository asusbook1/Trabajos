package javaobjeto;

public class Principal {

    public static void main(String[] args) {
        Gato an = new Gato();
        an.setNombre("ANDREW");
        an.setEdad("4 Meses");
        an.mostrarDatos();
        an.kilogramos(4);
        System.out.println("PESA " + an.obtenerPeso() + "kg");
        System.out.println("El gato dice MeOwwww");
        
        
        Perro bn = new Perro();
        bn.nombre2 = "DEIMAX";
        bn.edad2 = "1 Año";
        bn.mostrarDatos2();
        bn.kilogramos2(7);
        System.out.println("PESA " + bn.obtenerPeso2() + " kg");
        System.out.println("El perro dice GuAuuu");
    }
 
}
