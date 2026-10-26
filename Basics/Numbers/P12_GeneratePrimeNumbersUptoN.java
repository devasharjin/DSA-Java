// Generate all the prime number upto N
// 1 to N

import java.util.*;

void main(){
  IO.print("Enter a number : ");
  List<Integer> a =new ArrayList<>();

  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
 

  for (int i =2; i <=num; i++){
    boolean prime = true;
    for (int j =2; j <= i-1; j++){
      if ( i% j == 0){
        prime = false;
        break;
      }
    }
    if(prime){
      a.add(i);
    }
  }

  IO.println(a);
  
}