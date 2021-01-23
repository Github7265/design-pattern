package com.lee.state.demo01;

public class StoppingState extends LiftState{
    /**
     * 电梯处于停止状态时，开启操作将会修改状态
     */
    @Override
    public void open() {
        context.setLiftState(Context.openningState);
        context.getLiftState().open();
    }

    /**
     * 电梯处于停止状态，关门操作将不会做任何动作
     */
    @Override
    public void close() {


    }

    /**
     * 电梯处于停止状态，运行操作将会修改状态
     */
    @Override
    public void run() {
        context.setLiftState(Context.runningState);
        context.getLiftState().run();
    }

    /**
     * 电梯处于停止状态，停止操作将不会做任何动作
     */
    @Override
    public void stop() {
        System.out.println("电梯正处于停止状态......");
    }
}
