public class LinearSystem{
    public class FirstOrderEq{
        int num1;
        int num2;
        int num3;
    }
    FirstOrderEq eq1=new FirstOrderEq();
    FirstOrderEq eq2=new FirstOrderEq();
    public String resolve(){
        int D=(eq1.num1)*(eq2.num2)-(eq1.num2)*(eq2.num1);
        int D1=(eq1.num3)*(eq2.num2)-(eq1.num3)*(eq2.num1);
        int D2=(eq1.num1)*(eq2.num3)-(eq1.num2)*(eq2.num3);
        if(D==0){
            if(D1==0&&D2==0) return "No solution";
            else return "Infinite solution";
        }else{
            return "System has unique solution (x1,x2)= ("+(float)D1/D +"," + (float)D2/D +")";
        }
    }
}
