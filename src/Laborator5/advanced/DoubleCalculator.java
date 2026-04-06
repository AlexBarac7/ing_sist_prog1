package Laborator5.advanced;

import Laborator5.AdvancedCalculator;

public class DoubleCalculator extends ACalculator {
    public DoubleCalculator(Double val){
        super(val);
    }
    @Override
    public void init(){
        this.state = 0.0;
    }
    public DoubleCalculator add(Double value){
        this.state = (Double)this.state + value;
        return this;
    }
    public DoubleCalculator subtract(Double value){
        this.state = (Double)this.state - value;
        return this;
    }
    public DoubleCalculator multiply(Double value){
        this.state = (Double)this.state * value;
        return this;
    }
}
