public class Drink extends Product {
	// Constructor without arguments
	public Drink() {
		super.setCompanyName("Pepsi Co.");
		super.setBrandName("Mountain Dew");
		super.setOunces(12);
		super.setPrice(2.0);
		super.setCost(0.5);
	}
	
	// Constructor with arguments
	public Drink(String companyName,  String brandName, double ounces,  double price,  double cost) {
		super.setCompanyName(companyName);
		super.setBrandName(brandName);
		super.setOunces(ounces);
		super.setPrice(price);
		super.setCost(cost);
	}
	
	// Constructor to copy product
	public Drink(Drink copyDrink) {
		super.setCompanyName(copyDrink.getCompanyName());
		super.setBrandName(copyDrink.getBrandName());
		super.setOunces(copyDrink.getOunces());
		super.setPrice(copyDrink.getPrice());
		super.setCost(copyDrink.getCost());
	}

	// Override toString() method
	@Override
	public String toString() {
		return " Drink [" + super.getCompanyName() + ", " + super.getBrandName() + ", " + super.getOunces() + " floz., $" + super.getPrice() + ", $" + super.getCost();
	}
}
