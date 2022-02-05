import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruit {


    public String name;
    private float averageWeight;
    public int sizeArray;
    public String[] colors = new String[sizeArray];



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.sizeArray = sizeArray;
        for(int i = 0;i<sizeArray;i++){
            System.out.println("holi");
        }
        this.colors = colors;
    }
}
