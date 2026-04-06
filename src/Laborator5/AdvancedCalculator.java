package Laborator5;

public class AdvancedCalculator extends IntCalculator{
    public AdvancedCalculator(int val){
        super(val);
    }
    public AdvancedCalculator divide(int value) {
        if (value == 0) {
            System.out.println("Nu se poate imparti la 0");
            return this;
        }
        else
            this.state /= value;
        return this;
    }
    public AdvancedCalculator power(int value){
        return this;
    }
    public AdvancedCalculator root(int n){
        return this;
    }
    @Override
    public AdvancedCalculator add(int value){
        super.add(value);
        return this;
    }
    @Override
    public AdvancedCalculator subtract(int value){
        super.subtract(value);
        return this;
    }
    @Override
    public AdvancedCalculator multiply(int value){
        super.multiply(value);
        return this;
    }
}
