package ch3;

import ch3.Beverage;

class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Most excellent dark roast";
    }

    public float cost() {
        return 2.15f + super.cost();
    }
};