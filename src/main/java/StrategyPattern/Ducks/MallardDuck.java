package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyWithWings;
import StrategyPattern.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck()
    {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("^I am Mallard Duck^");
    }
}
