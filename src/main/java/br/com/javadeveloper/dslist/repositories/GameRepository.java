package br.com.javadeveloper.dslist.repositories;

import br.com.javadeveloper.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
