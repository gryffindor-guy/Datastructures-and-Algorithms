class Main{


	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		int temp;

		for (int j = low; j < high; j++) {

			if (arr[j] <= pivot) {

				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}
		temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = temp;

		return i + 1;
	}


	static void sort(int[] arr, int low, int high) {

		if (low < high) {

			int partiPosition = partition(arr, low, high);

			sort(arr, low, partiPosition - 1);
			sort(arr, partiPosition + 1, high);
		}
	}

	static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	public static void main(String args[]) {

		int[] array = {9, 8, 7, 6, 5, 4, 5, 6, 7, 8, 9};

		sort(array, 0, array.length - 1);

		printArray(array);

	}
}