import java.util.Scanner;
class arrayNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a[]={1,4,6,7,8,9,10},i,n=a.length,x,flag=0;
System.out.println("Enter element to find ");
x=sc.nextInt();
for(i=0;i<n;i++){
if(a[i]==x){
flag=1;
System.out.println("Element found at position "+(i+1));
}
}
if(flag!=1)
System.out.println("Element not found");
}
}
