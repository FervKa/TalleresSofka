public abstract class Ship{

    public String type;
    public int motorsNumber;
    public float size;
    public float weight;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMotorsNumber() {
        return motorsNumber;
    }

    public void setMotorsNumber(int motorsNumber) {
        this.motorsNumber = motorsNumber;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public abstract void closeDoors();
    public abstract void adjustTrajectory();
    public abstract void cleanPropells();

}