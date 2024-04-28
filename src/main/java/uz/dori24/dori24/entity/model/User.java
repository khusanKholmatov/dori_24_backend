package uz.dori24.dori24.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.dori24.dori24.enums.PillType;
import uz.dori24.dori24.enums.UserType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String telegramChatId;
    private UserType type;

}
