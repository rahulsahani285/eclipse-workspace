
public class Patter1 {

//	 *
//	 2* 
//	 4*6 
//	 *8*10  

	public static void main(String[] args) {

		int count = 1;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				if (count % 2 == 0) {
					System.out.print(count);
					count++;
				} else if (count % 2 != 0) {
					System.out.print("*");
					count++;
				}
			}
			System.out.println();
		}
	}

}
