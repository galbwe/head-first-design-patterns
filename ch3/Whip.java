package ch3;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + " Whipped.";
    }

    public float cost() throws Exception {
        float cost = this.beverage.cost();
        if (this.beverage.size == Size.GRANDE) {
            cost += .45f;
        } else if (this.beverage.size == Size.VENTI) {
            cost += .30f;
        } else if (this.beverage.size == Size.TALL) {
            cost += .15f;
        } else {
            throw new Exception("unknown beverage size " + this.beverage.size);
        }
        return cost;
    }

}
