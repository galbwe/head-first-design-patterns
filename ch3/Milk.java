package ch3;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + " With milk.";
    }

    public float cost() throws Exception {
        float cost = this.beverage.cost();
        if (this.beverage.size == Size.GRANDE) {
            cost += .36f;
        } else if (this.beverage.size == Size.VENTI) {
            cost += .24f;
        } else if (this.beverage.size == Size.TALL) {
            cost += .12f;
        } else {
            throw new Exception("unknown beverage size " + this.beverage.size);
        }
        return cost;
    }
}
