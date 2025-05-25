package br.com.javadeveloper.dslist.service;

import br.com.javadeveloper.dslist.dto.GameListDTO;
import br.com.javadeveloper.dslist.entities.GameList;
import br.com.javadeveloper.dslist.repositories.GameListRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
