import java.io.Console;

public class Ejercicio4 {
    public static void main(String[] args) {

        Console c = System.console(); // Creo Consola

        EdificioControlador ce = new EdificioControlador();
        boolean bandera = true;
       Byte menu = 0;

        while (bandera){

            System.out.println(" \n Escoge una opcion del menú \n");

            System.out.println("1 - Alta de un edificio");
            System.out.println("2 - Mostrar un edificio");
            System.out.println("3 - Eliminar un edificio");
            System.out.println("4 - Salir del menú");
            menu = Byte.parseByte(c.readLine());

        switch (menu) {
            case 1:
                ce.crearEdificio();
                break;

            case 2:
                ce.mostrarEdificio();
                break;

            case 3:
                ce.eliminarEdificio();
                break;

            case 4:
                return;

            default:
                System.out.println("Seleccione otra Opción del ménu.");

                System.out.println("¿Quieres realizar otra acción? (s/n) \n");
                String seguir = c.readLine();
                if (seguir.equals("n")) {
                    bandera = false;
                }
            }
        }
    }
}

