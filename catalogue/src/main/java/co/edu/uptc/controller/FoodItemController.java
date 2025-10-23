package co.edu.uptc.controller;

import co.edu.uptc.dto.FoodItemDTO;
import co.edu.uptc.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foodItem")
public class FoodItemController {
    
    @Autowired
    FoodItemService foodItemService;

    @PostMapping("/save")
    public ResponseEntity<FoodItemDTO> saveFoodItem(@RequestBody FoodItemDTO foodItemDTO) {
        FoodItemDTO item = foodItemService.saveFoodItemDTO(foodItemDTO);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @GetMapping("/listFood")
    public ResponseEntity<List<FoodItemDTO>> findAllFoodItems() {
        List<FoodItemDTO> listDto = foodItemService.listAllFoodItems();
        return new ResponseEntity<>(listDto,  HttpStatus.OK);
    }

    @GetMapping("/fetchByIds")
    public ResponseEntity<List<FoodItemDTO>> findFoodItemsByIds(@RequestParam List<Long> ids) {
        List<FoodItemDTO> items = foodItemService.findByIds(ids);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

}
