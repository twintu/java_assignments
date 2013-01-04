
import java.util.*;
public class guess_game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String secret_word,temp;
		StringBuilder  word=new StringBuilder();
		int length,i,score=100,flag=0,flag1=1,count=0;
		Scanner input=new Scanner(System.in);
		char letter_guess;
		char[] temp1;

		System.out.println("Enter the Secret word:");
		secret_word=input.nextLine();										//read the secret_word
		length=secret_word.length();

		for(i=0;i<length;i++)												//append * in word
			word.append("*");

		System.out.println("Guessed word:"+word);
		temp1=secret_word.toCharArray();										//convert the secret_word into character and store in a temporary variable

		// letter_guess.toLowerCase();

		do
		{
			if(! secret_word.equals(word.toString()))
			{
				System.out.println("Enter the guessed letter:");
				letter_guess=input.next().toLowerCase().charAt(0);				//read the guessed letter if it is upper-case convert into lowercase

				for(i = 0; i < length; i++)
				{
					if(temp1[i] == letter_guess)								//compare each letter with secret_word array
					{
						temp = Character.toString(secret_word.charAt(i));       //if the guessed_letter is correct then store that variable in temp
						word.replace(i,i+1, temp);								//replace * with the correct word 
						temp1[i]='*';
						System.out.println(word);
						flag=1;
						count++;
						break;
					}//end if

				}//end for
				
				if(flag==0)
				{
					score=score-10;												//if the guessed letter is wrong reduce score
					System.out.println("Score:"+score);
				}//end if
				flag=0;
				
				if(count==length)
				{
					flag1=0;
				}//end if
			}//end first if
		}while(score!=0 && flag1==1);//end do-while
		
		if(!word.equals(secret_word))
		{
			System.out.println("You win and Your score is"+score);
		}
		else
		{
			System.out.println("Sorry U lose ");
		}//end if statement
	}//end main
}//end class

