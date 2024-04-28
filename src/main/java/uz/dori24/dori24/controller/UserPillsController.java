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
    ) {
        var res = userPillService.getUserPill(1L);
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
        var res = userPillService.addUserPill(request);
        return ResponseEntity.ok(res);
    }

    @PutMapping("/take-pill/{id}")
    public ResponseEntity<Boolean> takePill(
            @PathVariable(name = "id") Long id
    ) {
        var res = userPillService.takePill(id);
        return ResponseEntity.ok(res);
    }
}
