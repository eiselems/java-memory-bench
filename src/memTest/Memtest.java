package memTest;

public class Memtest {

	/*
	 * SETTINGS
	 */

	final static int INDEX_SIZE = 50000;

	// STATICS FOR CALCULATIONS
	final static int DATATYPE_SIZE_BIT = 32;

	public static void main(String[] args) throws InterruptedException {
		float beforeMb = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024.0f/1024.0f;
		System.out.println("Before: "+beforeMb + "Mb");
		
		//allocate
		int[][] intArray = new int [INDEX_SIZE][INDEX_SIZE];
		float afterMB = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024.0f/1024.0f;
		
		System.out.println("After: "+(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024.0f/1024.0f + "Mb");
		System.out.println("Diff: "+ (afterMB - beforeMb)+"Mb");
		
		double calculatedSize = ((long) INDEX_SIZE* (long) INDEX_SIZE)/8.0/1024.0/1024.0*DATATYPE_SIZE_BIT; 
		System.out.format("Optimal size of %d x %d 2dimensional array is %f Mb", INDEX_SIZE, INDEX_SIZE, calculatedSize);
		Thread.sleep(10000);
	}

}
