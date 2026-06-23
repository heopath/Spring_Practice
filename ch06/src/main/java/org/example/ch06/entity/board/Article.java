package org.example.ch06.entity.board;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "boared_Article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private int ano;

    private String title;

    private String writer;

    private String content;

    private int file;

    @CreationTimestamp // 해당 엔티티가 INSERT 될때 현재날짜 생성
    private LocalDateTime wdate;

}
