// JAVA Program to generate random alphabets 

class temp 
{ 

static int MAX = 26; 

// Returns a String of random alphabets of 
// length n. 
static String printRandomString(int n) 
{ 
	char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 
						'h', 'i', 'j', 'k', 'l', 'm', 'n', 
						'o', 'p', 'q', 'r', 's', 't', 'u', 
						'v', 'w', 'x', 'y', 'z' }; 

	String res = ""; 
	for (int i = 0; i < n; i++) 
		res = res + alphabet[(int) (Math.random() * 100 % MAX)]; 
	
	return res; 
} 

// Driver code 
public static void main(String[] args) 
{ 
	int n = 10; 
	System.out.print(printRandomString(n)); 
} 
} 

// This code is contributed by Rajput-Ji 
