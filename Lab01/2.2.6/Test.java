import javax.swing.JOptionPane;

public class Test{
    public static void main(String[] args){
        int ch;
        do{

            ch=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Linear Equation\n2.Linear system\n3.Quadratic Equation\n0.Exit\nYour choice: ","Menu",JOptionPane.INFORMATION_MESSAGE));  
            switch(ch){
                case 1://For linear equation

                LinearEquation eq=new LinearEquation();
                String aStr=JOptionPane.showInputDialog(null,"Input a: ","Linear Equation: ax+b=0",JOptionPane.INFORMATION_MESSAGE);
                String bStr=JOptionPane.showInputDialog(null,"Input b: ","Linear Equation: ax+b=0",JOptionPane.INFORMATION_MESSAGE);
                eq.a=Integer.parseInt(aStr);
                eq.b=Integer.parseInt(bStr);
                JOptionPane.showMessageDialog(null, eq.resolve(), "Result", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 2:  //For linear system

                LinearSystem sys =new LinearSystem();
                sys.eq1.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Input a1: ","First Linear Equation: a1x+b1y=c1",JOptionPane.INFORMATION_MESSAGE)) ;
                sys.eq1.num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Input b1: ","First Linear Equation: a1x+b1y=c1",JOptionPane.INFORMATION_MESSAGE)) ;
                sys.eq1.num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Input c1: ","First Linear Equation: a1x+b1y=c1",JOptionPane.INFORMATION_MESSAGE)) ;
                sys.eq2.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Input a2: ","Second Linear Equation: a2x+b2y=c2",JOptionPane.INFORMATION_MESSAGE)) ;
                sys.eq2.num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Input b2: ","Second Linear Equation: a2x+b2y=c2",JOptionPane.INFORMATION_MESSAGE)) ;
                sys.eq2.num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Input c2: ","Second Linear Equation: a2x+b2y=c2",JOptionPane.INFORMATION_MESSAGE)) ;
                JOptionPane.showMessageDialog(null, sys.resolve(), "Result", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 3: //For quadratic equation

                QuadraticEquation quadEq=new QuadraticEquation();  
                quadEq.num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Input a: ","Quadratic Equation: ax2+bx+c=0",JOptionPane.INFORMATION_MESSAGE)) ;
                quadEq.num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Input b: ","Quadratic Equation: ax2+bx+c=0",JOptionPane.INFORMATION_MESSAGE)) ;
                quadEq.num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Input c: ","Quadratic Equation: ax2+bx+c=0",JOptionPane.INFORMATION_MESSAGE)) ;
                JOptionPane.showMessageDialog(null, quadEq.resolve(), "Result", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 0:
                break;

                default:
                JOptionPane.showMessageDialog(null, "Wrong choice!", "Menu", JOptionPane.INFORMATION_MESSAGE);
            }
        }while(ch!=0);    
        
      
        
        
    }
}