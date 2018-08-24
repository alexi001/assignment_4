import java.util.Scanner;
class Armstrong{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
checkNum(n);
}
static void checkNum(int n){
int x=n,res=0,rem,num=n,count=0;
while(x!=0){
  x=x/10;
  count++;
}
while(num!=0){
  rem=num%10;
  res=res+((int) (Math.pow(rem,count)));
  num=num/10;
}
if(n==res)
System.out.println("Armstrong Number");
else
System.out.println("Not an armstrong number");
}
}
