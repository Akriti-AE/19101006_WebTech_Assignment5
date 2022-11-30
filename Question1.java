class Mammals{
    void display1(){
        System.out.println("I am mammal");
    }
}

class MarineAnimals{
    void display2(){
        System.out.println("I am a marine animal");
    }
}

class BlueWhale extends Mammals{
    void display3(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals.");
    }
}
class BlueWhale2 extends MarineAnimals{
    void display4(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals.");
    }
}

class Question1 {
    public static void main(String[] args) {
        Mammals m = new Mammals();
        MarineAnimals ma = new MarineAnimals();
        BlueWhale bw = new BlueWhale();
        BlueWhale2 bw2 = new BlueWhale2();


        m.display1();
        ma.display2();
        bw.display3();
        bw.display1();
        bw2.display2();
    }
}