package designpatterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Var var = Var.builder().one("one").two("two").build();
        System.out.println(var.one  + var.two);
    }


}
