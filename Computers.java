/**
 * The type Computers.
 */
public class Computers {
    private String proccesor;
    /**
     * The Power source.
     */
    public String powerSource;
    private int hashGPU;


    /**
     * Instantiates a new Computers.
     *
     * @param proccesor   the proccesor
     * @param powerSource the power source
     * @param hashGPU     the hash gpu
     */
    public Computers(String proccesor, String powerSource, int hashGPU) {
        this.proccesor = proccesor;
        this.powerSource = powerSource;
        this.hashGPU = hashGPU;
    }

    public String getProccesor() {
        return proccesor;
    }

    /**
     * Sets proccesor.
     *
     * @param proccesor the proccesor
     */
    public void setProccesor(String proccesor) {
        this.proccesor = proccesor;
    }

    /**
     * Gets power source.
     *
     * @return the power source
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * Sets power source.
     *
     * @param powerSource the power source
     */
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    /**
     * Gets hash gpu.
     *
     * @return the hash gpu
     */
    public int getHashGPU() {
        return hashGPU;
    }

    /**
     * Sets hash gpu.
     *
     * @param hashGPU the hash gpu
     */
    public void setHashGPU(int hashGPU) {
        this.hashGPU = hashGPU;
    }
}
