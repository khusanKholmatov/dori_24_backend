package uz.dori24.dori24.entity.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.dori24.dori24.enums.PillType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPillCreateRequest {

    @JsonIgnore
    private Long id;
    @NotNull
    @Positive
    private Long userId;
    @NotNull
    @NotBlank
    private String pillName;
    @NotNull
    @NotBlank
    private String startTime;
    @NotNull
    private PillType pillType;
    @Positive
    private Long interval;
    @Positive
    private Long count;
    @Positive
    private Long refillCount;

}
