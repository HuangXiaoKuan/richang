public class thisis{
	public static void main(String[] args) {
		for(int i = 0; i< 10; i++){
			System.out.println(i);
			Systemoutprintln(i+i);
		}

	}




	static void xuan(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			int m = i;
			int j;
			for (j = i + 1;  j  < arr.length; j++) {
				if(arr[m] > arr[j]){
					m = i + 1;
				}
			}

			if(m != i){
				int temp = arr[i];

				arr[i]  = arr[j];

				arr[j] = temp;
			}
			System.out.println(i);
		}
	}
}