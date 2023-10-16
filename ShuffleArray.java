package interviewArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};
	List<Integer> b= new ArrayList<>();
	      for(int n:a) {
	    	  b.add(n);
	      }
	     Collections.shuffle(b);
	     System.out.println(b);
}
}
