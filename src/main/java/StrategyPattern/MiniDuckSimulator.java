package StrategyPattern;

import StrategyPattern.Ducks.Duck;
import StrategyPattern.Ducks.MallardDuck;
import StrategyPattern.Ducks.ModelDuck;
import StrategyPattern.Fly.FlyRocketPowered;
import StrategyPattern.Quack.MuteQuack;

public class MiniDuckSimulator {

    public static void main(String args[])
    {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("==============================");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        System.out.println("==============================");

        System.out.println("Setting model duck fly behaviour to fly powered during runtime");
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        System.out.println("Setting model duck quack behaviour to mute quack during runtime");
        modelDuck.setQuackBehaviour(new MuteQuack());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }

}
