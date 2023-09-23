import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * La clase Campeonato representa un sistema para gestionar informacion de porteros y extremos en un campeonato.
 */
public class Campeonato {
    private List<Portero> listaPorteros; // Lista de porteros registrados
    private List<Extremo> listaExtremos; // Lista de extremos registrados
    private Scanner scanner; // Objeto Scanner para la entrada de usuario

    /**
     * Constructor de la clase Campeonato.
     * Inicializa las listas de porteros y extremos, y el objeto Scanner.
     */
    public Campeonato() {
        listaPorteros = new ArrayList<>();
        listaExtremos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    /**
     * Metodo para registrar un portero.
     * Solicita al usuario ingresar informacion del portero y lo agrega a la lista de porteros.
     */
    public void registrarPortero() {
        System.out.print("Ingrese el nombre del portero: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el pais del portero: ");
        String pais = scanner.nextLine();

        System.out.print("Ingrese las faltas del portero: ");
        int faltas = scanner.nextInt();

        System.out.print("Ingrese los goles directos del portero: ");
        int golesDirectos = scanner.nextInt();

        System.out.print("Ingrese el total de lanzamientos del portero: ");
        int totalLanzamientos = scanner.nextInt();

        System.out.print("Ingrese las paradas efectivas del portero: ");
        int paradasEfectivas = scanner.nextInt();

        System.out.print("Ingrese los goles recibidos del portero: ");
        int golesRecibidos = scanner.nextInt();

        Portero portero = new Portero(nombre, pais, golesDirectos, totalLanzamientos, paradasEfectivas, golesRecibidos, faltas);
        listaPorteros.add(portero);

        scanner.nextLine(); // Limpiar el buffer
    }

    /**
     * Metodo para registrar un extremo.
     * Solicita al usuario ingresar informacion del extremo y lo agrega a la lista de extremos.
     */
    public void registrarExtremo() {
        System.out.print("Ingrese el nombre del extremo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el pais del extremo: ");
        String pais = scanner.nextLine();

        System.out.print("Ingrese las faltas del extremo: ");
        int faltas = scanner.nextInt();

        System.out.print("Ingrese los goles directos del extremo: ");
        int golesDirectos = scanner.nextInt();

        System.out.print("Ingrese el total de lanzamientos del extremo: ");
        int totalLanzamientos = scanner.nextInt();

        System.out.print("Ingrese los pases del extremo: ");
        int pases = scanner.nextInt();

        System.out.print("Ingrese las asistencias efectivas del extremo: ");
        int asistenciasEfectivas = scanner.nextInt();

        Extremo extremo = new Extremo(nombre, pais, golesDirectos, totalLanzamientos, pases, asistenciasEfectivas, faltas);
        listaExtremos.add(extremo);

        scanner.nextLine(); // Limpiar el buffer
    }

    /**
     * Metodo para mostrar la informacion de todos los jugadores registrados (porteros y extremos).
     */
    public void mostrarJugadores() {
        System.out.println("Porteros registrados en el campeonato:");
        for (Portero portero : listaPorteros) {
            System.out.println(portero);
        }

        System.out.println("Extremos registrados en el campeonato:");
        for (Extremo extremo : listaExtremos) {
            System.out.println(extremo);
        }
    }

    /**
     * Metodo para mostrar los mejores porteros en funcion de su efectividad.
     * @param cantidad La cantidad de mejores porteros a mostrar.
     */
    public void mostrarMejoresPorteros(int cantidad) {
        System.out.println("Los " + cantidad + " mejores porteros:");
        Collections.sort(listaPorteros, Comparator.comparing(Portero::calcularEfectividad).reversed());

        for (int i = 0; i < Math.min(cantidad, listaPorteros.size()); i++) {
            System.out.println(listaPorteros.get(i));
        }
    }

    /**
     * Metodo para contar la cantidad de extremos con efectividad mayor al 85%.
     * @return La cantidad de extremos con efectividad mayor al 85%.
     */
    public int contarExtremosConEfectividadMayorAl85() {
        int contador = 0;
        for (Extremo extremo : listaExtremos) {
            if (extremo.calcularEfectividad() > 85.0) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Metodo para ejecutar el programa.
     * Permite al usuario seleccionar opciones y realizar acciones en el campeonato.
     */
    public void ejecutar() {
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Registrar Portero");
            System.out.println("2. Registrar Extremo");
            System.out.println("3. Mostrar Jugadores");
            System.out.println("4. Mostrar Mejores Porteros");
            System.out.println("5. Contar Extremos con Efectividad Mayor al 85%");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarPortero();
                    break;
                case 2:
                    registrarExtremo();
                    break;
                case 3:
                    mostrarJugadores();
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de mejores porteros a mostrar: ");
                    int cantidadPorteros = scanner.nextInt();
                    mostrarMejoresPorteros(cantidadPorteros);
                    break;
                case 5:
                    int extremosConEfectividadAlta = contarExtremosConEfectividadMayorAl85();
                    System.out.println("Cantidad de extremos con efectividad mayor al 85%: " + extremosConEfectividadAlta);
                    break;
                case 6:
                    scanner.close(); // Cerrar el Scanner
                    System.exit(0); // Salir del programa
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }

    /**
     * Metodo main para iniciar el programa.
     * Crea una instancia de la clase Campeonato y la utiliza para ejecutar el programa.
     * @param args Argumentos de linea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        campeonato.ejecutar();
    }
}