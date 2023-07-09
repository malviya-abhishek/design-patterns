package org.abhishek.design.pattern.decorater.pizza.problem.toppings;

import org.abhishek.design.pattern.decorater.pizza.problem.BasePizza;
import org.abhishek.design.pattern.decorater.pizza.problem.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 10;
    }
}
