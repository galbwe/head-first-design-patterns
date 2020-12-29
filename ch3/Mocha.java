package ch3;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + " With mocha.";
    }

    public float cost() throws Exception{
        float cost = this.beverage.cost();
        if (this.beverage.size == Size.GRANDE) {
            cost += .75f;
        } else if (this.beverage.size == Size.VENTI) {
            cost += .5f;
        } else if (this.beverage.size == Size.TALL) {
            cost += .25f;
        } else {
            throw new Exception("unknown beverage size " + this.beverage.size);
        }
        return cost;
    }


}
