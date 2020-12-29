package ch4;

public class NyStyle extends StyleDecorator {
    public NyStyle(Pizza decorated) {
        this.decorated = decorated;
    }

    public void prepare() {
        this.decorated.prepare();
        System.out.println("NY Style");
    }

    public void bake(){
        this.decorated.bake();
        System.out.println("NY Style");
    }

    public void cut() {
        this.decorated.cut();
        System.out.println("NY Style");
    }

    public void box() {
        this.decorated.box();
        System.out.println("NY Style");
    }
}
