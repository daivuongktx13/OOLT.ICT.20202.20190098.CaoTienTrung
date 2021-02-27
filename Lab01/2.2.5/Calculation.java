import javax.swing.JOptionPane;
public class Calculation{
    public Double num1;
    public Double num2;
    public String strOper;
    public Double result;
    public String printCalculation(){
        switch(strOper){
            case "+":   result=num1+num2;
            return num1+strOper+num2+"="+result;
            case "-":   result=num1-num2;
            return num1+strOper+num2+"="+result;
            case "x":   
            case "*":   result=num1*num2;
            return num1+strOper+num2+"="+result;
            case "/":   if(num2==0) return "Divisor equal to zero!";
            else {
                result=num1/num2;
                return num1+strOper+num2+"="+result;
            } 
            default:    
            return "Wrong operation!";
        }
    }
}