package org.generation.PandorasBox.controller.dto;

public class ItemDto {

    //Needs to have the same attributes with the table

    private String productName;
    private Integer productPrice;
    private String productDescription;
    private String productTrivia;
    private String productImgURL;
    private Integer productDelivery;
    private String productRemarks;
    private String productCategory;


    public ItemDto(String productName, Integer productPrice, String productDescription, String productTrivia, String productImgURL, Integer productDelivery, String productRemarks, String productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productTrivia = productTrivia;
        this.productImgURL = productImgURL;
        this.productDelivery = productDelivery;
        this.productRemarks = productRemarks;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductTrivia() {
        return productTrivia;
    }

    public void setProductTrivia(String productTrivia) {
        this.productTrivia = productTrivia;
    }

    public String getProductImgURL() {
        return productImgURL;
    }

    public void setProductImgURL(String productImgURL) {
        this.productImgURL = productImgURL;
    }

    public Integer getProductDelivery() {
        return productDelivery;
    }

    public void setProductDelivery(Integer productDelivery) {
        this.productDelivery = productDelivery;
    }

    public String getProductRemarks() {
        return productRemarks;
    }

    public void setProductRemarks(String productRemarks) {
        this.productRemarks = productRemarks;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}