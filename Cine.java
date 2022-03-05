// Creo clase Cine (Hija)

class Cine extends Edificio {

    // Constructor de Cine
    public Cine(String nombre, short plantas, float superficie) {
        super(nombre, plantas, superficie);
    }

    //Método Proyectar Sesión 
    public void proyectarSesion(float precioEntrada, int asistentes) {

        System.out.println("------------------------------------------------------- ");
        System.out.println("Se han recaudado " + (precioEntrada * asistentes) + "€.");
        System.out.println("-------------------------------------------------------");

    }
  //Método Calcular Coste Vigilancia propio de Clase Cine
  
    public void calcularCosteVigilancia(float superficie) {

        int numVigilantes = (int) Math.round(superficie / 3000f);
        System.out.println("-------------------------------------------------------");
        System.out.println("Hará(n) falta " + numVigilantes
                + " vigilante(s) para cubrir la seguridad del edificio, y el coste es de : "
                + numVigilantes * 1300 + "€ al mes.");
        System.out.println("-------------------------------------------------------");
    }

}