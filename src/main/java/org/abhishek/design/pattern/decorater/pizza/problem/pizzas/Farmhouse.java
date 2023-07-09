package org.abhishek.design.pattern.decorater.pizza.problem.pizzas;

import org.abhishek.design.pattern.decorater.pizza.problem.BasePizza;

public class Farmhouse extends BasePizza {
    @Override
    public int cost(){
        return 200;
    }
}
