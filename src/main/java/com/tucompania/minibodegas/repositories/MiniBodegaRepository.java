package main.java.com.tucompania.minibodegas.repositories;

import com.tucompania.minibodegas.models.MiniBodega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MiniBodegaRepository extends JpaRepository<MiniBodega, Long> {
}
