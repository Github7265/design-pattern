package com.lee.state.demo01;

public class OpenningState extends LiftState{
    /**
     * 电梯处于开门状态时，再次开启将不做任何动作
     */
    @Override
    public void open() {
        System.out.println("电梯门开启.....");
    }

    /**
     * 电梯处于开门状态，关门操作将会修改电梯状态
     */
    @Override
    public void close() {
        //状态修改
        context.setLiftState(Context.closingState);
        //动作委托给CloseState来执行
        context.getLiftState().close();
    }

    /**
     * 电梯处于开门状态，运行操作将不会做任何动作
     */
    @Override
    public void run() {
    }

    /**
     * 电梯处于开门状态，停止操作将不会做任何动作
     */
    @Override
    public void stop() {
    }
}
