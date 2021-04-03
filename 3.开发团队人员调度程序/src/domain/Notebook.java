package domain;

public class Notebook implements Equipment {
    private String model;
    private double price;

    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
