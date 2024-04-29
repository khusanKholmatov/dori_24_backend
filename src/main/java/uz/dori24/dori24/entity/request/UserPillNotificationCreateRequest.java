package uz.dori24.dori24.entity.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class UserPillNotificationCreateRequest {

    @JsonIgnore
    private Long notificationId;
    @NotNull
    @NotBlank
    private String payload;
    @NotNull
    @NotBlank
    private String body;
    @NotNull
    @NotBlank
    private String title;
    @NotNull
    @Positive
    private Long userPillId;

}
