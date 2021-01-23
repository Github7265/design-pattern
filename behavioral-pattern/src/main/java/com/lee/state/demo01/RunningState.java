package com.lee.state.demo01;

public class RunningState extends LiftState{
    /**
     * 电梯处于运行状态时，再次开启将不做任何动作
     */
    @Override
    public void open() {
    }

    /**
     * 电梯处于运行状态，关门操作将会修改电梯状态
     */
    @Override
    public void close() {
    }

    /**
     * 电梯处于运行状态，运行操作将不会做任何动作
     */
    @Override
    public void run() {
        System.out.println("电梯正在运行.....");
    }

    /**
     * 电梯处于运行状态，停止操作将会修改状态
     */
    @Override
    public void stop() {
        context.setLiftState(Context.stoppingState);
        context.getLiftState().stop();
    }
}
