/**
 * The type Ship.
 */
public abstract class Ship{

    /**
     * The Type.
     */
    public String type;
    /**
     * The Motors number.
     */
    public int motorsNumber;
    /**
     * The Size.
     */
    public float size;
    /**
     * The Weight.
     */
    public float weight;


    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets motors number.
     *
     * @return the motors number
     */
    public int getMotorsNumber() {
        return motorsNumber;
    }

    /**
     * Sets motors number.
     *
     * @param motorsNumber the motors number
     */
    public void setMotorsNumber(int motorsNumber) {
        this.motorsNumber = motorsNumber;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }


    /**
     * Close doors.
     */
    public abstract void closeDoors();

    /**
     * Adjust trajectory.
     */
    public abstract void adjustTrajectory();

    /**
     * Clean propells.
     *
     * @param clean the clean
     */
    public abstract void cleanPropells(boolean clean);

}