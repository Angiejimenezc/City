// Creo Clase Hotel  (hija)

class Hotel extends Edificio {

    private int habitaciones;

    // Creo el Constructor de la clase Hotel

    public Hotel(String nombreHotel, short plantasHotel, float superficieHotel, int habitaciones) {
        super(nombreHotel, plantasHotel, superficieHotel);
        this.habitaciones = habitaciones;
    }
    // Getter / Setter atributos 
    public int getHabitaciones() {
        return habitaciones;
    }
    public void setHabitacines(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    // Método Servicio de Habitaciones propio de Hotel 
    public void servicioHabitaciones(int numHabitaciones) {

        int personas = (int) Math.round(numHabitaciones / 20f);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Hace(n) falta " + personas + " persona(s) para atender el servicio de habitaciones.");
        System.out.println("El coste total del servicio de habitaciones es de : "
                + (float) personas * 1000 + "€.");
        System.out.println("-----------------------------------------------------------------------------------");

    }

    //Método Calcular Coste Vigilancia propio del Hotel 

    public void calcularCosteVigilancia(float superficie) {

        int numVigilantes = (int) Math.round(superficie / 1000f);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hará(n) falta " + numVigilantes
                + " vigilante(s) para cubrir la seguridad del edificio y el coste mensual es de : "
                + (numVigilantes * 1800) +  " Incluido 500 € plus de peligrosidad €.");
        System.out.println("--------------------------------------------------------------------");
    }

}


