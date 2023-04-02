package dkt.edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Car implements Comparable<Car> {

  String name;
  int maxSpeed;
  int minSpeed;
  int length;

  public Car(String name, int maxSpeed, int minSpeed, int length) {
    this.name = name;
    this.maxSpeed = maxSpeed;
    this.minSpeed = minSpeed;
    this.length = length;
  }

  @Override
  public int compareTo(Car c) {
    return c.length - thiss.length;
  }

  @Override
  public String toString() {
    return "Car{" +
        "name='" + name + '\'' +
        ", maxSpeed=" + maxSpeed +
        ", minSpeed=" + minSpeed +
        ", length=" + length +
        '}';
  }
}

public class CollectionsPractice1 {

  public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();
    carList.add(new Car("Audi A8", 200, 0, 200));
    carList.add(new Car("BMW 520", 190, 0, 210));
    carList.add(new Car("Lamborghini Urus", 230, 0, 230));
    System.out.println(carList);
    Collections.sort(carList);
    System.out.println(carList);

  }
}
