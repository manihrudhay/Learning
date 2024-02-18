package designpatterns.creational.factorymethod;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Consumer<String> benifitPrint = (str) -> System.out.print(str+" ");
        System.out.println("Enter your Room");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        Room room = RoomFactory.getInstance(type);
        System.out.println("No of Beds in Room:" + room.noOfBeds());
        System.out.println("Benefits Provided:" );
        Arrays.stream(room.benifits()).forEach(benifitPrint);
    }


}
