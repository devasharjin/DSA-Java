import java.util.*;

void main(){
  System.out.print("Enter a number :  ");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();

  if(num % 2 == 0)
    System.out.println(num + " is even");
  else
  System.out.println(num + " is Odd");
}