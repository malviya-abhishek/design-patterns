package org.abhishek.design.pattern.factory.factory;

import org.abhishek.design.pattern.factory.factory.shape.Circle;
import org.abhishek.design.pattern.factory.factory.shape.Shape;
import org.abhishek.design.pattern.factory.factory.shape.Square;

public class ShapeFactory {
    public Shape getShape(String input){
        switch (input) {
            case "SQUARE" -> {
                return new Square();
            }
            case "CIRCLE" -> {
                return new Circle();
            }
            default -> throw new Error("Invalid shape type");
        }
    }
}
