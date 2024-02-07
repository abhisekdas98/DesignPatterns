package StrategyPattern.Quack;

import StrategyPattern.Interface.QuackBehaviour;

public class squeak implements QuackBehaviour {

    public void quack() {
        System.out.println("I can squeak");
    }
}
