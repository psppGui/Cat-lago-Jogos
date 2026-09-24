package br.com.guilherme.app.catalagojogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.guilherme.app.catalagojogos.model.Catalago;

public interface CatalagoRepository extends JpaRepository<Catalago, Long> {
        List<Catalago> findByTitulo(String titulo);

}