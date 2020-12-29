package ch3;

abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    abstract public float cost() throws Exception;
}
