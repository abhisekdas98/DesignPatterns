package StrategyPattern.Fly;

import StrategyPattern.Interface.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    public void fly() {
        System.out.println("I am flying");
    }
}
