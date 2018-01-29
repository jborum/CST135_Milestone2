abstract class Snack extends Product {

	// Constructor without arguments
	public Snack() {
		super.setCompanyName("Frito Lay");
		super.setBrandName("Lays");
		super.setOunces(1.0);
		super.setPrice(1.0);
		super.setCost(0.20);
	}
	
	// Constructor with arguments
	public Snack(String companyName,  String brandName,  double ounces,  double price,  double cost) {
		super.setCompanyName(companyName);
		super.setBrandName(brandName);
		super.setOunces(ounces);
		super.setPrice(price);
		super.setCost(cost);
	}
	
	public Snack(Snack copySnack) {
		super.setCompanyName(copySnack.getCompanyName());
		super.setBrandName(copySnack.getBrandName());
		super.setOunces(copySnack.getOunces());
		super.setPrice(copySnack.getPrice());
		super.setCost(copySnack.getCost());
	}

	// Override toString() method
	@Override
	public String toString() {
		return super.toString();
	}
}
