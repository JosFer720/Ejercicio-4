/**
 * La clase Portero representa a un portero en un deporte como el fútbol.
 * Extiende la clase Jugador.
 */
public class Portero extends Jugador {
    private int paradasEfectivas; // Número de paradas efectivas realizadas por el portero
    private int golesRecibidos;   // Número de goles recibidos por el portero
    private int faltas;           // Número de faltas cometidas por el portero

    /**
     * Constructor de la clase Portero.
     *
     * @param nombre           Nombre del portero.
     * @param pais             País de origen del portero.
     * @param golesDirectos    Cantidad de goles directos anotados por el portero.
     * @param totalLanzamientos Total de lanzamientos realizados por el portero.
     * @param paradasEfectivas Número de paradas efectivas realizadas por el portero.
     * @param golesRecibidos   Número de goles recibidos por el portero.
     * @param faltas           Número de faltas cometidas por el portero.
     */
    public Portero(String nombre, String pais, int golesDirectos, int totalLanzamientos,
                   int paradasEfectivas, int golesRecibidos, int faltas) {
        super(nombre, pais, golesDirectos, totalLanzamientos, "Portero");
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
        this.faltas = faltas;
    }

    /**
     * Calcula la efectividad del portero.
     *
     * @return La efectividad del portero como un valor decimal.
     */
    @Override
    public double calcularEfectividad() {
        return ((paradasEfectivas - golesRecibidos) * 100.0) / (paradasEfectivas + golesRecibidos) +
                (getGolesDirectos() * 100.0) / getTotalLanzamientos();
    }

    /**
     * Devuelve una representación en cadena del portero.
     *
     * @return Una cadena que contiene el nombre, país, efectividad y tipo de jugador del portero.
     */
    @Override
    public String toString() {
        return super.toString() + " (Portero)";
    }

    // Getters y setters específicos de la clase Portero

    /**
     * Obtiene el número de paradas efectivas realizadas por el portero.
     *
     * @return El número de paradas efectivas realizadas por el portero.
     */
    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    /**
     * Establece el número de paradas efectivas realizadas por el portero.
     *
     * @param paradasEfectivas El nuevo número de paradas efectivas realizadas por el portero.
     */
    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    /**
     * Obtiene el número de goles recibidos por el portero.
     *
     * @return El número de goles recibidos por el portero.
     */
    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    /**
     * Establece el número de goles recibidos por el portero.
     *
     * @param golesRecibidos El nuevo número de goles recibidos por el portero.
     */
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    /**
     * Obtiene el número de faltas cometidas por el portero.
     *
     * @return El número de faltas cometidas por el portero.
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * Establece el número de faltas cometidas por el portero.
     *
     * @param faltas El nuevo número de faltas cometidas por el portero.
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}