import java.lang.Math.*;
public class Question2 {

	StringRepeater strRepeat = new StringRepeater();
	String testString = "str";
	long start, end;
	long repeats = 10000;
	float time;

	/**
	*Naively timing the repeatString class.
	* 
	*@param n: number of times to repeat string
	*/
	public void naiveTime(int n){
        start = System.nanoTime();
        strRepeat.repeatString(testString, n);
        end = System.nanoTime();

        //converts nanoseconds to seconds
        time = (end-start) * (float)Math.pow(10,-9);
        System.out.println("T(" + n + ") = " + time + " seconds");
	}

	/**
	*Precisily timing the repeatString class using repeats.
	* 
	*@param n: number of times to repeat string
	*/
	public void preciseTime(int n){
		start = System.nanoTime();

		//repeats 10,000 times
		for(long i = 0; i < repeats; i++){
			strRepeat.repeatString(testString, n);
		}

		end = System.nanoTime();

		//converts nanoseconds to seconds
		time = ((end-start) * (float)Math.pow(10,-9)) / repeats;

		System.out.println("T(" + n + ") = " + time + " seconds");
	}


    public static void main(String[] args) {
        //TODO implement this
        Question2 q2 = new Question2();
        
        q2.naiveTime(1);
        q2.naiveTime(10);
        q2.naiveTime(1000);
        q2.naiveTime(10000);

        q2.preciseTime(1);
        q2.preciseTime(10);
        q2.preciseTime(1000);
        q2.preciseTime(10000);
    }
}
