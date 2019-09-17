import java.util.Scanner;
public class addn2 {
    
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("With Duplication");
int i,j,k,l;
for(i=1;i<=4;i++) {
for(j=1;j<=4;j++) {
for(k=1;k<=4;k++) {
for(l=1;l<=4;l++) {
System.out.print(i);
System.out.print(j);
System.out.print(k);
System.out.print(l);
System.out.print("\n");
}
}
}
}
System.out.println("Without Duplication");
for(i=1;i<=4;i++) {
for(j=1;j<=4;j++) {
for(k=1;k<=4;k++) {
for(l=1;l<=4;l++) {
if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
{
System.out.print(i);
System.out.print(j);
System.out.print(k);
System.out.print(l);
System.out.print("\n");}
}
}
}
}



}}