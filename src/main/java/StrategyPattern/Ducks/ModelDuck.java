package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyWithWings;
import StrategyPattern.Fly.NoFly;
import StrategyPattern.Quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck()
    {
        flyBehaviour = new NoFly();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Duck");
    }
}
