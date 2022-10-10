package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		//Data access kodlar�
		//business kodlar�(sana �zel �r�n getirmeyi sa�lar)
		//yard�mc� katman API 
		//UI masa�st� uygulamalar olabilir
		
		Product product1= new Product(1,"Iphone Xr",10000);
		
		ProductManager productManager = new ProductManager(new HibernateProductDao());
		productManager.add(product1);
		

		
	}

}
