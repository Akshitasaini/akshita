package coom.taskk;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class CD {

	private int cdId;
	private String cdName;
	private String cdGenre;
	private double cdPrice;
	@Override
	public String toString() {
		return "CD cdId=" + cdId + ", cdName=" + cdName + ", cdGenre=" + cdGenre + ", cdPrice=" + cdPrice + "$";
	}

      public void getCDType(CD cd)
      {
  		if(cd instanceof InternationalCD) //downcasting
  		{
			InternationalCD iCD = (InternationalCD)cd;
			System.out.println(iCD);

  		}

      }
	
}
