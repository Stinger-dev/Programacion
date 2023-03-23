package TEST;




public class Main {


	public static int[] test = new int[] {2,1, 7,4,5,3, 0, 0, 0};

	public static void main(String[] args) {

		ordenarArray();
		
		
		for (int n :test) {
			System.out.println(n);
		}
	}

	
	public static void ordenarArray() {
		int[] tmp_array = test;
		int tmp;
		for (int i = 0; i< tmp_array.length; i++) {
			for (int j = i; j < tmp_array.length; j++) {
				if (tmp_array[j]!=0 && tmp_array[i] > tmp_array[j]) {
					tmp = tmp_array[j];
					tmp_array[j] = tmp_array[i];
					tmp_array[i] = tmp;
				}
			}
		}
		test = tmp_array;
	}
	
	
}

