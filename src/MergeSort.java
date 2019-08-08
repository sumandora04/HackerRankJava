public class MergeSort {

    public void sort(int arr[], int leftIndex, int rightIndex){
        if (leftIndex<rightIndex){
            int middle = (leftIndex+rightIndex)/2;

            sort(arr, leftIndex, middle);
            sort(arr, middle+1, rightIndex);

            mergeArrays(arr, leftIndex,middle,rightIndex);
        }
    }

    private void mergeArrays(int[] arr, int leftIndex, int middle, int rightIndex) {
        //Find the size of two sub arrays:
        int size1 = middle-leftIndex+1;
        int size2 = rightIndex-middle;

        //Create temporary arrays:
        int L[] = new int[size1];
        int R[] = new int[size2];

        //copy the data to the temporary array:
        for (int i = 0; i < size1; ++i) {
           L[i] = arr[leftIndex+i];
        }

        for (int i = 0; i < size2; ++i) {
            R[i] = arr[middle+1+i];
        }

        // Find the initial index of 1st and 2nd array:
        int i = 0; int j = 0;

        //Initial index of the merged array will be leftIndex;
        int mergedIndex = leftIndex;

        while (i<size1 && j<size2){
            if (L[i]<= R[j]){
                arr[mergedIndex] = L[i];
                i++;
            }else {
                arr[mergedIndex] = R[j];
                j++;
            }

            mergedIndex++;
        }

        //copy the remaining elements of L[]
        while (i<size1){
            arr[mergedIndex] = L[i];
            i++;
            mergedIndex++;
        }

        //copy the remaining elements of L[]
        while (j<size2){
            arr[mergedIndex] = R[j];
            j++;
            mergedIndex++;
        }
    }

}
