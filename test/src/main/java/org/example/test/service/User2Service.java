package org.example.test.service;

import lombok.RequiredArgsConstructor;
import org.example.test.dao.User2DAO;
import org.example.test.dto.User2DTO;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User2Service {
    private final User2DAO dao;

    public void register(User2DTO dto){
        dao.insert(dto);
    }

    public User2DTO getById(String userid){
        return dao.select(userid);
    }

    public List<User2DTO> getAll(){
        return dao.selectAll();
    }

    public void modify(User2DTO dto){
        dao.update(dto);
    }

    public void remove(String userid){
        dao.delete(userid);
    }
}