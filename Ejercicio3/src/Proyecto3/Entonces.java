package Proyecto3;

public class Entonces {
    String nombre;
    String fabricante;
    String Admin;
    Posologia posologia;

    public Entonces(String nombre, String fabricante, String Admin) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.Admin = Admin;
    }

    public void SetPosologia(Posologia posologia) {
        this.posologia = posologia;
    }

    public void MostrarDatos() {
        System.out.println("NOMBRE/MEDICAMENTO: " + nombre);
        System.out.println("FABRICANTE/MEDICAMENTO: " + fabricante);
        System.out.println("VIA/ADMINISTRACION: " + Admin);
        if (posologia == null) {
        } else {
            posologia.MostrarDatos();
        }
    }

    public class Posologia {
        String usuario;
        int dosis;
        String periodo;
        String recomendacion;
        
        public Posologia(String usuario, int dosis, String periodo,
                String recomendacion) {
            this.usuario = usuario;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendacion = recomendacion;
        }
        
        public void MostrarDatos() {
            System.out.println("USUARIOS: " + usuario);
            System.out.println("DOSIS: " + dosis);
            System.out.println("PERIODO: " + periodo);
            System.out.println("RECOMENDACIONES: " + recomendacion);
        }
    }
}

