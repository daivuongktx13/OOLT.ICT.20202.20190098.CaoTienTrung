public class LinearEquation{
    public int a;
    public int b;
    public String resolve(){
     /*   if(b==0&&a==0) return "Vo so nghiem";
        if(a==0&&b!=0)  return "Phuong trinh vo nghiem";
        if(a!=0) return "x= "+(float)(-b)/a;*/
	if(a==0){
	if(b==0) return "No solution";
	else return "Infinite solution";
        }else{
	    return "x= "+(float)(-b)/a;
        }
    }
}