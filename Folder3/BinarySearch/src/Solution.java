public class Solution {
    public boolean findItem(int[] arr,int target){
        int l=0,h=arr.length-1,m=0;
        boolean found = false;
        while(l<=h){
            m = (l+h)/2;
            if(arr[m]==target){
                found = true;
                break;
            }
            if(target<arr[m])
                h = m-1;
            else
                l = m+1;
        }
        return found;
    }
}
