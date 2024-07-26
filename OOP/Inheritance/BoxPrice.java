package Inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
