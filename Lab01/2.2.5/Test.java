import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args){
        String strNum1,strNum2,Oper;
        strNum1=JOptionPane.showInputDialog(null,"Please input first number: ","Input first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2=JOptionPane.showInputDialog(null,"Please input second number: ","Input second number",JOptionPane.INFORMATION_MESSAGE);
        Oper=JOptionPane.showInputDialog(null,"Please input operator: ","Input operator",JOptionPane.INFORMATION_MESSAGE);
        Calculation cal=new Calculation();
        cal.num1=Double.parseDouble(strNum1);
        cal.num2 =Double.parseDouble(strNum2);
        cal.strOper=Oper;
        String result;
        result=cal.printCalculation();
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
