package StrategyPattern.Ducks;

import StrategyPattern.Interface.FlyBehaviour;
import StrategyPattern.Interface.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    abstract public void  display();

    public void swim()
    {
        System.out.println("All Ducks can swin");
    }

    public void performFly()
    {
        flyBehaviour.fly();
    }

    public void performQuack()
    {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour)
    {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour)
    {
        this.quackBehaviour = quackBehaviour;
    }
}
