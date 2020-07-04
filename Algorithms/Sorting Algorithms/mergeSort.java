import java.util.*;
import java.lang.*;

class Main {

    public static void main(String args[]) {


		int[] array = {12, 11, 13, 5, 6, 7};
		mergeSort(array, array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}


	static void merge(int[] leftArray, int[] rightArray, int size, int leftSize, int rightSize, int[] Array) {

		int leftIndex = 0;
		int rightIndex = 0;
		int currPosition = 0;
		while (leftIndex < leftSize && rightIndex < rightSize) {

			if (leftArray[leftIndex] < rightArray[rightIndex]) {
				Array[currPosition++] = leftArray[leftIndex++];
			} else {
				Array[currPosition++] = rightArray[rightIndex++];
			}
		}

		while (leftIndex < leftSize) {
			Array[currPosition++] = leftArray[leftIndex++];
		}
		while (rightIndex < rightSize) {
			Array[currPosition++] = rightArray[rightIndex++];
		}
	}

	static void mergeSort(int[] Array, int len) {
        if (len < 2)
            return;

		int mid = len / 2;
		int[] leftArray = Arrays.copyOfRange(Array, 0, mid);
		int[] rightArray = Arrays.copyOfRange(Array, mid, len);


		mergeSort(leftArray, mid);
		mergeSort(rightArray, len - mid);


		merge(leftArray, rightArray, len, mid, len - mid, Array);

	}


	



}