package ecommerce.fip.ecommerce.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryDto {
    @NotBlank
    private String name;
    @NotBlank
    private String description;
}

