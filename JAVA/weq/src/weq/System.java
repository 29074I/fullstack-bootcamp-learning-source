package weq;

import java.util.ArrayList;

public class System {
	
	public static Object out;
	private ArrayList<Product> list = new ArrayList<>();
	
	public void addProduct(String name, int unitPrice, int amount) {
		Product p = new Product(name, unitPrice, amount);
		list.add(p);
	}
	
	// 예상 판매량 조회 
	public String getProductList() {
		String k = "";
		for(int i=0;i<list.size();i++) {
			Product temp = list.get(i);
			k+= temp.getName(k);
			k+="\n";
		}
		return k;
	}

}
