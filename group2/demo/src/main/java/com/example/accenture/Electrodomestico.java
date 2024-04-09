package com.example.accenture;

public class Electrodomestico {

    private String type;
    private String brand;
    private double power;

    public Electrodomestico() {
        this.type = "";
        this.brand = "";
        this.power = 0.0;

    }

    public Electrodomestico(String type, String brand, double power) throws Exception {
        this.type = type;
        this.brand = brand;
        this.setPower(power);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(double power) throws Exception {
        if (power < 0) {
            throw new Exception("power must be positive");
        }
        this.power = power;
    }

    public String getType() {
        return this.type;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPower() {
        return this.power;
    }

    public String toString() {
        return "{'type': '" + this.type +
                "', 'brand':'" + this.brand +
                "', 'power': " + this.power + "}";
    }

    public double getConsume(int hours) throws Exception {
        if (hours < 0) {
            throw new Exception("hours must be positive");
        }
        return hours * this.power;
    }

    public double getCostByConsume(int hours, double costByHour) throws Exception {

        if (costByHour < 0) {
            throw new Exception("Cost must be positive");
        }

        return this.getConsume(hours) * costByHour;
    }

}
