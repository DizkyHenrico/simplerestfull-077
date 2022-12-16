/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project04.project04;

/**
 *
 * @author User
 */
public class Product {
  private String id;
  private String name;
  private Integer price;
  private Integer number;
  private Integer total;
  
          
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = price * number;
    }
    




}
