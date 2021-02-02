package assignment2;
import java.util.Arrays;
public class Merge_2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {2,5,8,9};
        int[] array2 = {15,3,7,12};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println("Merged array" + Arrays.toString(result));
    
	}

}
