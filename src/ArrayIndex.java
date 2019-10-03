import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayIndex {
		
	public int i;
	
	public int indexReturn(String input) {

		String in = input;
		List<String> names = Arrays.asList("ali", "paul", "rizwan", "herry", "hassan");
		System.out.println(names);
		for (int i = 0; i <= names.size()-1; i++) {

			if (names.get(i)==in) {
				return i;
			}

		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayIndex obj = new ArrayIndex();
		int valueindex=obj.indexReturn("paul");

		System.out.println(valueindex);

	}
}