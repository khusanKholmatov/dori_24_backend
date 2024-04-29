package uz.dori24.dori24.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.dori24.dori24.entity.request.UserPillCreateRequest;
import uz.dori24.dori24.entity.response.UserPillResponse;
import uz.dori24.dori24.service.UserPillService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user-pill")
@RequiredArgsConstructor
public class UserPillsController {

    private final UserPillService userPillService;

    @GetMapping("/all")
    public ResponseEntity<List<UserPillResponse>> getAllUserPills(
            @RequestParam("user_id") Long userId
    ) {
        log.info("[GET] request call to user-pill/all");
        var res = userPillService.getAllUserPills(userId);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserPillResponse> getUserPill(
            @PathVariable(name = "id") Long pillId
    ) {
        var res = userPillService.getUserPill(pillId);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/notification/{id}")
    public ResponseEntity<UserPillResponse> getUserPillByNotificationId(
            @PathVariable(name = "id") Long notificationId
    ) {
        var res = userPillService.getUserPillByNotificationId(notificationId);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteUserPill(
            @PathVariable(name = "id") Long id
    ) {
        var res = userPillService.deleteUserPill(id);
        return ResponseEntity.ok(res);
    }

    @PostMapping("/add")
    public ResponseEntity<Long> addUserPill(
            @RequestBody UserPillCreateRequest request
    ) {
        log.info("[POST] call to /user-pill/add with request body {}", request.toString());
        var res = userPillService.addUserPill(request);
        return ResponseEntity.ok(res);
    }

    @PutMapping("/take-pill/{id}")
    public ResponseEntity<UserPillResponse> takePill(
            @PathVariable(name = "id") Long notificationId
    ) {
        var res = userPillService.takePill(notificationId);
        return ResponseEntity.ok(res);
    }
}
