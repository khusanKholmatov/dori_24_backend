package uz.dori24.dori24.entity.request;

import jakarta.validation.constraints.NotBlank;
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
public class CareGiverAddRequest {

    @NotNull
    @Positive
    private Long userId;
    @NotNull
    @NotBlank
    private String chatId;

}
