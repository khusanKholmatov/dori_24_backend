package uz.dori24.dori24.service;

import uz.dori24.dori24.entity.request.UserPillCreateRequest;
import uz.dori24.dori24.entity.request.UserPillRequest;
import uz.dori24.dori24.entity.response.UserPillResponse;

import java.util.List;

public interface UserPillService {
    List<UserPillResponse> getAllUserPills(Long userId);

    UserPillResponse getUserPill(Long id);

    Boolean deleteUserPill(Long id);

    Long addUserPill(UserPillCreateRequest request);

    Boolean takePill(Long id);
}
