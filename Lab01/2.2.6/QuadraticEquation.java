import java.lang.Math;

public class QuadraticEquation{
    int num1;
    int num2;
    int num3;
    public String resolve(){
        int delta=num2*num2-4*num1*num3;
        if(delta==0) return "Equation has double root: "+ (float)(-num2)/(2*num1);
        if(delta>0) return "Equation has two distint roots: "+ (float)(-num2+Math.sqrt(delta))/(2*num1) +" and "+ (float)(-num2-Math.sqrt(delta))/(2*num1);
        if(delta<0) return "Equation has no solution";
        return "";
    }
}