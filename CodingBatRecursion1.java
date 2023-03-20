public class CodingBatRecursion1 {

	public static void main(String[] args) 
	{
		System.out.println(count8(1788287));
		
	}
	
	public static int factorial(int n)
	{ 
	    // Stop condition
	    if (n == 0 || n == 1)
	      return 1;
	 
	    // Recursive condition
	    else
	      return n * factorial(n - 1);
	}
	
	public static int bunnyEars(int bunnies) {
		
		 /*
		 We have a number of bunnies and each bunny has two big floppy ears. 
		 We want to compute the total number of ears across all the 
		 bunnies recursively (without loops or multiplication).

		 bunnyEars(0) → 0
		 bunnyEars(1) → 2
		 bunnyEars(2) → 4
		 */
		
		if (bunnies == 0)
		{
			return 0;
		}
		else if (bunnies == 1)
		{
			return 2;
		}
		else
		{
			return 2 + bunnyEars(bunnies - 1);
		}
		
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
	
	public static int bunnyEars2(int bunnies) {
		  
		 /*
		 We have bunnies standing in a line, numbered 1, 2, ... 
		 The odd bunnies (1, 3, ..) have the normal 2 ears. 
		 The even bunnies (2, 4, ..) we'll say have 3 ears, 
		 because they each have a raised foot. 
		 Recursively return the number of "ears" in the bunny 
		 line 1, 2, ... n (without loops or multiplication).

		 bunnyEars2(0) → 0
		 bunnyEars2(1) → 2
		 bunnyEars2(2) → 5
		 */
		
		if (bunnies == 0)
		{
			return 0;
		}
		else if (bunnies == 1)
		{
			return 2;
		}
		else if (bunnies == 2)
		{
			return 5;
		}
		else
		{
			if (bunnies % 2 == 0)
			{
				return 3 + bunnyEars2(bunnies - 1);
			}
			else
			{
				return 2 + bunnyEars2(bunnies - 1);
			}
		}
	}
	
	public static int triangle(int rows) {
		
		 /*
		 We have triangle made of blocks. 
		 The topmost row has 1 block, the next row down has 2 blocks, 
		 the next row has 3 blocks, and so on. 
		 Compute recursively (no loops or multiplication) 
		 the total number of blocks in such a triangle with 
		 the given number of rows.


		 triangle(0) → 0
		 triangle(1) → 1
		 triangle(2) → 3
		 */
		
		if (rows == 0 || rows == 1)
		{
			return rows;
		}
		return rows + triangle(rows - 1);
	}

	public static int sumDigits(int n) {
		  
		 /*
		 * Given a non-negative int n, return the sum of its digits 
		 * recursively (no loops). Note that mod (%) by 10 yields 
		 * the rightmost digit (126 % 10 is 6), while divide (/) 
		 * by 10 removes the rightmost digit (126 / 10 is 12).


		 sumDigits(126) → 9
		 sumDigits(49) → 13
		 sumDigits(12) → 3
		 */
		
		if (n < 10 && n >= 0)
		{
			return n;
		}
		
		return n%10 + sumDigits(n / 10);
			
	}
	
	public static int count7(int n) {
		  
		/*
		 * Given a non-negative int n, return the count of the occurrences 
		 * of 7 as a digit, so for example 717 yields 2. (no loops). 
		 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
		 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


		count7(717) → 2
		count7(7) → 1
		count7(123) → 0
		*/
		
		if (n < 10)
		{
			if (n == 7)
				return 1;
			else
				return 0;
		}
		
		return count7(n / 10) + (n % 10 == 7 ? 1 : 0) ;
	}
	
	public static int count8(int n) {
		  
		/*
		 * Given a non-negative int n, compute recursively (no loops) 
		 * the count of the occurrences of 8 as a digit, except that 
		 * an 8 with another 8 immediately to its left counts double, 
		 * so 8818 yields 4. Note that mod (%) by 10 yields the 
		 * rightmost digit (126 % 10 is 6), while divide (/) 
		 * by 10 removes the rightmost digit (126 / 10 is 12).


		count8(8) → 1
		count8(818) → 2
		count8(8818) → 4
		*/
		
		if (n == 0)
		{
			return 0;
		}
		
		if (n % 100 == 88)
		{
			return 2 + count8(n / 10);
		}
		
		else if (n % 10 == 8)
		{
			return 1 + count8(n / 10);
		}
		
		return count8(n / 10);
	}

	public static int powerN(int base, int n) {
	
		 /*
		 * Given base and n that are both 1 or more, 
		 * compute recursively (no loops) the value 
		 * of base to the n power, so powerN(3, 2) is 9 (3 squared).


	 	 powerN(3, 1) → 3
		 powerN(3, 2) → 9
		 powerN(3, 3) → 27
		 */
		
		if (n == 0)
		{
			return 1;
		}
		
		else 
		{
			return base * powerN(base, n - 1);
		}
		
	}
	
	public static int countX(String str) {
		
		/*
		 * Given a string, compute recursively (no loops) 
		 * the number of lowercase 'x' chars in the string.


		 countX("xxhixx") → 4
		 countX("xhixhix") → 3
		 countX("hi") → 0
		 */

		if (str.length() <= 1)
		{
			if (str.equals("x"))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
	}
	
	public static int countHi(String str) {
		  
		/*
		 * Given a string, compute recursively (no loops) 
		 * the number of times lowercase "hi" appears in the string.


		 countHi("xxhixx") → 1
		 countHi("xhixhix") → 2
		 countHi("hi") → 1
		 */
		
		if (str.length() <= 2)
		{
			if (str.equals("hi"))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		return (str.substring(0, 2).equals("hi" )? 1 : 0) + countHi(str.substring(1));
		
	}
	
	public static String changeXY(String str) {
		  
		/*
		 * Given a string, compute recursively (no loops) 
		 * a new string where all the lowercase 'x' chars have been changed to 'y' chars.


		 changeXY("codex") → "codey"
		 changeXY("xxhixx") → "yyhiyy"
		 changeXY("xhixhix") → "yhiyhiy"
		 */
		
		if (str.length() <= 1)
		{
			if (str.equals("x"))
			{
				return "y";
			}
			
			else
			{
				return str;
			}
		}
		
		return (str.charAt(0) == 'x' ? "y" : str.charAt(0)) + changeXY(str.substring(1)); 
	}

	public static String changePi(String str) {
		  
		/*
		 * Given a string, compute recursively (no loops) 
		 * a new string where all appearances of "pi" 
		 * have been replaced by "3.14".


		 changePi("xpix") → "x3.14x"
		 changePi("pipi") → "3.143.14"
		 changePi("pip") → "3.14p"
		 */
		
		if (str.length() <= 2)
		{
			if (str.equals("pi"))
			{
				return "3.14";
			}
			else
			{
				return str;
			}
		}
		
		return str.substring(0, 2).equals("pi") ? "3.14" + changePi(str.substring(2)) : str.substring(0, 1) + changePi(str.substring(1));
	}
	
	public static String noX(String str) {
		  
		/*
		 * Given a string, compute recursively a new string 
		 * where all the 'x' chars have been removed.


		 noX("xaxb") → "ab"
		 noX("abc") → "abc"
		 noX("xx") → ""
		 */
		
		if (str.length() <= 1)
		{
			if (str.equals("x"))
			{
				return "";
			}
			else
			{
				return str;
			}
		}
		
		return (str.charAt(0) == 'x' ? "" : str.charAt(0)) + noX(str.substring(1));
	}
	
	
	public static boolean array6(int[] nums, int index) {
		  
		/*
		 * Given an array of ints, compute recursively if the array contains a 6. 
		 * We'll use the convention of considering only the part of the array 
		 * that begins at the given index. In this way, a recursive call can 
		 * pass index+1 to move down the array. 
		 * The initial call will pass in index as 0.


		 array6([1, 6, 4], 0) → true
		 array6([1, 4], 0) → false
		 array6([6], 0) → true
		 */
		
		if (nums.length - index < 1)
		{
			return false;
		}
		else if (nums[index] == 6)
		{
			return true;
		}
		else
		{
			return array6(nums, index + 1);
		}
		
	}

	public int array11(int[] nums, int index) {
	
		
		/*
		 * Given an array of ints, compute recursively the number of times 
		 * that the value 11 appears in the array. We'll use the convention of 
		 * considering only the part of the array that begins at the given index. 
		 * In this way, a recursive call can pass index+1 to move down the array. 
		 * The initial call will pass in index as 0.


		 array11([1, 2, 11], 0) → 1
		 array11([11, 11], 0) → 2
		 array11([1, 2, 3, 4], 0) → 0
		 */
		
		if (nums.length - index < 1)
		{
			return 0;
		}
		else if (nums[index] == 11)
		{
			return 1 + array11(nums, index + 1);
		}
		else
		{
			return array11(nums, index + 1);
		}
		
	}
	
	public boolean array220(int[] nums, int index) {
	
		/*
		 * Given an array of ints, compute recursively if the array contains 
		 * somewhere a value followed in the array by that value times 10. 
		 * We'll use the convention of considering only the part of the array 
		 * that begins at the given index. In this way, a recursive call 
		 * can pass index+1 to move down the array. 
		 * The initial call will pass in index as 0.


		 array220([1, 2, 20], 0) → true
		 array220([3, 30], 0) → true
		 array220([3], 0) → false
		 */
		
		
		if (nums.length - index <= 1)
		{
			return false;
		}
		
		else
		{
			if (nums[index] * 10 == nums[index + 1])
			{
				return true;
			}
			else
			{
				return array220(nums, index + 1);
			}
		}
		
	}

	public String allStar(String str) {
		  
		/*
		 * Given a string, compute recursively a new string 
		 * where all the adjacent chars are now separated by a "*".


		 allStar("hello") → "h*e*l*l*o"
		 allStar("abc") → "a*b*c"
		 allStar("ab") → "a*b"
		 */
		
		if (str.length() <= 1)
		{
			return str;
		}
		
		else
		{
			return str.charAt(0) + "*" + allStar(str.substring(1));
		}
	}
	
	public String pairStar(String str) {
	
		/*
		 * Given a string, compute recursively a new string 
		 * where identical chars that are adjacent 
		 * in the original string are separated from each other by a "*".


		 pairStar("hello") → "hel*lo"
		 pairStar("xxyy") → "x*xy*y"
		 pairStar("aaaa") → "a*a*a*a"
		 */
		
		if (str.length() <= 1)
		{
			return str;
		}
		
		else
		{
			if (str.charAt(0) == str.charAt(1))
			{
				return str.charAt(0) + "*" + pairStar(str.substring(1));
			}
			else
			{
				return str.charAt(0) + pairStar(str.substring(1));
			}
		}
	}
	
	public String endX(String str) {
		  
		/*
		 * Given a string, compute recursively a new string 
		 * where all the lowercase 'x' chars have been
		 * moved to the end of the string.


		 endX("xxre") → "rexx"
		 endX("xxhixx") → "hixxxx"
		 endX("xhixhix") → "hihixxx"
		 */
		
		if (str.length() <= 1)
		{
			return str;
		}
		else
		{
			if (str.charAt(0) == 'x')
			{
				return endX(str.substring(1)) + "x";
			}
			else
			{
				return str.charAt(0) + endX(str.substring(1));
			}
		}
	}
	
	public int countPairs(String str) {
	
		/*
		 * We'll say that a "pair" in a string is two instances of 
		 * a char separated by a char. So "AxA" the A's make a pair. 
		 * Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. 
		 * Recursively compute the number of pairs in the given string.


		 countPairs("axa") → 1
		 countPairs("axax") → 2
		 countPairs("axbx") → 1
		 */
		
		if (str.length() < 3)
		{
			return 0;
		}
		else
		{
			if (str.charAt(0) == str.charAt(2))
			{
				return 1 + countPairs(str.substring(1));
			}
			else
			{
				return countPairs(str.substring(1));
			}
		}
	}
	
	
	public int countAbc(String str) {
	
		/*
		 * Count recursively the total number of "abc" 
		 * and "aba" substrings that appear in the given string.


		 countAbc("abc") → 1
		 countAbc("abcxxabc") → 2
		 countAbc("abaxxaba") → 2
		 */
		
		if (str.length() < 3)
		{
			return 0;
		}
		
		else 
		{
			if (str.substring(0, 3).equals("abc") || 
					str.substring(0, 3).equals("aba"))
			{
				return 1 + countAbc(str.substring(1));
			}
			else
			{
				return countAbc(str.substring(1));
			}
		}
	}
	
	public int count11(String str) {
		  
		/*
		 * Given a string, compute recursively (no loops) 
		 * the number of "11" substrings in the string. 
		 * The "11" substrings should not overlap.


		 count11("11abc11") → 2
		 count11("abc11x11x11") → 3
		 count11("111") → 1
		 */
		
		if (str.length() < 2)
		{
			return 0;
		}
		else
		{
			if (str.substring(0, 2).equals("11"))
			{
				return 1 + count11(str.substring(2));
			}
			else
			{
				return count11(str.substring(1));
			}
		}
	}
	
	public String stringClean(String str) {
	
		/*
		 * Given a string, return recursively a "cleaned" string where adjacent chars 
		 * that are the same have been reduced to a single char. So "yyzzza" yields "yza".


		 stringClean("yyzzza") → "yza"
		 stringClean("abbbcdd") → "abcd"
		 stringClean("Hello") → "Helo"
		 */
		
		if (str.length() <= 1)
		{
			return str;
		}
		
		else
		{
			if (str.charAt(0) == str.charAt(1))
			{
				return stringClean(str.substring(1));
			}
			else
			{
				return str.charAt(0) + stringClean(str.substring(1));
			}
		}
	}
	
	public int countHi2(String str) {
	
		/*
		 * Given a string, compute recursively the number of times lowercase "
		 * hi" appears in the string, however do not count "hi" 
		 * that have an 'x' immedately before them.


		 countHi2("ahixhi") → 1
		 countHi2("ahibhi") → 2
		 countHi2("xhixhi") → 0
		 */
		
		if (str.length() < 2)
		{
			return 0;
		}
		
		else if (str.length() == 2)
		{
			if (str.equals("hi"))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		else
		{
			if (str.charAt(0) == 'h' && str.charAt(1) == 'i')
			{
				return 1 + countHi2(str.substring(2));
			}
			if (str.charAt(0) == 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i')
			{
				return countHi2(str.substring(3));
			}
			else if (str.charAt(0) != 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i')
			{
				return 1 + countHi2(str.substring(3));
			}
			else
			{
				return countHi2(str.substring(1));
			}
		}
	}
	
	public static String parenBit(String str) {
		  
		/*
		 * Given a string that contains a single pair of parenthesis, 
		 * compute recursively a new string made of only of the parenthesis 
		 * and their contents, so "xyz(abc)123" yields "(abc)".


		 parenBit("xyz(abc)123") → "(abc)"
		 parenBit("x(hello)") → "(hello)"
		 parenBit("(xy)1") → "(xy)"
		 */
		
		if (str.charAt(0) == '(' &&
				str.charAt(str.length() - 1) == ')')
		{
			return str;
		}
		else
		{
			if (str.charAt(0) == '(')
			{
				return parenBit(str.substring(0, str.length() - 1));
			}
			else if (str.charAt(str.length() - 1) == ')')
			{
				return parenBit(str.substring(1));
			}
			else
			{
				return parenBit(str.substring(1, str.length() - 1));
			}
		}
	}
	
	public boolean nestParen(String str) {
		  
		/*
		 * Given a string, return true if it is a nesting of 
		 * zero or more pairs of parenthesis, like "(())" or "((()))". 
		 * Suggestion: check the first and last chars, and then recur on what's inside them.
		
		
		 nestParen("(())") → true
		 nestParen("((()))") → true
		 nestParen("(((x))") → false
		 */
		
		if (str.length() == 0)
		{
			return true;
		}
		if (str.length() == 1)
		{
			return false;
		}
		
		if (str.equals("()"))
		{
			return true;
		}
		else
		{
			if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
			{
				return nestParen(str.substring(1, str.length() - 1));
			}
			else
			{
				return false;
			}
		}
	}

	public int strCount(String str, String sub) {
		 
		/*
		 * Given a string and a non-empty substring sub, 
		 * compute recursively the number of times that 
		 * sub appears in the string, 
		 * without the sub strings overlapping.


		 strCount("catcowcat", "cat") → 2
		 strCount("catcowcat", "cow") → 1
		 strCount("catcowcat", "dog") → 0
		 */
		
		if (str.length() <= sub.length())
		{
			if (str.equals(sub))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if (str.substring(0, sub.length()).equals(sub))
			{
				return 1 + strCount(str.substring(sub.length()), sub);
			}
			else
			{
				return strCount(str.substring(1), sub);
			}
		}
	}
	
	public boolean strCopies(String str, String sub, int n) {
	
		/*
		 * Given a string and a non-empty substring sub, 
		 * compute recursively if at least n copies of sub 
		 * appear in the string somewhere, 
		 * possibly with overlapping. 
		 * N will be non-negative.


		 strCopies("catcowcat", "cat", 2) → true
		 strCopies("catcowcat", "cow", 2) → false
		 strCopies("catcowcat", "cow", 1) → true
		 */
		
		if (n == 0)
		{
			return true;
		}
		else if (n == 1)
		{
			if (str.contains(sub))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if (str.length() < sub.length())
			{
				return false;
			}
			else
			{
				if(str.substring(0, sub.length()).equals(sub))
				{
					return strCopies(str.substring(1), sub, n - 1);
				}
				else
				{
					return strCopies(str.substring(1), sub, n);
				}
			}
		}
		
	}
	
	public int strDist(String str, String sub) {
		
		/*
		 * Given a string and a non-empty substring sub, 
		 * compute recursively the largest substring 
		 * which starts and ends with sub and return its length.


		 strDist("catcowcat", "cat") → 9
		 strDist("catcowcat", "cow") → 3
		 strDist("cccatcowcatxx", "cat") → 9
		 */
		
		if(str.length() < sub.length())
	        return 0;
	          
	    if(str.substring(0, sub.length()).equals(sub) &&
	        str.substring(str.length() - sub.length()).equals(sub))
	        return str.length();
	                        
	    if(!str.substring(0, sub.length()).equals(sub))
	        return strDist(str.substring(1), sub);
	                                  
	    return strDist(str.substring(0, str.length()-1), sub);
	}
	
	
	
}













