import java.util.*;

void main(){
  System.out.print("Enter a number :  ");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int total = 1;

  for (int i = num; i>=1 ;i--){
    total = total * i;
  }

  System.out.println(total);
}