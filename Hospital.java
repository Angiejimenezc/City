
//Creo Clase Hospital  (hija)

class Hospital extends Edificio {

    private int numEnfermos;

    // Creo el Constructor de la clase Hospital

    public Hospital(String nombreHospital, short plantasHospital, float superficieHospital, int numEnfermos) {
        super(nombreHospital, plantasHospital, superficieHospital);
        this.numEnfermos = numEnfermos;
    }
    // Getter y Setter
    public void setPacientes(int pacientes) {
        this.numEnfermos = pacientes;
    }

    public int getPacientes() {
        return numEnfermos;
    }

    //Método Repartir Comida propio del Hospiltal

    public void repartirComida() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Se están repartiendo " + numEnfermos * 3 + " raciones al día.");
        System.out.println("--------------------------------------------------------------------");
    }

    //Método Calcular Coste Vigilancia propio del Hospital 

    public void calcularCosteVigilancia(float superficie) {


        int numVigilantes = (int) Math.round(superficie / 1000f);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Hará(n) falta " + numVigilantes
                + " vigilante(s) para cubrir la seguridad del edificio, por lo que el coste mensual ascenderá a: "
                + numVigilantes * 1300 + "€.");
        System.out.println("----------------------------------------------------------------------------------");

    }

}

