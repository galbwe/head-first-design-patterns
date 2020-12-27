package ch1;

class ch1 {
    public static void main(String[] args) {

        System.out.println("Testing MallardDuck..");
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();
        mallard.swim();
        mallard.display();

        System.out.println("Testing RedheadDuck..");
        Duck redhead = new RedheadDuck();
        redhead.quack();
        redhead.fly();
        redhead.swim();
        redhead.display();

        System.out.println("Testing RubberDuck..");
        Duck rubber = new RubberDuck();
        rubber.quack();
        rubber.fly();
        rubber.swim();
        rubber.display();

        System.out.println("Testing DecoyDuck..");
        Duck decoy = new DecoyDuck();
        decoy.quack();
        decoy.fly();
        decoy.swim();
        decoy.display();
        System.out.println("Giving the decoy duck a voice..");
        decoy.setQuackBehavior(new Quack());
        decoy.quack();

        System.out.println("Testing ModelDuck..");
        Duck model = new ModelDuck();
        model.quack();
        model.fly();
        model.swim();
        model.display();
        System.out.println("Giving the model duck rocket powered wings!");
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();

        System.out.println("Testing DuckCall");
        DuckCall dc = new DuckCall();
        dc.quack();
        dc.setQuackBehavior(new Squeak());
        dc.quack();
    }
}

interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with wings!");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Can't fly ... no wings.");
    }
}

class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with rockets! To the moon!");
    }
}

interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("A normal quacking sound.");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("(No sound, the duck can't quack.)");
    }
}

abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {};

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    abstract public void swim();
    abstract public void display();
}

class MallardDuck extends Duck {
     public MallardDuck() {
         this.flyBehavior = new FlyWithWings();
         this.quackBehavior = new Quack();
     }

     public void swim() {
         System.out.println("Swims like a mallard");
     }

     public void display() {
         System.out.println("Looks like a mallard");
     }
}

class RedheadDuck extends Duck {
     public RedheadDuck() {
         this.flyBehavior = new FlyWithWings();
         this.quackBehavior = new Quack();
     }

     public void swim() {
         System.out.println("Swims like a redhead");
     }

     public void display() {
         System.out.println("Looks like a redhead");
     }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    public void swim() {
        System.out.println("Swims like a rubber duck");
    }

    public void display() {
        System.out.println("Looks like a rubber duck");
    }
}

class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    public void swim() {
        System.out.println("Swims like a decoy duck.");
    }

    public void display() {
        System.out.println("Looks like a decoy duck");
    }
}

class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void swim() {
        System.out.println("Swims like a model duck");
    }

    public void display() {
        System.out.println("Looks like a model duck");
    }
}

class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        this.setQuackBehavior(new Quack());
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void quack() {
        this.quackBehavior.quack();
    }
}