package uz.dori24.dori24.repository;

import org.apache.ibatis.annotations.Mapper;
import uz.dori24.dori24.entity.request.UserPillCreateRequest;
import uz.dori24.dori24.entity.request.UserPillRequest;
import uz.dori24.dori24.entity.response.UserPillResponse;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserPillRepository {
    List<UserPillResponse> getAllUserPills(Long staticUserId);

    Optional<UserPillResponse> getUserPill(Long id);

    void deleteUserPill(Long id);

    void addUserPill(UserPillCreateRequest request);

    void takePill(Long id);
}
