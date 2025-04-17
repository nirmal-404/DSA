package _26_calc_execution_time;

public class Main {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
//		----------- program ----------------
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		------------------------------------
		
		long duration = (System.nanoTime() - start) / 1000000;
		System.out.println(duration + " ms");
	}

}
