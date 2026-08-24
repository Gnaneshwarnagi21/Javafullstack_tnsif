package test;

public class checkarmstrongno {
	void check(){ 
        int num=153;
        int original = num;
        int a = num%10;
        num =num/10;
        int b =num%10;
        num=num/10;
        int c=num%10;
        int sumofnumbers = (a*a*a)+(b*b*b)+(c*c*c);
       if(sumofnumbers==original){
                   System.out.println("the number is armstrong number");
                       }
       else{
                 System.out.println("the number is not armstrong number");
              }
}

}
