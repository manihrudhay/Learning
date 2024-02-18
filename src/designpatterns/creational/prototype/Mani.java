package designpatterns.creational.prototype;

public class Mani {

    Mani(String name,int age) {
        this.name =  name;
        this.age = age;
    }
    String name = "mani";
    int age =23;

    public Mani clone() {
         return new Mani(this.name,this.age);
    }
}
