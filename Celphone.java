/**
 * Hace referencia a un celular en la vida real, abstrayendo datos y características de este.
 */
public class Celphone {

    /**
     * Hace referencia a la memoria interna del dispositivo a crear.
     */
    public int memory;
    /**
     * Es la referencia de la board del dispositivo.
     */
    public String board;
    /**
     * Es la capacidad de la memoria ram que se encuentra instalada en el dispositivo.
     */
    public String memoryRam;


    /**
     * Este es el constructor que se encarga de ayudar a crear el objeto de clase celular al programador,
     * para que de esta manera todos los datos sean llenados.
     *
     * @param memory         La memoria de almacenamiento
     * @param board      la referencia de la board del dispositivo.
     * @param memoryRam la memoria ram que se encuentra instalada.
     */
    public Celphone(int memory, String board, String memoryRam) {
        this.memory = memory;
        this.board = board;
        this.memoryRam = memoryRam;
    }

    /**
     * Devuelve el dato que se encuentra almacenado en la memoria.
     * @return
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Establece el dato ingresado por el usuario y lo guarda en la variable memory.
     *
     * @param memory memoria interna.
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Devuelve el valor almacenado en la variable.
     *
     * @return devuelve la referencia.
     */
    public String getBoard() {
        return board;
    }

    /**
     * Establece en la variable board la referencia de la placa base del dispositivo.
     *
     * @param board la referencia.
     */
    public void setBoard(String board) {
        this.board = board;
    }

    /**
     * Devuelve la capacidad de la memoria ram almacenada
     *
     * @return the celphone number
     */
    public String getMemoryRam() {
        return memoryRam;
    }

    /**
     * Establece en la variable la capacidad de la memoria ram del dispositivo.
     *
     * @param memoryRam la memoria Ram.
     */
    public void setMemoryRam(String memoryRam) {
        this.memoryRam = memoryRam;
    }
}
