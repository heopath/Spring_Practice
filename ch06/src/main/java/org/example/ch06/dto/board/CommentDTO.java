package org.example.ch06.dto.board;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "boared_Comment")
public class CommentDTO {

    private int ano;
    private int parent;
    private String content;
    private String wdate;
}
