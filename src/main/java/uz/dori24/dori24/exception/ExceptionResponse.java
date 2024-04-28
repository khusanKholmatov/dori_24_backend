package uz.dori24.dori24.exception;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ExceptionResponse {
    private String errorMessage;

    public ExceptionResponse(String message) {
        this.errorMessage = message;
    }
}
