package co.edu.uptc.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDTO {
    private Long id;
    private String name;
    private String itemDescription;
    private boolean isVeg;
    private Double price;
    private Long restaurantId;
    private Integer quantity;
}
