package ecommerce.fip.ecommerce.repositores;

import ecommerce.fip.ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    Optional<Category> findById(UUID id);
    void delete(Category category);
    List<Category> findByActiveTrue();
}