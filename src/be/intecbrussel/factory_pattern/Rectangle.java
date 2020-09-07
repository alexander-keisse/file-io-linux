package be.intecbrussel.factory_pattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside the Rectangle::draw method");
    }
}
