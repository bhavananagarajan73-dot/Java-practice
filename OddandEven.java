import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
oddeven(n);
}
static void oddeven(int n){
int even=0;
int odd=0;
for(int i=0;i<n;i++){
if(i%2==0){
even=even+i;
}else{
odd=odd+i;
}
System.out.print(even);
System.out.print(odd);
}
}
