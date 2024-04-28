package uz.dori24.dori24.entity.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPillRequest {

    @NotNull
    @Positive
    private Long userId;
    @NotNull
    private String pillName;
    @Positive
    private Long count;
    @Positive
    private Long refillCount;

}
