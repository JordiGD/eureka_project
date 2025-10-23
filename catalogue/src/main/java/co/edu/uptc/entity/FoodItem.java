package co.edu.uptc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String itemDescription;
    private boolean isVeg;
    private Double price;
    private Long restaurantId;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer quantity;
}
