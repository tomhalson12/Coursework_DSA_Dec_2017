
public class Solution{
	static int[] oddNumbers(int l, int r) {
        int size;
        if((r-l)%2 == 0){
            size = ((r-l) + 2) /2;
        }else{
            size = ((r-l) +1)/2;
        }

        int[] odds = new int[size];
        int current = 0;
        for(int i = l; i <r+1; i++){

            if((i+1)%2 == 0){
                odds[current++] = i;
            }
        }
        return odds;
    }

    public static void main(String[] args){
    	Solution sol = new Solution();
    	int[] test = new int[3];
    	test[0] = 1;
    	test[1] = 2;
    	test[2] = 3;
    	int[] result = sol.oddNumbers(2, 5);
    	System.out.println(test.length);
    	System.out.println(result[0]);
    }
 }