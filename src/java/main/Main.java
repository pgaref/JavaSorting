import java.util.ArrayList;


public class Main {

	public static void usage(){
		System.out.println("Usage: ");
		System.out.println("\tjava -jar sorting.jar <input.txt> <output.txt> <O|I> <N|S|Y|M|D>");
		
	}
	public static void main(String[] args) {
		String sortingAlg = null;
		String infile;
		String outfile;
		
		ArrayList<String> arguments = new ArrayList<String>();
		ArrayList<String> check = new ArrayList<String>();
		check.add("I");
		check.add("O");
		
		/* Arguments parser */
		 
		if(args.length !=4){
			System.out.println("Wrong arguments nnumber!");
			usage();
			System.exit(-1);
		}
		infile = args[0];
		outfile = args[1];
		if(!check.contains(args[2])){
			System.out.println("Wrong argument "+ args[2]);
			usage();
			System.exit(-1);
		}
		else
			sortingAlg = args[2];
		check.clear();
		check.add("N");
		check.add("S");
		check.add("Y");
		check.add("M");
		check.add("D");
		
		for(int i = 0 ; i < args[3].length(); i++){
			if(!check.contains(args[3].charAt(i)+"")){
				System.out.println("Wrong argument "+ args[3].charAt(i));
				usage();
				System.exit(-1);
			}
			else
				arguments.add(args[3].charAt(i)+"");
		}
		
		//System.out.println("In: "+ infile +" Out: "+ outfile +" Sort: "+ sortingAlg + " Arguments: " + arguments.toString());
		
		Person.SortArguments = arguments;
		
		FileHandler fh = new FileHandler();
		ArrayList<Person> list = fh.ParseFile(infile);
		
		System.out.println("----- File Before ------");
		for(Person p : list){
			System.out.println(p);
		}
		
		if(sortingAlg == "I")
			InsertionSort.insertion_srt(list);
		else if(sortingAlg  == "O")
			BubbleSort.bubblesrt(list);
		
		
		System.out.println("----- File After ------");
		for(Person p : list){
			System.out.println(p);
		}
		
		fh.WriteToFile(outfile, list);
		System.out.println("All done!");
		
		
		
		
		
	}
}
