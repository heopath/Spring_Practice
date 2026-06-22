package org.example.ch06.service;

import lombok.RequiredArgsConstructor;
import org.example.ch06.dto.User1DTO;
import org.example.ch06.entity.User1;
import org.example.ch06.repository.User1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User1Service {

    // @RequiredArgsConstructor 어노테이션으로 생성자 주입
    private final User1Repository repository;

    // 기본 서비스 메서드
    public void register(User1DTO dto){

        // DTO를 Entity 변환
        User1 entity = dto.toEntity();

        // JPA save() 메서드 호출, Entity가 데이터베이스에 INSERT
        repository.save(entity);
    }

    public User1DTO getUser(String userid){
        return null;
    }

    public List<User1DTO> getUserAll(){

        // JPA 조회 메서드 호출, SELECT * FROM User1
        List<User1> entityList = repository.findAll();

        // DTO 리스트 변환
        List<User1DTO> dtoList = entityList.stream()
                .map(entity -> entity.toDTO())
                .toList();

        return dtoList;
    }

    public void modify(User1DTO dto){

    }

    public void remove(String userid){

    }


}