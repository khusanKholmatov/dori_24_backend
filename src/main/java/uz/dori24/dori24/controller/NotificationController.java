package uz.dori24.dori24.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.dori24.dori24.entity.request.UserPillNotificationCreateRequest;
import uz.dori24.dori24.entity.response.NotificationResponse;
import uz.dori24.dori24.service.NotificationService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/add")
    public ResponseEntity<Long> addUserPillNotification(
            @RequestBody UserPillNotificationCreateRequest request
    ) {
        log.info("[POST] call to /notification/add with request body {}", request.toString());
        var res = notificationService.addUserPillNotification(request);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotificationResponse> getNotificationById(
            @PathVariable(name = "id") Long notificationId
    ) {
        log.info("[GET] call to /notification/{id} with path variable {}", notificationId);
        var res = notificationService.getNotificationById(notificationId);
        return ResponseEntity.ok(res);
    }

}
