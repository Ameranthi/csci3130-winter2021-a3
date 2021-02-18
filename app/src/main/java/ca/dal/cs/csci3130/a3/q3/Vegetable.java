package ca.dal.cs.csci3130.a3.q3;

public class Vegetable extends Product {
    public boolean isPerishable() {
        return true;
    }
    public boolean isProducedInAFarm() {
        return true;
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
