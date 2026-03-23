import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej41 {

    public static void main(String[] args) throws IOException {
        int opcion;
        boolean salir = false;
        String[] alumnos = new String[6];
        String[] asignaturas = new String[5];
        double[][] notas = new double[6][5];

        do {
            System.out.println("   SISTEMA DE GESTIÓN DE ALUMNOS Y NOTAS");
            System.out.println("1.  Introducir nombres de alumnos y asignaturas");
            System.out.println("2.  Introducir todas las notas");
            System.out.println("3.  Mostrar tabla completa");
            System.out.println("4.  Calcular y mostrar media de cada alumno");
            System.out.println("5.  Buscar alumno por nombre");
            System.out.println("6.  Mostrar asignatura con menor media");
            System.out.println("7.  Contar alumnos con todas aprobadas");
            System.out.println("8.  Mostrar alumnos suspendidos en asignatura");
            System.out.println("9.  Modificar nota");
            System.out.println("10. Salir");

            opcion = leerEntero("Selecciona una opción: ");

            switch (opcion) {
                case 1:
                    introducirNombres(alumnos, asignaturas);
                    break;
                case 2:
                    introducirNotas(alumnos, asignaturas, notas);
                    break;
                case 3:
                    mostrarTablaCompleta(alumnos, asignaturas, notas);
                    break;
                case 4:
                    calcularMediaAlumnos(alumnos, notas);
                    break;
                case 5:
                    buscarAlumno(alumnos, asignaturas, notas);
                    break;
                case 6:
                     asignaturaConMenorMedia();
                    break;
                case 7:
                     contarAlumnosAprobados();
                    break;
                case 8:
                     alumnosSuspendidosEnAsignatura();
                    break;
                case 9:
                    modificarNota();
                    break;
                case 10:
                    System.out.println("¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (!salir);
    }

    // OPCION 1
    public static void introducirNombres(String[] alumnos, String[] asignaturas) throws IOException {

        System.out.println("\n--- Nombres de Alumnos ---");
        for (int i = 0; i < alumnos.length; i++) {
            String nombre;
            do {
                nombre = leerString("Alumno " + (i + 1) + ": ");
                if (nombre.isEmpty()) {
                    System.out.println("El nombre del alumno no puede estar vacío.");
                }
            } while (nombre.isEmpty());
            alumnos[i] = nombre;
        }

        System.out.println("\n--- Nombres de Asignaturas ---");
        for (int i = 0; i < asignaturas.length; i++) {
            String asignatura;
            do {
                asignatura = leerString("Asignatura " + (i + 1) + ": ");
                if (asignatura.isEmpty()) {
                    System.out.println("El nombre de a asignatura no puede estar vacío.");
                }
            } while (asignatura.isEmpty());
            asignaturas[i] = asignatura;
        }

    }

    // OPCION 2
    public static void introducirNotas(String[] alumnos, String[] asignaturas, double[][] notas) throws IOException {
        System.out.println("--- INTRODUCIR NOTAS ---\n");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("--- Notas de " + alumnos[i] + " ---");
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = leerNota("Introduce la nota de " + asignaturas[j] + ": ");
            }
            System.out.println();
        }

        System.out.println("Todas las notas han sido introducidas.");

    }

    // OPCION 3
    public static void mostrarTablaCompleta(String[] alumnos, String[] asignaturas, double[][] notas) {
        System.out.println("\n--- TABLA COMPLETA ---\n");
        System.out.print("\t\t");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print(asignaturas[i] + "\t\t");
        }
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            System.out.print(alumnos[i] + "\t\t");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // OPCION 4 - Calcular y mostrar media de cada alumno con su nombre
    public static void calcularMediaAlumnos(String[] alumnos, double[][] notas) {
        System.out.println("\n--- MEDIA DE CADA ALUMNO ---\n");
        for (int i = 0; i < notas.length; i++) {
            double media = 0;
            for (int j = 0; j < notas[i].length; j++) {
                media += notas[i][j];
            }
            media /= notas[i].length;
            System.out.println(alumnos[i] + ": " + media);
        }
    }

    // OPCION 5 - Buscar alumno por nombre
    public static void buscarAlumno(String[] alumnos, String[] asignaturas, double[][] notas) throws IOException {
        System.out.println("\n--- BUSCAR ALUMNO ---\n");
        String nombre = leerString("Introduce el nombre del alumno: ");

        boolean encontrado = false;

        for (int i = 0; i < alumnos.length && !encontrado; i++) {
            if (alumnos[i].equalsIgnoreCase(nombre)) {
                System.out.println("\n--- NOTAS DE " + alumnos[i] + " ---\n");
                for (int j = 0; j < asignaturas.length; j++) {
                    System.out.println(asignaturas[j] + ": " + notas[i][j]);
                }

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }
 // --- OPCION 6: Mostrar asignatura con menor media ---
    public static void asignaturaConMenorMedia(String[] asignaturas, double[][] notas) {
        if (asignaturas[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos de notas/asignaturas para calcular la media.");
            return;
        }
        
        System.out.println("\n--- ASIGNATURA CON MENOR MEDIA ---\n");
        
        int numAsignaturas = asignaturas.length;
        int numAlumnos = notas.length;
        double[] mediasAsignaturas = new double[numAsignaturas];
        
        // 1. Calcular la media de cada asignatura (iterando por columnas)
        for (int j = 0; j < numAsignaturas; j++) {
            double sumaNotas = 0;
            for (int i = 0; i < numAlumnos; i++) {
                sumaNotas += notas[i][j];
            }
            mediasAsignaturas[j] = (numAlumnos > 0) ? sumaNotas / numAlumnos : 0; 
        }
        
        // 2. Encontrar la media más baja
        double menorMedia = mediasAsignaturas[0];
        int indiceMenor = 0;
        
        for (int j = 1; j < numAsignaturas; j++) {
            if (mediasAsignaturas[j] < menorMedia) {
                menorMedia = mediasAsignaturas[j];
                indiceMenor = j;
            }
        }
        
        // 3. Mostrar el resultado
        System.out.printf("La asignatura con la menor media es **%s** con una media de **%.2f**.\n", 
                         asignaturas[indiceMenor], menorMedia);
    }
    
    // --- OPCION 7: Contar alumnos con todas aprobadas ---
    public static void contarAlumnosAprobados(String[] alumnos, double[][] notas) {
        if (alumnos[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos de alumnos/notas para contar aprobados.");
            return;
        }
        
        System.out.println("\n--- ALUMNOS CON TODAS LAS ASIGNATURAS APROBADAS ---\n");
        
        int contadorAprobados = 0;
        double notaMinimaAprobado = 5.0; 

        // Iterar sobre cada alumno (fila)
        for (int i = 0; i < notas.length; i++) {
            boolean todasAprobadas = true;
            
            // Iterar sobre las notas de ese alumno (columnas)
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < notaMinimaAprobado) {
                    todasAprobadas = false;
                    break; 
                }
            }
            
            if (todasAprobadas) {
                System.out.println("- " + alumnos[i]);
                contadorAprobados++;
            }
        }
        
        System.out.println("\nTotal de alumnos con todas aprobadas: **" + contadorAprobados + "**");
    }
    
    // --- OPCION 8: Mostrar alumnos suspendidos en asignatura ---
    public static void alumnosSuspendidosEnAsignatura(String[] alumnos, String[] asignaturas, double[][] notas) throws IOException {
        if (alumnos[0] == null || asignaturas[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos de alumnos/asignaturas/notas.");
            return;
        }
        
        System.out.println("\n--- ALUMNOS SUSPENDIDOS EN ASIGNATURA ESPECÍFICA ---\n");
        
        // Mostrar lista de asignaturas para selección
        System.out.println("Asignaturas disponibles:");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println((i + 1) + ". " + asignaturas[i]);
        }
        
        // Pedir la selección
        int opcionAsignatura;
        int indiceAsignatura = -1;
        do {
            opcionAsignatura = leerEntero("Selecciona el número de la asignatura: ");
            if (opcionAsignatura >= 1 && opcionAsignatura <= asignaturas.length) {
                indiceAsignatura = opcionAsignatura - 1;
            } else {
                System.out.println("Opción de asignatura inválida. Intenta de nuevo.");
            }
        } while (indiceAsignatura == -1);

        String nombreAsignatura = asignaturas[indiceAsignatura];
        double notaMinimaAprobado = 5.0; 
        
        System.out.println("\nAlumnos suspendidos en **" + nombreAsignatura + "** (nota < " + notaMinimaAprobado + "):");
        
        int contadorSuspendidos = 0;
        
        // Iterar sobre cada alumno (fila)
        for (int i = 0; i < notas.length; i++) {
            double nota = notas[i][indiceAsignatura];
            
            if (nota < notaMinimaAprobado) {
                System.out.printf("- %-10s (Nota: %.2f)\n", alumnos[i], nota);
                contadorSuspendidos++;
            }
        }
        
        System.out.println("\nTotal de alumnos suspendidos en " + nombreAsignatura + ": **" + contadorSuspendidos + "**");
    }
    
    // --- OPCION 9: Modificar nota ---
    public static void modificarNota(String[] alumnos, String[] asignaturas, double[][] notas) throws IOException {
        if (alumnos[0] == null || asignaturas[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos para modificar notas.");
            return;
        }
        
        System.out.println("\n--- MODIFICAR NOTA ---\n");
        
        // 1. Pedir el nombre del alumno (usa el leerString corregido)
        String nombreAlumno = leerString("Introduce el nombre del alumno cuya nota quieres modificar: ");
        int indiceAlumno = buscarAlumno(alumnos, nombreAlumno);

        if (indiceAlumno == -1) {
            System.out.println("Alumno no encontrado.");
            return;
        }

        // 2. Mostrar asignaturas y pedir selección
        System.out.println("\nAsignaturas de " + alumnos[indiceAlumno] + ":");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.printf("%d. %-15s (Nota actual: %.2f)\n", (i + 1), asignaturas[i], notas[indiceAlumno][i]);
        }

        int opcionAsignatura;
        int indiceAsignatura = -1;
        do {
            opcionAsignatura = leerEntero("Selecciona el número de la asignatura a modificar: ");
            if (opcionAsignatura >= 1 && opcionAsignatura <= asignaturas.length) {
                indiceAsignatura = opcionAsignatura - 1;
            } else {
                System.out.println("Opción de asignatura inválida. Intenta de nuevo.");
            }
        } while (indiceAsignatura == -1);
        
        String nombreAsignatura = asignaturas[indiceAsignatura];

        // 3. Pedir la nueva nota
        double nuevaNota = leerNota("Introduce la **nueva nota** para " + nombreAsignatura + ": ");

        // 4. Modificar la nota
        notas[indiceAlumno][indiceAsignatura] = nuevaNota;

        System.out.printf("\n¡Nota modificada con éxito! La nueva nota de **%s** en **%s** es **%.2f**.\n", 
                          alumnos[indiceAlumno], nombreAsignatura, nuevaNota);
    }
 // 🆕 OPCION 6: Mostrar asignatura con menor media
    public static void asignaturaConMenorMedia(String[] asignaturas, double[][] notas) {
        if (asignaturas[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos de notas/asignaturas para calcular la media.");
            return;
        }
        
        System.out.println("\n--- ASIGNATURA CON MENOR MEDIA ---\n");
        
        int numAsignaturas = asignaturas.length;
        int numAlumnos = notas.length;
        double[] mediasAsignaturas = new double[numAsignaturas];
        
        // 1. Calcular la media de cada asignatura (iterando por columnas)
        for (int j = 0; j < numAsignaturas; j++) { 
            double sumaNotas = 0;
            for (int i = 0; i < numAlumnos; i++) { 
                sumaNotas += notas[i][j];
            }
            mediasAsignaturas[j] = (numAlumnos > 0) ? sumaNotas / numAlumnos : 0; 
        }
        
        // 2. Encontrar la media más baja
        double menorMedia = mediasAsignaturas[0];
        int indiceMenor = 0;
        
        for (int j = 1; j < numAsignaturas; j++) {
            if (mediasAsignaturas[j] < menorMedia) {
                menorMedia = mediasAsignaturas[j];
                indiceMenor = j;
            }
        }
        
        // 3. Mostrar el resultado
        System.out.printf("La asignatura con la menor media es **%s** con una media de **%.2f**.\n", 
                         asignaturas[indiceMenor], menorMedia);
    }
    
    // 🆕 OPCION 7: Contar alumnos con todas aprobadas
    public static void contarAlumnosAprobados(String[] alumnos, double[][] notas) {
        if (alumnos[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos de alumnos/notas para contar aprobados.");
            return;
        }
        
        System.out.println("\n--- ALUMNOS CON TODAS LAS ASIGNATURAS APROBADAS ---\n");
        
        int contadorAprobados = 0;
        double notaMinimaAprobado = 5.0; 

        // Iterar sobre cada alumno (fila)
        for (int i = 0; i < notas.length; i++) {
            boolean todasAprobadas = true;
            
            // Iterar sobre las notas de ese alumno
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < notaMinimaAprobado) {
                    todasAprobadas = false;
                    break; // No necesita revisar las demás notas de este alumno
                }
            }
            
            if (todasAprobadas) {
                System.out.println("- " + alumnos[i]);
                contadorAprobados++;
            }
        }
        
        System.out.println("\nTotal de alumnos con todas aprobadas: **" + contadorAprobados + "**");
    }
    
    // 🆕 OPCION 8: Mostrar alumnos suspendidos en asignatura
    public static void alumnosSuspendidosEnAsignatura(String[] alumnos, String[] asignaturas, double[][] notas) throws IOException {
        if (alumnos[0] == null || asignaturas[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos de alumnos/asignaturas/notas.");
            return;
        }
        
        System.out.println("\n--- ALUMNOS SUSPENDIDOS EN ASIGNATURA ESPECÍFICA ---\n");
        
        // Mostrar lista de asignaturas para selección
        System.out.println("Asignaturas disponibles:");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println((i + 1) + ". " + asignaturas[i]);
        }
        
        // Pedir la selección
        int opcionAsignatura;
        int indiceAsignatura = -1;
        do {
            opcionAsignatura = leerEntero("Selecciona el número de la asignatura: ");
            if (opcionAsignatura >= 1 && opcionAsignatura <= asignaturas.length) {
                indiceAsignatura = opcionAsignatura - 1;
            } else {
                System.out.println("Opción de asignatura inválida. Intenta de nuevo.");
            }
        } while (indiceAsignatura == -1);

        String nombreAsignatura = asignaturas[indiceAsignatura];
        double notaMinimaAprobado = 5.0; 
        
        System.out.println("\nAlumnos suspendidos en **" + nombreAsignatura + "** (nota < " + notaMinimaAprobado + "):");
        
        int contadorSuspendidos = 0;
        
        // Iterar sobre cada alumno (fila) y revisar la columna de la asignatura seleccionada
        for (int i = 0; i < notas.length; i++) {
            double nota = notas[i][indiceAsignatura];
            
            if (nota < notaMinimaAprobado) {
                System.out.printf("- %-10s (Nota: %.2f)\n", alumnos[i], nota);
                contadorSuspendidos++;
            }
        }
        
        System.out.println("\nTotal de alumnos suspendidos en " + nombreAsignatura + ": **" + contadorSuspendidos + "**");
    }
    
    // 🆕 OPCION 9: Modificar nota
    public static void modificarNota(String[] alumnos, String[] asignaturas, double[][] notas) throws IOException {
        if (alumnos[0] == null || asignaturas[0] == null || notas.length == 0 || notas[0].length == 0) {
            System.out.println("\n**Error:** No hay datos para modificar notas.");
            return;
        }
        
        System.out.println("\n--- MODIFICAR NOTA ---\n");
        
        // 1. Pedir el nombre del alumno (USO DEL MÉTODO leerString CORREGIDO)
        String nombreAlumno = leerString("Introduce el nombre del alumno cuya nota quieres modificar: ");
        int indiceAlumno = buscarIndiceAlumno(alumnos, nombreAlumno);

        if (indiceAlumno == -1) {
            System.out.println("Alumno no encontrado.");
            return;
        }

        // 2. Mostrar asignaturas y pedir selección
        System.out.println("\nAsignaturas de " + alumnos[indiceAlumno] + ":");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.printf("%d. %-15s (Nota actual: %.2f)\n", (i + 1), asignaturas[i], notas[indiceAlumno][i]);
        }

        int opcionAsignatura;
        int indiceAsignatura = -1;
        do {
            opcionAsignatura = leerEntero("Selecciona el número de la asignatura a modificar: ");
            if (opcionAsignatura >= 1 && opcionAsignatura <= asignaturas.length) {
                indiceAsignatura = opcionAsignatura - 1;
            } else {
                System.out.println("Opción de asignatura inválida. Intenta de nuevo.");
            }
        } while (indiceAsignatura == -1);
        
        String nombreAsignatura = asignaturas[indiceAsignatura];

        // 3. Pedir la nueva nota
        double nuevaNota = leerNota("Introduce la **nueva nota** para " + nombreAsignatura + ": ");

        // 4. Modificar la nota
        notas[indiceAlumno][indiceAsignatura] = nuevaNota;

        System.out.printf("\n¡Nota modificada con éxito! La nueva nota de **%s** en **%s** es **%.2f**.\n", 
                          alumnos[indiceAlumno], nombreAsignatura, nuevaNota);
    }
    // Metodos auxiliares
    public static int leerEntero(String mensaje) throws IOException {
        int numero = -1;
        boolean valido = false;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(leer.readLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número entero.");
            }
        }

        return numero;
    }

    public static String leerString(String mensaje) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mensaje);
        return leer.readLine();
    }

    private static double leerNota(String mensaje) throws IOException {
        double nota = -1;
        boolean valida = false;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        while (!valida) {
            try {
                System.out.print(mensaje);
                nota = Double.parseDouble(leer.readLine());

                if (nota >= 0 && nota <= 10) {
                    valida = true;
                } else {
                    System.out.println("Error: La nota debe estar entre 0 y 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número válido.");
            }
        }

        return nota;
    }
    

}