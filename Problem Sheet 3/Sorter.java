public class Sorter {

    public static void selectionSort(Contact[] contacts) {
    	for(int i = 0; i < contacts.length; i++){

    		int minIndex = i;
    		int contactFirst = i;

    		for(int j = i; j < contacts.length; j++){
    			if(contacts[j].compareTo(contacts[contactFirst]) < 0){
    				contactFirst = j;
    			}
    		}

    		Contact swapping = contacts[i];
    		contacts[i] = contacts[contactFirst];
    		contacts[contactFirst] = swapping;
    	}
    }

    

    public static void insertionSort(Contact[] contacts) {
        for(int i = 1; i < contacts.length; i++){
        
        	Contact swapping = contacts[i];

        	int j = i -1;
        	while(j >= 0 && swapping.compareTo(contacts[j]) < 0){
        		contacts[j+1] = contacts[j];
        		j--;
        	}

        	contacts[j+1] = swapping;

        }
    }



    public static void quickSort(Contact[] contacts) {
        quickSortInner(contacts, 0, contacts.length-1);
    }

    public static void quickSortInner(Contact[] contacts, int first, int last){
    	if(last - first >= 1){
    		int pivot;

    		pivot = partition(contacts, first, last);
    		quickSortInner(contacts, first, pivot-1);
    		quickSortInner(contacts, pivot+1, last);
    	}
    }

    private static int partition(Contact[] contacts, int low, int high){
    	int pi = low;
    	Contact pivot = contacts[low];
    	do{
    		while( low <= high && contacts[low].compareTo(pivot) <= 0){
    			low++;
    		}
    		while(contacts[high].compareTo(pivot) > 0){
    			high--;
    		}
    		if(low < high)
    		{
    			Contact swap = contacts[low];
    			contacts[low] = contacts[high];
    			contacts[high] = swap;
    		}
    	} while ( low < high);
    	Contact swap = contacts[pi];
    	contacts[pi] = contacts[high];
    	contacts[high] = swap;
    	pi = high;
    	return pi;
    }
}
