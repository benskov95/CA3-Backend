package dto;

import entities.ProductOrderline;

public class ProductOrderlineDTO {
    
    private int orderlineId;
    private int productId;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private int quantity;

    public ProductOrderlineDTO(ProductOrderline orderline) {
        this.orderlineId = orderline.getId();
        this.productId = orderline.getProduct().getId();
        this.title = orderline.getProduct().getTitle();
        this.price = orderline.getProduct().getPrice();
        this.description = orderline.getProduct().getDescription();
        this.category = orderline.getProduct().getCategory();
        this.image = orderline.getProduct().getImage();
        this.quantity = orderline.getQuantity();
    }

    public int getOrderlineId() {
        return orderlineId;
    }

    public void setOrderlineId(int orderlineId) {
        this.orderlineId = orderlineId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
