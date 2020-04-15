package Assignment5;

public class InsertSort extends SequenceNumber implements Sort {

	InsertSort(int n) {
		super(n);

	}

	@Override
	public void sort() {

	}

	public void insertionSort(int arr[], int n) {
		int i, key, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

}
