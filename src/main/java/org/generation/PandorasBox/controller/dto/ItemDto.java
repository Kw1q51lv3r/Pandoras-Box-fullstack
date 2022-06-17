package org.generation.PandorasBox.controller.dto;

public class ItemDto {

    //Needs to have the same attributes with the table
    private String productName;
    private String productID;
    private Integer productPrice;
    private String productDescription;
    private String productTrivia;
    private String productImgURL;
    private Integer RecoDelivery;
    private String productRemarks;
    private String productCategory;


    public ItemDto(String productName, String productID, Integer productPrice, String productDescription, String productTrivia, String productImgURL, Integer RecoDelivery, String productRemarks, String productCategory) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productTrivia = productTrivia;
        this.productImgURL = productImgURL;
        this.RecoDelivery = RecoDelivery;
        this.productRemarks = productRemarks;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
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

    public Integer getRecoDelivery() {
        return RecoDelivery;
    }

    public void setRecoDelivery(Integer recoDelivery) {
        RecoDelivery = recoDelivery;
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