package Laborator5.advanced;

import Laborator5.AdvancedCalculator;
import Laborator5.IntCalculator;

public class NewIntCalculator extends ACalculator {
    public NewIntCalculator(Integer val){
        super(val);
    }
    @Override
    public void init(){
        this.state = 0;
    }
    public NewIntCalculator add(Integer value){
        this.state = (Integer)this.state + value;
        return this;
    }
    public NewIntCalculator subtract(Integer value){
        this.state = (Integer)this.state - value;
        return this;
    }
    public NewIntCalculator multiply(Integer value){
        this.state = (Integer)this.state * value;
        return this;
    }
}
