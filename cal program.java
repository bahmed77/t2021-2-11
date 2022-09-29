class Main 
{
	public static void main(String[] args) 
	{
		char typeofoperation ;
			double a,b,res;
			Scanner input = new Scanner (System.in);
		System.out.println("choose an operator = +,-,*or /");
		typeofoperation = input.next().charAt(0);
		System.out.println("Enter first number");
        a = input.nextDouble();
		System.out.println("Enter second number");
        b = input.nextDouble();
		 switch (typeofoperation)
     {

      // performs addition between numbers
      case '+':
        res = a + b;
        System.out.println(a + " + " + b + " = " + res);
        break;

      // performs subtraction between numbers
      case '-':
        res = a - b;
        System.out.println(a + " - " + b + " = " + res);
        break;

      // performs multiplication between numbers
      case '*':
        res = a * b;
        System.out.println(a + " * " + b + " = " + res);
        break;

      // performs division between numbers
      case '/':
        res = a/ b;
        System.out.println(a + " / " + b + " = " + res);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
	}

