package com.client;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import com.venki.ProductService;
import com.venki.ProductServiceService;

public class App
{
   public static void main( String[] args )
   {
	   NumberConversion nc = new NumberConversion();
	   NumberConversionSoapType ncp = nc.getNumberConversionSoap();

//       ProductServiceService pss =new ProductServiceService();
//       ProductService port = pss.getProductServicePort();
//       System.out.println(port.getProductCatagories());
//       System.out.println(port.getProducts("cars"));
//       port.addProduct("cars", "malibu");
//       System.out.println(port.getProducts("cars"));
      
       
   }
}
