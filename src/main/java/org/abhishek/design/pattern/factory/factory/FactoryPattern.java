package org.abhishek.design.pattern.factory.factory;


import org.abhishek.design.pattern.factory.factory.shape.Shape;

/**
 * Factory pattern
 * factory pattern is used to when we need to create object
 * and object creation based on condition
 */

public class FactoryPattern {

    public void solve(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }

}
