package StrategyPattern.Fly;

import StrategyPattern.Interface.FlyBehaviour;

public class NoFly implements FlyBehaviour {

    public void fly() {
        System.out.println("I can not Fly");
    }
}
