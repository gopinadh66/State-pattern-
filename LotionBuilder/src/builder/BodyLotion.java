package builder;

public class BodyLotion extends LotionBuilder{
	

String lotionName;
Lotiontype type ;

Lotion lotion;

public String getLotionName() {
	return lotionName;
}

public void setLotionName(String lotionName) {
	this.lotionName = lotionName;
}

public Lotiontype getType() {
	return type;
}

public void setType(Lotiontype type) {
	this.type = type;
}

public Lotion getLotion() {
	return lotion;
}

public void setLotion(Lotion lotion) {
	this.lotion = lotion;
}


	@Override
	public void addIngredients() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waterBath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void combine() {
		// TODO Auto-generated method stub
		
	}

}
