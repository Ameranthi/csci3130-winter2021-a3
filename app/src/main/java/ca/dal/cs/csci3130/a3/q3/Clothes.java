package ca.dal.cs.csci3130.a3.q3;

public class Clothes extends Product {

    public boolean isProducedInAFactory() {
        return true;
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
