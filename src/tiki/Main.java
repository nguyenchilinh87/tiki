package tiki;

import tiki.service.ProductService;

/**
 *
 * @author LINHNC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        ps.create();
        ps.show();   
    }
}
