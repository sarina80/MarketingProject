package model;

import java.util.ArrayList;

public class Product {
    private String productId;
    private Processes processes;
    private String Name;
    private String brandOrCompany;
    private double cast;
    private Customer customer;
    private Category category;
    private String description;
    private double averageScore;
    private ArrayList<Comment> comments;
    private InventoryStatus inventoryStatus;

    public Product(String productId, String name, String brandOrCompany, double cast, Category category, String explanation) {
        this.productId = productId;
        Name = name;
        this.brandOrCompany = brandOrCompany;
        this.cast = cast;
        this.category = category;
        this.description = explanation;
    }

    public void setProcesses(Processes processes) {
        this.processes = processes;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBrandOrCompany(String brandOrCompany) {
        this.brandOrCompany = brandOrCompany;
    }

    public void setCast(double cast) {
        this.cast = cast;
    }

    public void setCustomer(Customer buyer) {
        this.customer = buyer;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public void setInventoryStatus(InventoryStatus inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public Processes getProcesses() {
        return processes;
    }

    public String getName() {
        return Name;
    }

    public String getBrandOrCompany() {
        return brandOrCompany;
    }

    public double getCast() {
        return cast;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public InventoryStatus getInventoryStatus() {
        return inventoryStatus;
    }
}
