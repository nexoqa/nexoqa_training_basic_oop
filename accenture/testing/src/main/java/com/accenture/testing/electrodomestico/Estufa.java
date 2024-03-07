package com.accenture.testing.electrodomestico;

public class Estufa extends Electrodomestico {

    private boolean electric;

    public Estufa(String brand, Double power, boolean electric) {
        super("Estufa", brand, power);
        this.electric = electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean getElectric() {
        return this.electric;
    }

    public String toString() {
        return "{type:" + this.getType() +
                ", brand:" + this.getBrand() +
                ", power:" + this.getPower() +
                ", electric:" + this.electric +
                "}";
    }

    public double getConsumo(int hours) throws Exception {
        if (this.electric)
            return super.getConsumo(hours);
        else
            return 0.00;
    }

}
