package org.example.ch06.repository;


import org.example.ch06.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository는 JPA에서 데이터 엑세스 객체(DAO)
@Repository
public interface User1Repository extends JpaRepository<User1, String> {
    // JpaRepository<T, ID> : 사용하는 엔티티와 해당 엔티티의 @ID 컬럼 속성 타입





}