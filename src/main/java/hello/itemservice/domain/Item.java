package hello.itemservice.domain;

import lombok.Data;

@Data
public class Item { //상품 자체를 나타내는 객체

    private Long id;

    private String itemName; //이름
    private Integer price;  //가격
    private Integer quantity; //수량

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
