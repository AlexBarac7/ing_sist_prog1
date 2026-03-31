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
        this.state ^= value;
        return this;
    }
    public AdvancedCalculator root(int n){
        this.state ^= (1/n);
        return this;
    }
}
