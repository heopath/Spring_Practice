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
@Table(name = "boared_User")
public class User {
    @Id
    private int userid;
    private String name;
    private String birth;

    @CreationTimestamp
    private LocalDateTime rdate;
}
