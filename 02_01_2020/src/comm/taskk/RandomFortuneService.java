package comm.taskk;
import java.util.Random;

public class RandomFortuneService {
	private String fortune[]= {
			"Whether You Think You Can Or Think You Can’t, You’re Right","Don’t Let Yesterday Take Up Too Much Of Today.",
			"The Way Get Started Is To Quit Talking And Begin Doing","Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough"," The Man Who Has Confidence In Himself Gains The Confidence Of Others"
	};
	
	public String getDailyFortune()
	{
		Random random=new Random();

		return fortune[random.nextInt(5)];

	}

}
