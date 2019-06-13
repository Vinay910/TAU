
package ifkeyword;

public class IfKeyword {

	public static void main(String[] args) {
		int result;
		result = scoreCalculator(100, 10, true, 200);
		System.out.println(result);
		result = scoreCalculator(10000, 10, true, 200);
		System.out.println(result);
		displayHighScorePosition("Vinayak",1500);
		displayHighScorePosition("Sun",900);
		displayHighScorePosition("John",400);
		displayHighScorePosition("Bob",50);
	}

	public static int scoreCalculator(int score, int level, boolean gameover, int bonus) {
		int finalscore = -1;
		if (gameover) {
			finalscore = score + (level * bonus);

		}
		return finalscore;
	}

	public static void displayHighScorePosition(String playername,int score)
	{
		int result;
		result=calculateHighScorePosition(score);
		System.out.println(playername+" managed to get into position "+result+" on the high score table" );	
		}

	public static int calculateHighScorePosition(int score)
	{
		if(score>=1000)
		{
			return 1;
		}
		else if(score>=500)
		{
			return 2;
		}
		else if(score>=100)
		{
			return 3;
		}
		else
		{
			return 4;
		}	
	}
}