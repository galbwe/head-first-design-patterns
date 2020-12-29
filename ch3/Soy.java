package ch3;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + " With soy.";
    }

    public float cost() throws Exception{
        float cost = this.beverage.cost();
        if (this.beverage.size == Size.GRANDE) {
            cost += .99f;
        } else if (this.beverage.size == Size.VENTI) {
            cost += .66f;
        } else if (this.beverage.size == Size.TALL) {
            cost += .33f;
        } else {
            throw new Exception("unknown beverage size " + this.beverage.size);
        }
        return cost;
    }

}
