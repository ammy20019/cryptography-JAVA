import java.util.Scanner;

class mod_arithmetic_calc {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: \n1. Power in modular arithmetic (x^y  mod p) \n2. Multiplicative Inverse (a mod m) \n3. Addition \n4. Substraction \n5. Multiplication \n6. Division");
    operator = input.next().charAt(0);

    switch (operator) {


      case '1':
    	  int res = 1; 
    	    System.out.println("Enter x");
    	   int x = input.nextInt();
    	   System.out.println("Enter y");
    	    int y = input.nextInt();
    	    System.out.println("Enter p");
    	    int p = input.nextInt();

    	  
    	    x = x % p; 
    	 
    	    if (x == 0) {
    	    	System.out.println("case x is divisible by p");
    	    	break;
    	    }
    	 
    	    while (y > 0)
    	    {
    	    	if ((y & 1) != 0)
    	    		res = (res * x) % p;

    	    	y = y >> 1; // y = y/2
    	    	x = (x * x) % p;
    	    }
        System.out.println("x^y  mod p is " + res);
        break;


      case '2':
    	  System.out.println("Enter a");
   	   int a = input.nextInt();
   	   System.out.println("Enter m");
   	    int m = input.nextInt();
   	    for (int j = 1; j < m; j++)
   	    	if (((a%m) * (j%m)) % m == 1)
   	    		System.out.println("a inverse mod m is : "+ j);
        
        break;

      case '3':
    	  System.out.println("Enter first number");
    	    number1 = input.nextDouble();

    	    System.out.println("Enter second number");
    	    number2 = input.nextDouble();
          result = number1 + number2;
          System.out.println(number1 + " + " + number2 + " = " + result);
          break;

        case '4':
        	System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();
          result = number1 - number2;
          System.out.println(number1 + " - " + number2 + " = " + result);
          break;

        case '5':
        	System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();
          result = number1 * number2;
          System.out.println(number1 + " * " + number2 + " = " + result);
          break;

        case '6':
        	System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();
          result = number1 / number2;
          System.out.println(number1 + " / " + number2 + " = " + result);
          break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}