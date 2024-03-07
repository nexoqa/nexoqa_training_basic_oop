package com.accenture.testing.electrodomestico;

public class Electrodomestico {

    private String type;
    private String brand;
    private Double power;

    public Electrodomestico(String type, String brand, Double power) {
        this.type = type;
        this.brand = brand;
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getPower() {
        return this.power;
    }

    public String toString() {
        return "{type:" + this.type + ", brand:" + this.brand + ", power:" + this.power + "}";
    }

    public double getConsumo(int hours) throws Exception {
        if (hours <= 0) {
            throw new Exception("The hours can not be zero or negative");
        }
        return hours * this.power;
    }

    public double getCosteConsumo(int hours, double costByHour) throws Exception {
        if (costByHour <= 0) {
            throw new Exception("The Cost by hour can not be zero or negative");
        }
        return this.getConsumo(hours) * costByHour;
    }

}
