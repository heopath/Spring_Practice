package org.example.ch03.DTO;

import lombok.*;

//@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Builder
public class UserDTO {
    private String userid;
    private String name;
    private String birth;
    private int age;

}
