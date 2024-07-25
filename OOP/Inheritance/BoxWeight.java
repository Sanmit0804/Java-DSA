package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // Call the parent class constructor  --- But not able to access the private variables 
        // Used to initialize values present in parent class
        this.weight = weight;
    }
}
