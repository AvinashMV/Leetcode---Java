import java.util.ArrayList;

public class Solution {
    private ArrayList<Integer> myList = new ArrayList<>();

    public void getPrimeFactors(int num){

        while(num%2==0){
            myList.add(2);
            num /=2;
        }

        for(int i=3;i<=(int)Math.sqrt(num); i+=2) {
            while (num % i == 0) {
                myList.add(i);
                num /= i;
            }
        }
        printPrimeFactors();
    }


    public void getAllFactors(int num){
        int original = num;
        for(int i=2;i<=num; i++) {
            while (num % i == 0) {
                myList.add(i);
                num /= i;
            }
        }
        myList.add(original);
        printPrimeFactors();
    }


    public void printPrimeFactors(){
        System.out.print(myList);
    }
}
