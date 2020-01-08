package myonlineshop;

public class MP3Player extends Electronics {
	private String colour ;
	
	public MP3Player(double regularPrice, String manufacturer, String colour) {
		super(regularPrice, manufacturer);
		this.colour = colour;
	}

	public double computeSalePrice() {
		return super.getRegularPrice();
	};

    public String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        this.colour=colour;
    }
}
