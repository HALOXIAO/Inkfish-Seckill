package com.inkfish.seckill.model.param;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

/**
 * @author HALOXIAO
 **/
public class productParam {

    @NotEmpty
    private String name;

    @NotEmpty
    private String title;

    @NotEmpty
    private String image;

    @NotEmpty
    private String detail;

    @NotEmpty
    private BigDecimal price;

    @NotEmpty
    private Integer stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "productParam{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
