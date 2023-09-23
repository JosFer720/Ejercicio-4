/**
 * La clase Jugador representa a un jugador en un deporte.
 */
public class Jugador {
    private String nombre;         // Nombre del jugador
    private String pais;           // País de origen del jugador
    private int golesDirectos;     // Cantidad de goles directos anotados por el jugador
    private int totalLanzamientos; // Total de lanzamientos realizados por el jugador
    private String tipoJugador;    // Tipo de jugador (por ejemplo, Portero o Extremo)

    /**
     * Constructor de la clase Jugador.
     *
     * @param nombre Nombre del jugador.
     * @param pais País de origen del jugador.
     * @param golesDirectos Cantidad de goles directos anotados por el jugador.
     * @param totalLanzamientos Total de lanzamientos realizados por el jugador.
     * @param tipoJugador Tipo de jugador (por ejemplo, Portero o Extremo).
     */
    public Jugador(String nombre, String pais, int golesDirectos, int totalLanzamientos, String tipoJugador) {
        this.nombre = nombre;
        this.pais = pais;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
        this.tipoJugador = tipoJugador;
    }

    /**
     * Calcula la efectividad del jugador.
     *
     * @return La efectividad del jugador como un valor decimal.
     *         Este método se implementará en las clases hijas Portero y Extremo.
     */
    public double calcularEfectividad() {
        return 0.0; // Este método se implementará en las clases Portero y Extremo.
    }

    /**
     * Devuelve una representación en cadena del jugador.
     *
     * @return Una cadena que contiene el nombre, país y efectividad del jugador.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", País: " + pais + ", Efectividad: " + calcularEfectividad() + "%";
    }

    // Getters y setters

    // Aquí se encuentran los getters y setters para los campos privados de la clase.
    // Estos métodos permiten acceder y modificar los valores de los campos.

    // Getters

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el país de origen del jugador.
     *
     * @return El país de origen del jugador.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Obtiene la cantidad de goles directos anotados por el jugador.
     *
     * @return La cantidad de goles directos anotados por el jugador.
     */
    public int getGolesDirectos() {
        return golesDirectos;
    }

    /**
     * Obtiene el total de lanzamientos realizados por el jugador.
     *
     * @return El total de lanzamientos realizados por el jugador.
     */
    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    /**
     * Obtiene el tipo de jugador.
     *
     * @return El tipo de jugador (por ejemplo, Portero o Extremo).
     */
    public String getTipoJugador() {
        return tipoJugador;
    }

    // Setters

    /**
     * Establece el nombre del jugador.
     *
     * @param nombre El nuevo nombre del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el país de origen del jugador.
     *
     * @param pais El nuevo país de origen del jugador.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Establece la cantidad de goles directos anotados por el jugador.
     *
     * @param golesDirectos La nueva cantidad de goles directos anotados por el jugador.
     */
    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    /**
     * Establece el total de lanzamientos realizados por el jugador.
     *
     * @param totalLanzamientos El nuevo total de lanzamientos realizados por el jugador.
     */
    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }

    /**
     * Establece el tipo de jugador.
     *
     * @param tipoJugador El nuevo tipo de jugador (por ejemplo, Portero o Extremo).
     */
    public void setTipoJugador(String tipoJugador) {
        this.tipoJugador = tipoJugador;
    }
}