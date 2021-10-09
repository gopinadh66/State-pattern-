package builder;

import builderState.LotionState;
import builderState.State;

public class LotionBuilderStateDemo {

	
	public static void main(String[] args) {
		
	//	BodyLotion lotionBuilder = new BodyLotion();
		
		State lotionBuilderState = new LotionState();
		
		lotionBuilderState.addIngredients();
		
		lotionBuilderState.waterBath();
		
		lotionBuilderState.combine();
		
		lotionBuilderState.heat();
		
		lotionBuilderState.shake();
		
		
		
		
	}
	
}
