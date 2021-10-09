package builderState;

public class LotionState implements State {

	@Override
	public void addIngredients() {
		
		System.out.println("Making lotions ");
		 
		System.out.println("Collectc all required ingredients");
		
	}

	@Override
	public void waterBath() {
		System.out.println("Clean all ingredients");
		
	}

	@Override
	public void combine() {
		System.out.println("Combine and mixing all ");
		
	}

	@Override
	public void heat() {
		System.out.println("heate the combined paste ");
		
	}

	@Override
	public void shake() {
		 
		System.out.println("Shake the mixed item ");
	}

}
