package org.abhishek.design.pattern.decorater.pizza.problem;

import org.abhishek.design.pattern.decorater.pizza.problem.pizzas.Margherita;
import org.abhishek.design.pattern.decorater.pizza.problem.toppings.ExtraCheese;
import org.abhishek.design.pattern.decorater.pizza.problem.toppings.Mushroom;

public class Solution {
    public void solve(){
        BasePizza margheritaWithExtraCheese = new ExtraCheese(new Margherita());
        System.out.println( "margheritaWithExtraCheese cost:- " +  margheritaWithExtraCheese.cost());

        BasePizza margheritaWithExtraCheeseAndMushroom = new Mushroom(margheritaWithExtraCheese);
        System.out.println("margheritaWithExtraCheeseAndMushroom cost:- " + margheritaWithExtraCheeseAndMushroom.cost());
    }
}
