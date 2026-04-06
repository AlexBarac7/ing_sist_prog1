package Laborator5.advanced;

import Laborator5.IntCalculator;

public abstract class ACalculator {
    protected Object state;
    public ACalculator(Object state){
        this.state = state;
    }
    protected abstract void init();
    public Object result(){
        return this.state;
    }
    public ACalculator clear(){
        this.init();
        return this;
    }
}
