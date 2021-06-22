package exam;

public class CountCombinations {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
	static int countWays(int n)
	{
		int DP[] = new int[n + 1];

		
		DP[0] = DP[1] = DP[2] = 1;
		DP[3] = 2;

		
		for (int i = 4; i <= n; i++)
			DP[i] = DP[i - 1] + DP[i - 3]
					+ DP[i - 4];

		return DP[n];
	}


	public static void main(String[] args)
	{
		int n = 10;
		System.out.println(countWays(n));
	}

}
