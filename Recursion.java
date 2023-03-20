
public class Recursion {

	public static void main(String[] args) {
		
		/*
		 * Algorithm: Steps
		 * 
		 * Step1 - Define a base case: 
		 * Identify the simplest case for which the solution is known or trivial. 
		 * This is the stopping condition for the recursion, 
		 * as it prevents the function from infinitely calling itself.
		 * 
		 * Step2 - Define a recursive case: 
		 * Define the problem in terms of smaller subproblems. 
		 * Break the problem down into smaller versions of itself, 
		 * and call the function recursively to solve each subproblem.
		 * 
		 * Step3 - Ensure the recursion terminates: 
		 * Make sure that the recursive function eventually 
		 * reaches the base case, and does not enter an infinite loop.
		 * 
		 * step4 - Combine the solutions: 
		 * Combine the solutions of the subproblems to solve the original problem.
		 * */
		
		System.out.println("The sum of first 10 numbers : " + firstNSumIterative(10));
		System.out.println("The sum of first 10 numbers : " + firstNSumRecursive(10));

		/*
		 * Recursion uses more memory, 
		 * because the recursive function adds 
		 * to the stack with each recursive call,
		 * and keeps the values there until the call is finished. 
		 * The recursive function uses LIFO (LAST IN FIRST OUT) 
		 * Structure just like the stack data structure.
		 */
	}

	public static int firstNSumIterative(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static int firstNSumRecursive(int n)
	{
		// Stop condition
		if (n == 1)
		{
			return 1;
		}
		
		// Recursion function
		return n + firstNSumRecursive(n-1);
	}
	
	public static int fibonacci(int n)
	{
	    // Stop condition
	    if (n == 0)
	        return 0;
	 
	    // Stop condition
	    if (n == 1 || n == 2)
	        return 1;
	 
	    // Recursion function
	    else
	        return (fibonacci(n - 1) + fibonacci(n - 2));
	}
	
	// Factorial function
	public static int factorial(int n)
	{
	 
	    // Stop condition
	    if (n == 0 || n == 1)
	      return 1;
	 
	    // Recursive condition
	    else
	      return n * factorial(n - 1);
	}
	
	
}
