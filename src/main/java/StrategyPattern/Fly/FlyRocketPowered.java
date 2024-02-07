package StrategyPattern.Fly;

import StrategyPattern.Interface.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
