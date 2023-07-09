package org.abhishek.design.pattern.decorater.pizza.problem.toppings;

import org.abhishek.design.pattern.decorater.pizza.problem.BasePizza;
import org.abhishek.design.pattern.decorater.pizza.problem.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return  basePizza.cost() + 15;
    }
}
