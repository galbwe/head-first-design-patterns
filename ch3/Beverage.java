package ch3;

abstract class Beverage {
    String description;

    public enum Size { TALL, GRANDE, VENTI };

    Size size = Size.TALL;
    abstract public float cost() throws Exception;

    String getDescription() {
        String result = description;
        if (size == Size.TALL) {
            result = "Size Tall. " + result;
        } else if (size == Size.VENTI) {
            result = "Size Venti. " + result;
        } else if (size == Size.GRANDE) {
            result = "Size Grande. " + result;
        }
        return result;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
            return this.size;
    }

}