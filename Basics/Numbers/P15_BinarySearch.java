
void main (){
  int [] a= {1,2,3,4,5,6,7,8};
  int target = 4;
  int low =0;
  int high = a.length - 1;
  int mid=0;
  while (low <=high){
     mid = (low +high)/2;
    if(a[mid] == target){
      IO.println("The element found at : " +mid);
      return;
    }
    if(target>a[mid]){
      low = mid + 1;
    }else
      high = mid + 1;
  }
  IO.println("Element not Found");
}