package org.fasttrackkit;

import java.time.LocalDateTime;

public class Food {

  private String name;
  private double price;
  private double quantity;
  LocalDateTime expirydate;

    Food (String name1){
      name = name1;
    }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public LocalDateTime getExpirydate() {
    return expirydate;
  }

  public void setExpirydate(LocalDateTime expirydate) {
    this.expirydate = expirydate;
  }
}
