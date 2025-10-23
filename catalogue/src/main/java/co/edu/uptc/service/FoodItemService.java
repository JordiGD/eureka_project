package co.edu.uptc.service;

import co.edu.uptc.dto.FoodItemDTO;
import co.edu.uptc.entity.FoodItem;
import co.edu.uptc.mapper.FoodItemMapper;
import co.edu.uptc.repo.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodItemService {
    
    @Autowired
    FoodItemRepo foodItemRepo;

    public FoodItemDTO saveFoodItemDTO(FoodItemDTO foodItemDTO) {
        FoodItem foodItem = foodItemRepo.save(FoodItemMapper.INSTANCE.mapFromFoodItemDTOToEntity(foodItemDTO));
        return FoodItemMapper.INSTANCE.mapFromEntityToFoodItemDTO(foodItem);
    }

    public List<FoodItemDTO> listAllFoodItems() {
        List<FoodItem> listFoodItems = foodItemRepo.findAll();
        return listFoodItems.stream().map(FoodItemMapper.INSTANCE::mapFromEntityToFoodItemDTO).collect(Collectors.toList());
    }

    public List<FoodItemDTO> findByIds(List<Long> ids) {
        List<FoodItem> foodItems = foodItemRepo.findAllById(ids);
        return foodItems.stream().map(FoodItemMapper.INSTANCE::mapFromEntityToFoodItemDTO).collect(Collectors.toList());
    }
}
