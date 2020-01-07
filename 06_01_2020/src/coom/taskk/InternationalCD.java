package coom.taskk;

public class InternationalCD extends CD {
	private String language;
	
	public InternationalCD() {
		 super();
	}

	public InternationalCD(int cdId, String cdName, String cdGenre, double cdPrice, String language) {
		super(cdId, cdName, cdGenre, cdPrice);
		this.language=language;
	}

	@Override
	public String toString() {
		
		return "INTERNATIONAL CD ===>\n CD details" + super.toString() +"language:"+language;
	}
	

}
