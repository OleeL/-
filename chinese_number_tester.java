import java.util.Scanner;
public class chinese_number_tester
{
	public static String[] cCharacters = new String[13];
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
		int input = 0;
		int max = 0;
        cCharacters[ 0] = "\u96f6"; // 0
        cCharacters[ 1] = "\u4e00"; // 1
        cCharacters[ 2] = "\u4E8C"; // 2
        cCharacters[ 3] = "\u4E09"; // 3
        cCharacters[ 4] = "\u56DB"; // 4
        cCharacters[ 5] = "\u4E94"; // 5
        cCharacters[ 6] = "\u516D"; // 6
        cCharacters[ 7] = "\u4E03"; // 7
        cCharacters[ 8] = "\u516B"; // 8
        cCharacters[ 9] = "\u4E5D"; // 9
        cCharacters[10] = "\u5341"; // 10
        cCharacters[11] = "\u767E"; // 100
        cCharacters[12] = "\u5343"; // 1000

		System.out.println("====================================");
		System.out.println("Welcome to \u5965\u5229\u5F17\u7684\u4E2D\u6587\u6570\u77E5\u8BC6\u6D4B\u8BD5!");
		System.out.println("====================================");
		while (true){
			System.out.println("Select a difficulty:");
			System.out.println("\t1. Beginner (0-9)");
			System.out.println("\t2. Easy (0-99)");
			System.out.println("\t3. Medium (0-999)");
			System.out.println("\t4. Hard (0-9999)");
			//System.out.println("\t5. Extreme (0-99999)");
			//System.out.println("\t6. \u5929\u624D (0-999999)\n\n");
			input = scanner.nextInt();
			if (input == 1){
				max = 9;
				break;
			}
			else if (input == 2){
				max = 99;
				break;
			}
			else if (input == 3){
				max = 999;
				break;
			}
			else if (input == 4){
				max = 9999;
				break;
			}
			// else if (input == 5){
			// 	max = 99999;
			// 	break;
			// }
			// else if (input == 6){
			// 	max = 999999;
			// 	break;
			// }
			else
				System.out.println("Input not in range");
		}
		int number = getRandomNumber(max);
		int points = 0;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		while (true)
		{
			System.out.print("What is "+number_to_string(number)+"? ");
			input = scanner.nextInt();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			if (number == input)
			{
				points++;
				System.out.print("Points: "+points+" - ");
				System.out.println("Correct!");
				number = getRandomNumber(max);
			}
			else
			{
				System.out.print("Points: "+points+" - ");
				System.out.println("Incorrect!");
			}
		}
    }
    public static int getRandomNumber(int max)
    {
    	return (int)((Math.random() * ((max - 0) + 1)) + 0);
    }

    public static String number_to_string(int number)
	{
		String final_string = "";
		String strNum = Integer.toString(number);
		if (number >= 1000)
		{
			final_string = cCharacters[Integer.parseInt(strNum.substring(0,1))]+cCharacters[12];
			if (Integer.parseInt(strNum.substring(1,2)) == 0)
				final_string = final_string+cCharacters[0];
			else
			{
				final_string = final_string+cCharacters[Integer.parseInt(strNum.substring(1,2))];
				final_string = final_string+cCharacters[11];
			}

			if (Integer.parseInt(strNum.substring(2,3)) == 0)
				final_string = final_string+cCharacters[0];
			else
			{
				final_string = final_string+cCharacters[Integer.parseInt(strNum.substring(2,3))];
				final_string = final_string+cCharacters[10];
			}
			
			final_string = final_string+cCharacters[Integer.parseInt(strNum.substring(3,4))];
		}
		else if (number >= 100)
		{ 
			final_string = cCharacters[Integer.parseInt(strNum.substring(0,1))]+cCharacters[11];
			if (Integer.parseInt(strNum.substring(1,2)) == 0)
				final_string = final_string+cCharacters[0];
			else
			{
				final_string = final_string+cCharacters[Integer.parseInt(strNum.substring(1,2))];
				final_string = final_string+cCharacters[10];
			}
			final_string = final_string+cCharacters[Integer.parseInt(strNum.substring(2,3))];
		}
		else if (number >= 10)
		{ 
			final_string = cCharacters[Integer.parseInt(strNum.substring(0,1))]+cCharacters[10];
			if (Integer.parseInt(strNum.substring(1,2)) != 0)
				final_string = final_string+cCharacters[Integer.parseInt(strNum.substring(1,2))];
		}
		else
		{
			final_string = final_string+cCharacters[Integer.parseInt(strNum.substring(0,1))];
		}
		return final_string;
	}

	public static boolean string_in_list(String str )
	{
		return true;
	}
}
