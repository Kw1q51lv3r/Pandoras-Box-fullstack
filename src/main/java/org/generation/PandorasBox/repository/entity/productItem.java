package org.generation.PandorasBox.repository.entity;

//Repository package is part of the Model Component (MVC)
//Item is the entity class to use to map against the table from the database

import org.generation.PandorasBox.controller.dto.ItemDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class productItem {

    //Needs to have the same attributes with the table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productName;
    private Integer productPrice;
    private String productDescription;
    private String productTrivia;
    private String productImgURL;
    private Integer productDelivery;
    private String productRemarks;
    private String productCategory;


    public productItem() {
    }

    public productItem(ItemDto itemDto ) {
        this.productName = itemDto.getProductName();
        this.productPrice = itemDto.getProductPrice();
        this.productDescription = itemDto.getProductDescription();
        this.productTrivia = itemDto.getProductTrivia();
        this.productImgURL = itemDto.getProductImgURL();
        this.productDelivery = itemDto.getProductDelivery();
        this.productRemarks = itemDto.getProductRemarks();
        this.productCategory = itemDto.getProductCategory();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString()
    {
        return "productItem{" + "id=" + id + ", productName='" + productName + '\'' + ", productPrice='" + productPrice + '\'' + ", productDescription='" + productDescription + '\'' + ",productTrivia='" + productTrivia + '\'' + ", productImgURL ='" + productImgURL + '\'' + ", productDelivery='" + productDelivery + '\'' + ", productRemarks='" + productRemarks + '\'' + ", productCategory='" + productCategory + '}';
    }

}

