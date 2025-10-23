package co.edu.uptc.mapper;

import co.edu.uptc.dto.FoodItemDTO;
import co.edu.uptc.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodItemMapper {
    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFromFoodItemDTOToEntity(FoodItemDTO foodItemDTO);
    FoodItemDTO mapFromEntityToFoodItemDTO(FoodItem foodItem);
}
