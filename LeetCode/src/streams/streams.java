package streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
		 List<Integer> a= new ArrayList<>();
		 a.add(11);
		 a.add(21);
		 a.add(34);
		 a.add(6);
		 a.add(73);
		 a.add(91);
		 System.out.println(a);
		 // 1. Converting List to arrays
		   int arr[]=(a.stream().mapToInt(i->i).toArray());
		   System.out.println(Arrays.toString(arr));
		   
		  //2. Map for squares -- to Map it in arrays
		   List sq=a.stream().map(x->x*2).collect(Collectors.toList());
		   System.out.println(sq);
		   
		   //3. FIlters ---- To filter out even numbers
		   List even=a.stream().filter(x->x%2==1).collect(Collectors.toList());
		   System.out.println(even);
		   
		   //4. Sorted-- to sort
		   List sorted=a.stream().sorted().collect(Collectors.toList());
		   System.out.println(sorted);
		   
		   //5. To Print  Arrays
		   Arrays.stream(arr).forEach(x->System.out.println(x));
 	}
}