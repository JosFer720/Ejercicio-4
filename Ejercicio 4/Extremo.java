/**
 * La clase Extremo representa a un extremo en un deporte como el fútbol.
 * Extiende la clase Jugador.
 */
public class Extremo extends Jugador {
    private int pases; // Número de pases realizados por el extremo
    private int asistenciasEfectivas; // Número de asistencias efectivas realizadas por el extremo
    private int faltas; // Número de faltas cometidas por el extremo

    /**
     * Constructor de la clase Extremo.
     *
     * @param nombre                Nombre del extremo.
     * @param pais                  País de origen del extremo.
     * @param golesDirectos         Cantidad de goles directos anotados por el extremo.
     * @param totalLanzamientos     Total de lanzamientos realizados por el extremo.
     * @param pases                 Número de pases realizados por el extremo.
     * @param asistenciasEfectivas  Número de asistencias efectivas realizadas por el extremo.
     * @param faltas                Número de faltas cometidas por el extremo.
     */
    public Extremo(String nombre, String pais, int golesDirectos, int totalLanzamientos,
                   int pases, int asistenciasEfectivas, int faltas) {
        super(nombre, pais, golesDirectos, totalLanzamientos, "Extremo");
        this.pases = pases;
        this.asistenciasEfectivas = asistenciasEfectivas;
        this.faltas = faltas;
    }

    /**
     * Calcula la efectividad del extremo.
     *
     * @return La efectividad del extremo como un valor decimal.
     */
    @Override
    public double calcularEfectividad() {
        return ((pases + asistenciasEfectivas - faltas) * 100.0) / (pases + asistenciasEfectivas + faltas) +
                (getGolesDirectos() * 100.0) / getTotalLanzamientos();
    }

    /**
     * Devuelve una representación en cadena del extremo.
     *
     * @return Una cadena que contiene el nombre, país, efectividad y tipo de jugador del extremo.
     */
    @Override
    public String toString() {
        return super.toString() + " (Extremo)";
    }

    // Getters y setters específicos de la clase Extremo

    /**
     * Obtiene el número de pases realizados por el extremo.
     *
     * @return El número de pases realizados por el extremo.
     */
    public int getPases() {
        return pases;
    }

    /**
     * Establece el número de pases realizados por el extremo.
     *
     * @param pases El nuevo número de pases realizados por el extremo.
     */
    public void setPases(int pases) {
        this.pases = pases;
    }

    /**
     * Obtiene el número de asistencias efectivas realizadas por el extremo.
     *
     * @return El número de asistencias efectivas realizadas por el extremo.
     */
    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    /**
     * Establece el número de asistencias efectivas realizadas por el extremo.
     *
     * @param asistenciasEfectivas El nuevo número de asistencias efectivas realizadas por el extremo.
     */
    public void setAsistenciasEfectivas(int asistenciasEfectivas) {
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    /**
     * Obtiene el número de faltas cometidas por el extremo.
     *
     * @return El número de faltas cometidas por el extremo.
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * Establece el número de faltas cometidas por el extremo.
     *
     * @param faltas El nuevo número de faltas cometidas por el extremo.
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
