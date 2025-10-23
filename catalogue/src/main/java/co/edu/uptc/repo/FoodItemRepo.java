package co.edu.uptc.repo;

import co.edu.uptc.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItem,Long> {
}
