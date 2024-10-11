package Proyecto3;

public class EJE {
    public static void main(String[] args) {
        Entonces an = new Entonces("Aspirina", "Bayer", "Oral");
        Entonces.Posologia posologia = an.new Posologia("Adultos y "
                + "Mayores de 16 años", 500, "6 horas", "No tomar este"
                        + " medicamento con el estomago vacio.");
        
        an.SetPosologia(posologia);
        an.MostrarDatos();
    }
}