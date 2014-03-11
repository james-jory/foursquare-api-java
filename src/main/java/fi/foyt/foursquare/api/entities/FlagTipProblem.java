package fi.foyt.foursquare.api.entities;

public enum FlagTipProblem {
	offensive("Offensive"), 
	spam("Spam"),
	nolongerrelevant("No Longer Relevant");
	
	private final String label;
	
	private FlagTipProblem(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
