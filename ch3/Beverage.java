package ch3;

public class Beverage {
    String description = "A generic beverage.";
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    public float cost() {
        float total = 0;
        if (hasMilk()) {
            total = total + 0.75f;
        }
        if (hasSoy()) {
            total = total + 0.5f;
        }
        if (hasMocha()) {
            total = total + 1.00f;
        }
        if (hasWhip()) {
            total = total + 0.75f;
        }
        return total;
    }

    String getDescription() {
        return description;
    }

    boolean hasMilk() {
        return milk;
    }

    void setMilk(boolean milk) {
        this.milk = milk;
    }

    boolean hasMocha() {
        return mocha;
    }

    void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    boolean hasSoy() {
        return soy;
    }

    void setSoy(boolean soy) {
        this.soy = soy;
    }

    boolean hasWhip() {
        return whip;
    }

    void setWhip(boolean whip) {
        this.whip = whip;
    }


}