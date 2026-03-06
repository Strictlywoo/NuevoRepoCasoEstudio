package salonBelleza.com.repository;

import salonBelleza.com.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<
        Categoria, Integer> {
}
