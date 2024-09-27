import java.util.Scanner;
public class RandomNumber
	{

		public static void main(String[] args)
			{
				int randomNumber =(int) (Math.random()*3)+1;
				Scanner userInput = new Scanner (System.in);
				System.out.println("Ask a question, any question!");
				String choice = userInput.nextLine();
				if(randomNumber == 1)
					{
						System.out.println("Mmmmmm, absolutely  not!");
					}
				else if(randomNumber == 2)
					{
						System.out.println("Oh Definetely!!");
					}
				else if(randomNumber == 3)
					{
						System.out.println("NO");
					}

			}

	}
