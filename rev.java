import java.util.Scanner;
class rev{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
n=sc.nextInt();
numRev(n);
}
static void numRev(int n){
int rem,rev=0;
System.out.println(n);
while(n!=0){
rem=n%10;
rev=(rev*10)+rem;
n=n/10;

}
System.out.println("Reverse of the number is "+rev);
}
}
