package org.example.ch06.dto.board;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FileDTO {

    private int fno;

    private int ano; // 해당파일이 첨부된 글번호

    private String ofName;
    private String sfName;


}












