package StrategyPattern.Quack;

import StrategyPattern.Interface.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
