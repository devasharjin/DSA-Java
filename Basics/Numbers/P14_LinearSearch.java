

void main(){
  int[] a = {1,2,3,4,5};
  int target = 4;
  int index = -1;

  for (int i =0; i<a.length; i++){
    if(a[i]== target){
      index = i;
      break;
    }
  }
  if(index != -1)
    IO.println("Element found at index : " + index);
  else
  IO.println("Element Not Found");
}