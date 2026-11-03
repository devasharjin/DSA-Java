
class P03_BinarySearchUsingRecursive
{
  public static int binarySearch(int a[] , int target , int low, int high){
    int mid = (low + high)/2;

    if(low > high)
     return -1;

    if(target > a[mid])
      return binarySearch(a,target,mid + 1, high);
    else if (target < a[mid])
      return binarySearch(a, target , low , mid -1);
    else
      return mid;
    
  }

  public static void main(String[] args){
  int[] a = {2,4,6,8,10};
  int target = 8;

  int mid = binarySearch(a,target, 0 , a.length-1);

  if(mid != 1)
    System.out.println("Element found at index : " + mid);
  else
    System.out.println("Element Not Found");

}
  
}