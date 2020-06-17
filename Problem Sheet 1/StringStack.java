/** A stack abstract data type that contains Strings. */
import java.util.Arrays;
public class StringStack {


	String[] stringArray;
	int pointer = 0;
	int maxCapacity;

	/**
	* Constructor for creating a new StringStack with a certain capacity.
	* @param capacity the maximum number of strings the stack can hold
	*/
	public StringStack(int capacity) {
		maxCapacity = capacity;
		stringArray = new String[capacity];
	}
	
	/**
	* Puts the given String on top of the stack (if there is enough space).
	* @param s the String to add to the top of the stack
	* @return false if there was not enough space in the stack to add the string;
	*         otherwise true
	*/
	public boolean push(String s) {
		if(pointer != maxCapacity){
			stringArray[pointer++] = s;
			return true;
		}else{
			return false;
		}
	}
	
	/**
	* Removes the String on top of the stack from the stack and returns it.
	* @return the String on top of the stack, or null if the stack is empty.
	*/
	public String pop() {
		if(pointer == 0){
			return null;
		}else{
			String str = stringArray[pointer-1];
			stringArray[(--pointer)] = null;
			return str;
		}
	}
	
	/**
	* Returns the number of Strings in the stack.
	* @return the number of Strings in the stack
	*/
	public int count() {
		return pointer;
	}
}
