import java.util.Scanner;
class prime{
public static void main(String args[]){
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
n=sc.nextInt();
for(i=2;i<=n;i++)
if(checkPrime(i)==0)
System.out.print(i+" ");
}
static int checkPrime(int n){
int i,flag=0;
for(i=2; i<=n/2; ++i) {
        if(n%i==0) {
            flag=1;
            break;
        }
    }
return flag;
}
}
