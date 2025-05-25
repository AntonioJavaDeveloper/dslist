package br.com.javadeveloper.dslist.repositories;

import br.com.javadeveloper.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}