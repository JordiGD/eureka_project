package co.edu.uptc.mapper;

import co.edu.uptc.dto.FoodItemDTO;
import co.edu.uptc.entity.FoodItem;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-23T08:14:19-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251001-1143, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class FoodItemMapperImpl implements FoodItemMapper {

    @Override
    public FoodItem mapFromFoodItemDTOToEntity(FoodItemDTO foodItemDTO) {
        if ( foodItemDTO == null ) {
            return null;
        }

        FoodItem foodItem = new FoodItem();

        foodItem.setId( foodItemDTO.getId() );
        foodItem.setItemDescription( foodItemDTO.getItemDescription() );
        foodItem.setName( foodItemDTO.getName() );
        foodItem.setPrice( foodItemDTO.getPrice() );
        foodItem.setQuantity( foodItemDTO.getQuantity() );
        foodItem.setRestaurantId( foodItemDTO.getRestaurantId() );
        foodItem.setVeg( foodItemDTO.isVeg() );

        return foodItem;
    }

    @Override
    public FoodItemDTO mapFromEntityToFoodItemDTO(FoodItem foodItem) {
        if ( foodItem == null ) {
            return null;
        }

        FoodItemDTO foodItemDTO = new FoodItemDTO();

        foodItemDTO.setId( foodItem.getId() );
        foodItemDTO.setItemDescription( foodItem.getItemDescription() );
        foodItemDTO.setName( foodItem.getName() );
        foodItemDTO.setPrice( foodItem.getPrice() );
        foodItemDTO.setQuantity( foodItem.getQuantity() );
        foodItemDTO.setRestaurantId( foodItem.getRestaurantId() );
        foodItemDTO.setVeg( foodItem.isVeg() );

        return foodItemDTO;
    }
}
