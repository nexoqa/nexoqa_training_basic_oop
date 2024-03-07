package com.accenture.testing.electrodomestico;

public class Lavadora extends Electrodomestico {

    private Double price;
    private boolean hotWater;

    public Lavadora(String brand, Double power, Double price, boolean hotWater) {
        super("Lavadora", brand, power);
        this.price = price;
        this.hotWater = hotWater;
    }

    public Lavadora(String brand, Double power) {
        super("Lavadora", brand, power);
        this.price = 0.00;
        this.hotWater = false;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setHotWater(boolean hotWater) {
        this.hotWater = hotWater;
    }

    public boolean getHotWater() {
        return this.hotWater;
    }

    public String toString() {
        return "{type:" + this.getType() +
                ", brand:" + this.getBrand() +
                ", power:" + this.getPower() +
                ", price:" + this.price +
                ", hotWater:" + this.hotWater +
                "}";
    }

    public double getConsumo(int hours) throws Exception {
        if (hours <= 0) {
            throw new Exception("The hours can not be zero or negative");
        }
        if (this.hotWater)
            return hours * (this.getPower() + this.getPower() * 0.20);
        else
            return hours * this.getPower();
    }

    public double getConsumoOptimizado(int hours) throws Exception {
        if (this.hotWater)
            return super.getConsumo(hours) * 1.20;
        else
            return super.getConsumo(hours);
    }
}
