package com.lee.command.demo01;

public abstract class Command {
    protected Operation operation = new Operation();
    public abstract void execute();
}
