package com.example.accenture;

public class Lavadora extends Electrodomestico {

    private double price;
    private boolean hotWater;

    public Lavadora() {
        super();
        this.price = 0.0;
        this.hotWater = false;
    }

    public Lavadora(String brand, double power) throws Exception {
        super("Lavadora", brand, power);
        this.price = 0.0;
        this.hotWater = false;
    }

    public Lavadora(String brand, double power, double price, boolean hotWater) throws Exception {
        super("Lavadora", brand, power);
        this.price = price;
        this.hotWater = hotWater;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHotWater(boolean hotWater) {
        this.hotWater = hotWater;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getHotWater() {
        return this.hotWater;
    }

    public double getConsume(int hours) throws Exception {
        if (!this.hotWater) {
            return super.getConsume(hours);
        } else {
            return super.getConsume(hours) * 1.20;
        }

    }

    public String toString() {
        return "{'type': '" + this.getType() +
                "', 'brand':'" + this.getBrand() +
                "', 'power': " + this.getPower() +
                "', 'price':'" + this.price +
                "', 'hotWater':'" + this.hotWater + "}";
    }

}
