import java.util.ArrayList;


public class Main {

	
	public static void main(String[] args) {
		
		
		/* Sorting arguments */
		ArrayList<String> arguments = new ArrayList<String>();
		arguments.add("Y");
		arguments.add("M");
		arguments.add("D");
		
		Person.SortArguments = arguments;
		
		/* The End */
		
		FileHandler fh = new FileHandler();
		ArrayList<Person> list = fh.ParseFile("test.txt");
		
		System.out.println("----- Before ------");
		for(Person p : list){
			System.out.println(p);
		}
		
		InsertionSort.insertion_srt(list);
		
		System.out.println("----- After ------");
		for(Person p : list){
			System.out.println(p);
		}
		
		
		/*int i;
		int array[] = { 12, 9, 4, 99, 120, 1, 3, 10 };
		System.out.println("\n\n RoseIndia\n\n");
		System.out.println(" Selection Sort\n\n");
		System.out.println("Values Before the sort:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		InsertionSort.insertion_srt(array, array.length);
		System.out.print("Values after the sort:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		System.out.println("PAUSE");
		 */
		
		
		
	}
}
