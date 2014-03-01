import java.util.ArrayList;


public class InsertionSort {
	
	public static void insertion_srt(ArrayList<Person> objectSort) {
		Person temp;
        int previousIndex;

        for (int i = 1; i < objectSort.size(); i++) {
            temp = objectSort.get(i);
            previousIndex = i - 1;

            while ((objectSort.get(previousIndex).myComparator(temp))>0 && (previousIndex > 0)) {
                objectSort.set(previousIndex + 1, objectSort.get(previousIndex));
                previousIndex -= 1; //decrease index to compare current item with next previous item
            }
            if (objectSort.get(previousIndex).myComparator(temp) > 0 ) {
                /* shift item in first element up into next element */
                objectSort.set(previousIndex + 1, objectSort.get(previousIndex));
                /* place current item at index 0 (first element */
                objectSort.set(previousIndex, temp);
            } else {
                /* place current item at index ahead of previous item */
                objectSort.set(previousIndex + 1,  temp);
            }

        }
    }
	
	
	
}
