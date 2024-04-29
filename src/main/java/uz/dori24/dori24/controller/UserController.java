package uz.dori24.dori24.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.dori24.dori24.entity.request.CareGiverAddRequest;
import uz.dori24.dori24.service.UserService;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/caregiver/{patient_id}")
    private ResponseEntity<String> getCareGiverChatId(
            @PathVariable(name = "patient_id") Long patientId
    ) {
        log.info("[GET] call to /caregiver/{id} with path variable {}", patientId);
        var res = userService.getCareGiverChatId(patientId);
        return ResponseEntity.ok(res);
    }

    @PutMapping("/caregiver/add")
    public ResponseEntity<Boolean> setCareGiverChatId(
        @RequestBody CareGiverAddRequest request
    ) {
        log.info("[GET] call to /caregiver/add with path variable {}", request.toString());
        var res = userService.setCareGiverChatId(request);
        return ResponseEntity.ok(res);
    }

}
