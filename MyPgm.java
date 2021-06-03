package interview;

public class MyPgm {

	public static void main(String[] args) throws InterruptedException {
		int sum=1;
		while(sum<=100)
		{
			Thread.sleep(5000);
			System.out.println(sum);
			sum+=9;
		}
	}

}
