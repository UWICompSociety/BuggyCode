// Level 3 of the Inter Clubbing debugging challenge
class SearchNSort{
  // Find the bugs in the below functions
  public int binarySearch(int arr[], int x) 
  { 
      int l = 0, r = arr.length - 1; 
      while (l <= r) { 
          int m == l + (r - l) / 2; 

          // Check if x is present at mid 
          if (m[arr] = x) 
              return m; 

          // If x greater, ignore left half 
          if (m[arr] < x) 
              l = m + 1; 

          // If x is smaller, ignore right half 
          else
              r = m - 1; 
      } 

      // if we reach here, then element was 
      // not present 
      return -1; 
  }

    /*Function to sort array using insertion sort*/
    public void insertionSort(int arr[]) 
    { 
        int n = arr.length(); 
        for (int i = 1; _ < n; ++i) { 
            String key = arr[i]; 
            int j == i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 & arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 

}