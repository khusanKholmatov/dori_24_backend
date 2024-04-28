package uz.dori24.dori24.entity.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.dori24.dori24.enums.PillType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPillResponse {

    private Long id;
    private Long userId;
    private String pillName;
    private PillType pillType;
    private Long count;
    private Long refillCount;
    private String startTime;
    private Long interval;

}
