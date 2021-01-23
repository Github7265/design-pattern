package com.lee.state.demo01;

/**
 * 上下文类
 */
public class Context {
    /**
     * 定义出所有的电梯状态
     */
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    /**
     * 定义一个当前电梯状态
     */
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //此处必须将操作的上下文传过去，就像坐电梯时，人不见了，是不是很恐怖
        this.liftState.setContext(this);
    }

    /**
     * 将开门动作委托给context执行
     */
    public void open(){
        this.liftState.open();
    }

    /**
     * 将关门动作委托给context执行
     */
    public void close(){
        this.liftState.close();
    }

    /**
     * 将运行动作委托给context执行
     */
    public void run(){
        this.liftState.run();
    }

    /**
     * 将停止动作委托给context执行
     */
    public void stop(){
        this.liftState.stop();
    }
}
