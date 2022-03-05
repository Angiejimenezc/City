import java.io.Console;

public class EdificioControlador {

    Console c = System.console();

    // Instacio arrays de Hotel / Hospital y Cine
    Hotel hoteles[] = new Hotel[5];
    Hospital hospitales[] = new Hospital[5];
    Cine cines[] = new Cine[5];
    boolean vacio;
    Byte menu = 0;

    // Método Crear Edificio

    public void crearEdificio() {

        System.out.println("------------------------------------------");
        System.out.println("¿Qué tipo de edificio quieres crear ?\n ");

        System.out.println("1 - Hotel");
        System.out.println("2 - Hospital");
        System.out.println("3 - Cine");
        System.out.println("4 - Salir");

        menu = Byte.parseByte(c.readLine());
        switch (menu) {

            // Crear un Hotel
            case 1:
                System.out.println("------------------------------------------");
                System.out.println("Introduce el nombre del hotel: \n ");
                String nombreHotel = c.readLine();
                byte posHotel = 0;
                // Bucle para no sobrepasar el número de hoteles 
                while (posHotel < 5) {
                    //Diferente a null y buscar coincidencia
                    if (hoteles[posHotel] != null && hoteles[posHotel].getNombre().equals(nombreHotel)) {
                        break;
                    }
                    //Incremento 
                    posHotel++;
                }
                    posHotel = -1;
                    //recorro y encuentro posición en el array
                for (byte i = 0; i < hoteles.length; i++) {

                    if (hoteles[i] == null) {
                        posHotel = i;
                    }

                }

                //Pido información del Hotel
                System.out.println("Introduce el número de plantas que tiene:");
                short numPlantasHotel = Short.parseShort(c.readLine());
                System.out.println("Introduce la superficie (m2):");
                float superficieHotel = Float.parseFloat(c.readLine());
                System.out.println("Introduce el número de habitaciones:");
                int habitaciones = Integer.parseInt(c.readLine());
                //Instanciamos Array Hotel 
                hoteles[posHotel] = new Hotel(nombreHotel, numPlantasHotel, superficieHotel, habitaciones);

                System.out.println("------------------------------------------");
                System.out.println("El hotel se ha creado correctamente.");
                break;

                // Crear Un Hospital
            case 2:
                System.out.println("------------------------------------------");
                System.out.println("Introduce el nombre del hospital:");
                String nombreHospital = c.readLine();

                byte posHospital = 0;
                //comprobar que no existe el nombre y que hay espacio en el array
                while (posHospital < 5) {
                    if (hospitales[posHospital] != null && hospitales[posHospital].getNombre().equals(nombreHospital)) {
                        break;
                    }
                    posHospital++;
                }
                posHospital = -1;
                for (byte i = 0; i < hospitales.length; i++) {

                    if (hospitales[i] == null) {
                        posHospital = i;
                    }

                }

                // Pido más datos
                System.out.println("Introduce el número de plantas que tiene:");
                short numPlantasHospital = Short.parseShort(c.readLine());
                System.out.println("Introduce la superficie (m2):");
                float superficieHospital = Float.parseFloat(c.readLine());
                System.out.println("Introduce el número de pacientes que tiene actualmente:");
                int pacientes = Integer.parseInt(c.readLine());

                hospitales[posHospital] = new Hospital(nombreHospital, numPlantasHospital, superficieHospital,
                        pacientes);
                System.out.println("------------------------------------------");
                System.out.println("El hospital se ha creado correctamente.");
                break;

            // Crear un Cine
            case 3:
                System.out.println("------------------------------------------");
                System.out.println("Introduce el nombre del cine:");
                String nombreCine = c.readLine();
                byte posCine = 0;

                while (posCine < 5) {
                     //comprobar que no existe el nombre y que hay espacio en el array
                    if (cines[posCine] != null && cines[posCine].getNombre().equals(nombreCine)) {
                        break;
                    }
                    posCine++;
                }
                posCine = -1;
                for (byte i = 0; i < cines.length; i++) {

                    if (cines[i] == null) {
                        posCine = i;
                    }

                }

                // Pido datos 
                System.out.println("Introduce el número de plantas que tiene:");
                short numPlantasCine = Short.parseShort(c.readLine());
                System.out.println("Introduce la superficie (m2):");
                float superficieCine = Float.parseFloat(c.readLine());
                cines[posCine] = new Cine(nombreCine, numPlantasCine, superficieCine);
                System.out.println("------------------------------------------");
                System.out.println("El cine se ha creado correctamente.");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Método Mostrar Edificio

    public void mostrarEdificio() {

        System.out.println("¿Qué tipo de edificio quieres ver ? \n ");
        System.out.println("1 - Hotel");
        System.out.println("2 - Hospital");
        System.out.println("3 - Cine");
        System.out.println("4 - Salir");

        menu = Byte.parseByte(c.readLine());
        switch (menu) {

            // Hotel
            case 1:

                System.out.println("------------------------------------------");
                System.out.println("Introduce el ID del hotel que deseas ver:");
                System.out.println("------------------------------------------");
                for (int i = 0; i < hoteles.length; i++) {
                    if (hoteles[i] == null) { 
                        continue;
                    }
                    System.out.println("El ID " + (i + 1) + " - " + hoteles[i].getNombre());
                }

                int posHotel = (Integer.parseInt(c.readLine())) - 1;
                if (posHotel < 0 || posHotel >= hoteles.length || hoteles[posHotel] == null) {
                    System.out.println("El ID introducido no existe.");
                    return;
                }

                System.out.println("------------------------------------------");
                System.out.println("El " + hoteles[posHotel].getNombre() + ", de " + hoteles[posHotel].getSuperficie()
                        + " m2 y " + hoteles[posHotel].getPlantas() + " planta(s), tiene "
                        + hoteles[posHotel].getHabitaciones() + " habitaciones.");
                hoteles[posHotel].limpiar(hoteles[posHotel].getPlantas(), hoteles[posHotel].getSuperficie());
                hoteles[posHotel].calcularCosteVigilancia(hoteles[posHotel].getSuperficie());
                hoteles[posHotel].servicioHabitaciones(hoteles[posHotel].getHabitaciones());
                break;
            
            // Hospital
            case 2:

                System.out.println("------------------------------------------");
                System.out.println("Introduce El ID del hospital que deseas consultar:");
                System.out.println("------------------------------------------");
                for (int i = 0; i < hospitales.length; i++) {
                    if (hospitales[i] == null) {
                        continue;
                    }
                    System.out.println("El ID " + (i + 1) + " - " + hospitales[i].getNombre());
                }

                int posHospital = (Integer.parseInt(c.readLine())) - 1;
                if (posHospital < 0 || posHospital >= hospitales.length || hospitales[posHospital] == null) {
                    System.out.println("El ID introducido no existe.");
                    return;
                }

                System.out.println("------------------------------------------");
                System.out.println("El " + hospitales[posHospital].getNombre() + ", de "
                        + hospitales[posHospital].getSuperficie() + " m2 y " + hospitales[posHospital].getPlantas()
                        + " planta(s), tiene actualmente " + hospitales[posHospital].getPacientes() + " pacientes.");
                hospitales[posHospital].limpiar(hospitales[posHospital].getPlantas(),
                        hospitales[posHospital].getSuperficie());
                hospitales[posHospital].calcularCosteVigilancia(hospitales[posHospital].getSuperficie());
                hospitales[posHospital].repartirComida();
                break;

            // Cine
            case 3:

                System.out.println("------------------------------------------");
                System.out.println("Introduce el ID del cine que deseas consultar:");
                System.out.println("------------------------------------------");
                for (int i = 0; i < cines.length; i++) {
                    if (cines[i] == null) {
                        continue;
                    }
                    System.out.println("El ID" + (i + 1) + " - " + cines[i].getNombre());
                }

                int posCine = (Integer.parseInt(c.readLine())) - 1;
                if (posCine < 0 || posCine >= cines.length || cines[posCine] == null) {
                    System.out.println("El ID introducido no existe.");
                    return;
                }

                System.out.println("------------------------------------------");
                System.out.println("El " + cines[posCine].getNombre() + " tiene " + cines[posCine].getSuperficie()
                        + " m2 y " + cines[posCine].getPlantas() + " planta(s).");
                cines[posCine].limpiar(cines[posCine].getPlantas(), cines[posCine].getSuperficie());
                cines[posCine].calcularCosteVigilancia(cines[posCine].getSuperficie());

                System.out.println("------------------------------------------");
                System.out.println("¿Desea saber la recaudación de alguna sesión? (s/n)");
                String respuesta = c.readLine();

                if (respuesta.equals("s")) {
                    System.out.println("Introduce el aforo máximo de la sala:");
                    int aforo = Integer.parseInt(c.readLine());
                    System.out.println("Introduce el precio de cada entrada:");
                    float entrada = Float.parseFloat(c.readLine());
                    System.out.println("Introduce el número de asistentes:");
                    int asistentes = Integer.parseInt(c.readLine());
                    if (asistentes > aforo) {
                        System.out.println("------------------------------------------");
                        System.out.println("El número de asistentes supera el aforo máximo.");
                        return;
                    }
                    cines[posCine].proyectarSesion(entrada, asistentes);

                } else {
                    return;
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Método Eliminar Edificio

    public void eliminarEdificio() {

        System.out.println("------------------------------------------");
        System.out.println("¿Qué tipo de edificio quieres eliminar? \n ");
        System.out.println("1 - Hotel");
        System.out.println("2 - Hospital");
        System.out.println("3 - Cine");
        System.out.println("4 - Salir");
        System.out.println("------------------------------------------");

        menu = Byte.parseByte(c.readLine());
        switch (menu) {
           
            // Hotel
            case 1:

                System.out.println("------------------------------------------");
                System.out.println("Introduce el ID del hotel que deseas eliminar:");
                System.out.println("------------------------------------------");
                for (int i = 0; i < hoteles.length; i++) {
                    if (hoteles[i] == null) {  
                        continue;
                    }
                    System.out.println("El ID" + (i + 1) + " - " + hoteles[i].getNombre());
                }

                int posHotel = (Integer.parseInt(c.readLine())) - 1;
                if (posHotel <= 0 || posHotel >= hoteles.length || hoteles[posHotel] == null) {
                    System.out.println("El nombre introducido no existe.");
                    return;
                }

                hoteles[posHotel] = null;
                System.out.println("El hotel se ha eliminado correctamente.");
                break;
            
            // Hospital
            case 2:

                System.out.println("------------------------------------------");
                System.out.println("Introduce el ID del hospital que deseas eliminar:");
                System.out.println("------------------------------------------");
                for (int i = 0; i < hospitales.length; i++) {
                    if (hospitales[i] == null) {
                        continue;
                    }
                    System.out.println("El ID " + (i + 1) + " - " + hospitales[i].getNombre());
                }

                int posHospital = (Integer.parseInt(c.readLine())) - 1;
                if (posHospital <= 0 || posHospital >= hospitales.length || hospitales[posHospital] == null) {
                    System.out.println("El ID introducido no existe.");
                    return;
                }

                hospitales[posHospital] = null;
                System.out.println("El hospital se ha eliminado correctamente.");
                break;
           
            // Cine
            case 3:

                System.out.println("------------------------------------------");
                System.out.println("Introduce el ID del cine que deseas eliminar:");
                System.out.println("------------------------------------------");
                for (int i = 0; i < cines.length; i++) {
                    if (cines[i] == null) {
                        continue;
                    }
                    System.out.println("El ID " + (i + 1) + " - " + cines[i].getNombre());
                }

                int posCine = (Integer.parseInt(c.readLine())) - 1;
                if (posCine <= 0 || posCine >= cines.length || cines[posCine] == null) {
                    System.out.println("El ID introducido no existe.");
                    return;
                }
                cines[posCine] = null;
                System.out.println("El cine se ha eliminado correctamente.");
                break;

            default:
                System.out.println("Opción no válida, Seleccione otra Opción del ménu.");
                break;
        }
    }

}