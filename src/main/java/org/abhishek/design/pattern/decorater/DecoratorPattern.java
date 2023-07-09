package org.abhishek.design.pattern.decorater;

import org.abhishek.design.pattern.decorater.pizza.problem.Solution;

/**
 * Decorator pattern is used to avoid class explosion
 * Suppose we have multiple features which are independent of each other
 * e.g. we have a base class of CAR and we have features like A.C, automatic gears, radio, reverse camera
 * Now a child class on this can have multiple combinations of these features, for every combination we can have
 * class, this is called class explosion to avoid this he have decorator, each decorator is a feature.
 * Sample question
 * Pizza and toppings
 * Cars and accessory
 *
 */

public class DecoratorPattern {
    public void solve(){
        Solution solution = new Solution();
        solution.solve();
    }
}
