import java.util.Scanner;
class sort{
  public static void main(String args[]){

    int a[]={1,1,1,1,0,0,1,0};
int i,j,temp,n=a.length;
for(i=0;i<n;i++){
  for(j=i;j<n;j++){
    if(a[i]>a[j]){
      temp=a[j];
      a[j]=a[i];
      a[i]=temp;
    }
  }
}

for(i=0;i<n;i++){
  System.out.print(a[i]+" ");
  }
  System.out.println();
}
}
