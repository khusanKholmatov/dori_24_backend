package uz.dori24.dori24.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.dori24.dori24.enums.PillType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pill {

    private Long id;
    private String name;
    private PillType type;

}
