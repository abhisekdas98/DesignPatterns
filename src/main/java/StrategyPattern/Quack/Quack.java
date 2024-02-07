package StrategyPattern.Quack;

import StrategyPattern.Interface.QuackBehaviour;

public class Quack implements QuackBehaviour {

    public void quack() {
        System.out.println("I can Quack");
    }
}
