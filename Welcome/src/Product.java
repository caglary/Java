

public class Product {
	
	 
	static int id=0;
	 private String name;
	 private String description;
	 private double price;
	 private int stockAmount;
	
	 public Product() {
		this.id++;
		System.out.println("executed Constractor Method..."+this.id);
	}
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<=0) {
			this.price=0;
		}else {
			this.price = price;
		}
		
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		if(stockAmount<=0) {
			this.stockAmount = 0;
			
		}else {
			this.stockAmount = stockAmount;
		}
		
	}
	public int getId() {
		return id;
	}
	 
	 
	 
}
