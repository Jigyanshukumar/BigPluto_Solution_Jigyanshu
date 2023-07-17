	//Question no. - 11
class missing {


	public static void lost(int arr[], int N)
	{
		int i;
		int temp[] = new int[N + 1];
		for (i = 0; i <= N; i++) {
			temp[i] = 0;
		}

		for (i = 0; i < N; i++) {
			temp[arr[i] - 1] = 1;
		}

		int sol = 0;
		for (i = 0; i <= N; i++) {
			if (temp[i] == 0)
				sol = i + 1;
		}
		System.out.println(sol);
	}

	public static void main(String[] args)
	{
		int arr[] = { 1,2,3,5 };
		int n = arr.length;

		System.out.print("Missing No. is  ");
		lost(arr, n);
	}
}
