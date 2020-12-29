package ch4;

abstract public class StyleDecorator extends Pizza{
    Pizza decorated;

    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();
}
