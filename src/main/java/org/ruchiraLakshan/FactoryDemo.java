package org.ruchiraLakshan;

import java.util.Scanner;

interface Shape{
    void draw();
}

// Circle class
class  Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}

//Rectangle class
class Rectangle implements Shape{

    @Override
    public void draw(){
        System.out.println("Draw a Rectangle");
    }
}

//Square class
class Square implements Shape{

    @Override
    public void draw(){
        System.out.println("Draw a Square");
    }
}
//ShapeFactory
class ShapeFactory {

    //to take user input to return the output
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
            case "1":
                return new Circle();
            case "rectangle":
            case "2":
                return new Rectangle();
            case "square":
            case "3":
                return new Square();
            default:
                return null;
        }

    }
}



public class FactoryDemo {
    public static void main(String[] args){

        //Factory Object
        ShapeFactory shapeFactory = new ShapeFactory();

        //scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your shape : 1. Circle , 2.:Rectangle, 3.Square : ");

        // read user input
        String obj = scanner.nextLine();

        //pass the user input
        Shape shape = shapeFactory.getShape(obj);

        if(shape != null){
            shape.draw();
        }else {
            System.out.println("Invalid shape choice");
        }

        System.out.println("--------------------------------------------------------------");
        scanner.close();

        //assign shapes to variables
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("rectangle");
        Shape shape3 = shapeFactory.getShape("square");

        //Draw the shapes
        if(shape1 != null) shape1.draw();
        if(shape2 != null) shape2.draw();
        if(shape3 != null) shape3.draw();

    }
}