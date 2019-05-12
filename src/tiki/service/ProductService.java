package tiki.service;

import java.math.BigDecimal;
import java.util.Date;
import tiki.model.Attribute;
import tiki.model.Color;
import tiki.model.Product;

/* @author LINHNC */
public class ProductService {

    private Product iphone1, iphone2, iphone3;

    public void create() {
        iphone1 = new Product();
        iphone2 = new Product();
        iphone3 = new Product();
        
        // create iphone 1
        iphone1.setName("Iphone X 64Gb Black");
        iphone1.setSalePrice(BigDecimal.valueOf(999));
        iphone1.setMarketPrice(BigDecimal.valueOf(1099));
        iphone1.getImgPaths().add("/path/to/defaultImg"); 
        iphone1.getImgPaths().add("/path/to/img2");
        iphone1.getImgPaths().add("/path/to/img3");
        iphone1.getAttribute().setAttr(Attribute.COLOR, Color.BLACK);
        iphone1.getAttribute().setAttr(Attribute.STORAGE, "64Gb");
        iphone1.getAttribute().setAttr(Attribute.DESCRIPTION, "dep, gon gang, sang trong");
        iphone1.getAttribute().setAttr(Attribute.ORIGIN, "nguyen ban");
        iphone1.getAttribute().setAttr(Attribute.FACTORY_DATE, new Date());
        iphone1.getAttribute().setAttr(Attribute.WEIGHT, 1.3f);
        iphone1.setStatus(Product.STATUS_SINGLE);
        System.out.println("Create Product 1 done");
     
        // create iphone 2
        iphone2.setName("Iphone X 128Gb Yellow");
        iphone2.setSalePrice(BigDecimal.valueOf(950));
        iphone2.setMarketPrice(BigDecimal.valueOf(1050));
        iphone2.getImgPaths().add("/path/to/defaultImg"); 
        iphone2.getImgPaths().add("/path/to/img2");
        iphone2.getImgPaths().add("/path/to/img3");
        iphone2.getAttribute().setAttr(Attribute.COLOR, Color.YELLOW);
        iphone2.getAttribute().setAttr(Attribute.STORAGE, "64Gb");
        iphone2.getAttribute().setAttr(Attribute.DESCRIPTION, "dep, gon gang, sang trong");
        iphone2.getAttribute().setAttr(Attribute.ORIGIN, "nguyen ban");
        iphone2.getAttribute().setAttr(Attribute.FACTORY_DATE, new Date());
        iphone2.getAttribute().setAttr(Attribute.WEIGHT, 1.3f);
        iphone2.setStatus(Product.STATUS_SINGLE);
        System.out.println("Create Product 2 done");
        
        // create iphone 3
        iphone3.setName("Iphone X 128Gb Black-Yellow");
        iphone3.setSalePrice(BigDecimal.valueOf(1999));
        iphone3.setMarketPrice(BigDecimal.valueOf(2099));
        iphone3.getImgPaths().add("/path/to/defaultImg"); 
        iphone3.getImgPaths().add("/path/to/img2");
        iphone3.getImgPaths().add("/path/to/img3");
        iphone3.getAttribute().setAttr(Attribute.COLOR, ""+Color.YELLOW +"-"+ Color.BLACK);
        iphone3.getAttribute().setAttr(Attribute.STORAGE, "64Gb");
        iphone3.getAttribute().setAttr(Attribute.DESCRIPTION, "dep, gon gang, sang trong");
        iphone3.getAttribute().setAttr(Attribute.ORIGIN, "nguyen ban");
        iphone3.getAttribute().setAttr(Attribute.FACTORY_DATE, new Date());
        iphone3.getAttribute().setAttr(Attribute.WEIGHT, 2.4f);
        iphone3.setStatus(Product.STATUS_COMBINE);
        System.out.println("Create Product 3 done");

    }

    public void show() {
        System.out.println("\nProduct 1: "+iphone1);
        System.out.println("Product 2: "+iphone2);
        System.out.println("Product 3: "+iphone3);
        
    }
}
