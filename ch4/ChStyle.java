package ch4;

public class ChStyle extends StyleDecorator {
    public ChStyle(Pizza decorated) {
        this.decorated = decorated;
    }

    public void prepare() {
        this.decorated.prepare();
        System.out.println("CH Style");
    }

    public void bake(){
        this.decorated.bake();
        System.out.println("CH Style");
    }

    public void cut() {
        this.decorated.cut();
        System.out.println("CH Style");
    }

    public void box() {
        this.decorated.box();
        System.out.println("CH Style");
    }
}
