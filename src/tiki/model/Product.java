package tiki.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* @author LINHNC */
public class Product {

    public static final String STATUS_SINGLE = "single";
    public static final String STATUS_COMBINE = "combine";

    private String name;
    private BigDecimal salePrice;
    private BigDecimal marketPrice;
    private final List<String> imgPaths;       
    
    private final Attribute attribute;         // store all data type of custom attribute
    private String status;                     
    // -------------------------------- END PROPERTIES ------------------------------//
    public Product() {
        imgPaths = new ArrayList<>();
        attribute = new Attribute();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public List<String> getImgPaths() {
        return imgPaths;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", salePrice=" + salePrice + ", marketPrice=" + marketPrice + ", imgPaths=" + imgPaths + ", attribute=" + attribute + ", status=" + status + '}';
    }

}
