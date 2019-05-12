package tiki;

import tiki.service.ProductService;

/* @author LINHNC*/
public class Main {

    public static void main(String[] args) {
        ProductService ps = new ProductService();
        ps.create();
        ps.show();   
    }
}
