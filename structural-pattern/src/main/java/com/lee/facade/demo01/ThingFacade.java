package com.lee.facade.demo01;

public class ThingFacade {

    private Thing01 thing01;
    private Thing02 thing02;
    private Thing03 thing03;

    public ThingFacade() {
        this.thing01 = Thing01.getInstance();
        this.thing02 = Thing02.getInstance();
        this.thing03 = Thing03.getInstance();
    }

    public void start(){
        thing01.start();
        thing02.start();
        thing03.start();
    }

    public void end(){
        thing01.end();
        thing02.end();
        thing03.end();
    }

}
