package com.lee.state.demo01;

public class ClosingState extends LiftState{
    /**
     * 电梯处于关闭状态时，再次开启将修改状态
     */
    @Override
    public void open() {
        context.setLiftState(Context.openningState);
        context.getLiftState().open();
    }

    /**
     * 电梯处于关闭状态，关门操作将不会做任何操作
     */
    @Override
    public void close() {
        System.out.println("电梯门关闭....");
    }

    /**
     * 电梯处于关闭状态，运行操作修改状态
     */
    @Override
    public void run() {
        context.setLiftState(Context.runningState);
        context.getLiftState().run();
    }

    /**
     * 电梯处于关闭状态，停止操作将会修改状态
     */
    @Override
    public void stop() {
        context.setLiftState(Context.stoppingState);
        context.getLiftState().stop();
    }
}
