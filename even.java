import java.util.Scanner;
class even{
public static void main(String args[]){

int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
System.out.println("Even numbers are:-");
for(i=0;i<=n;i++){
  if(checkNum(i)==1)
  System.out.print(i+" ");
}
System.out.println();
}

 static int checkNum(int n){
  if(n%2==0)
  return 1;
  else
  return 0;
}
}
