class GrandFather {
    String name = "Putin";

    void company() {
        System.out.println(name + " Owns a company");
    }
}

class Father extends GrandFather {
    public Father() {
        this.name = "Trump";
    }

    void car() {
        System.out.println(name + " Owns a car");
    }
}

class Son  extends Father {
    public Son(String n ) {
        this.name = n;
    }

    void doesNothing() {
        System.out.println("Eat sleep Drive Car, Repeat");
    }
}

public class Main {
    public static void main(String[] args) {
        Son son = new Son("Kim");

        son.company();
        son.car();
        son.doesNothing();
    }
}
