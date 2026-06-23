package org.example.ch06.dto.board;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "boared_File")
public class FileDTO {

    private int fno;
    private int ano;
    private String fName;
    private String ofName;

}
