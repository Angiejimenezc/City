import java.io.Console;

// Clase Edificio - Padre 

public class Edificio {

    Console console = System.console();

    private String nombre;
    private short plantas;
    private float superficie;

    // Creo el Constructor de la clase

    public Edificio(String nombreEdf, short plantasEdf, float superficieEdf) {
        nombre = nombreEdf;
        plantas = plantasEdf;
        superficie = superficieEdf;
    }

    // Método limpiar()

    public void limpiar(short plantas, float superficie) {
        // Un minuto por cada 5 m²
        double tiempoMin = superficie / 5;

        if (plantas > 1) {
            tiempoMin = tiempoMin + ((plantas - 1) * 0.5);
        }
        // Uso método Math.round Redondeo // Marh.abs Valor absoluto
        double tiempoTotal = (Math.round(tiempoMin * 100d) / 100d) / 60;
        int horas = (int) Math.abs(tiempoTotal);
        int minutos = (int) ((tiempoTotal - horas) * 60);
        System.out.println("---------------------------------------------------------");
        System.out.println("Se tardará en limpiar " + horas + " hora(s) y " + minutos + " minuto(s).");
        System.out.println("El coste para la limpieza es de: " + Math.round((tiempoMin * 30) * 100d) / 100d + "€ mes");
        System.out.println("-------------------------------------------------------");
    }

    // Getters / Setters
    public String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;

    }

    void setPlantas(short plantas) {
        this.plantas = plantas;
    }

    public short getPlantas() {
        return plantas;
    }

    public float getSuperficie() {
        return superficie;
    }

    void setSuperficie(float superficie) {
        this.superficie = superficie;
    }
}
