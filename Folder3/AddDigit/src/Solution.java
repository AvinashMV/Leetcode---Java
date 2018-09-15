public class Solution {
    public int addDigits(int num) {
        int addedNum = 0;

        while(true) {
            // add the current num.
            while (num > 0) {
                addedNum += num % 10;
                num = num / 10;
            }
            if(addedNum<10)
                break;
            num = addedNum;
            addedNum = 0;
        }
        return addedNum;
    }
}
