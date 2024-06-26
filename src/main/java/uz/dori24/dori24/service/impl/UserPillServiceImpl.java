package uz.dori24.dori24.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.dori24.dori24.entity.request.UserPillCreateRequest;
import uz.dori24.dori24.entity.request.UserPillRequest;
import uz.dori24.dori24.entity.response.NotificationResponse;
import uz.dori24.dori24.entity.response.UserPillResponse;
import uz.dori24.dori24.exception.BadRequestException;
import uz.dori24.dori24.exception.NotFoundException;
import uz.dori24.dori24.repository.NotificationRepository;
import uz.dori24.dori24.repository.UserPillRepository;
import uz.dori24.dori24.service.UserPillService;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserPillServiceImpl implements UserPillService {

    private final UserPillRepository userPillRepository;
    private final NotificationRepository notificationRepository;

    @Override
    public List<UserPillResponse> getAllUserPills(Long userId) {
        long staticUserId = 1;
        return userPillRepository.getAllUserPills(staticUserId);
    }

    @Override
    public UserPillResponse getUserPill(Long pillId) {
        return userPillRepository.getUserPill(pillId)
                .orElseThrow(() -> new BadRequestException("User Pill not found"));
    }

    @Override
    public Boolean deleteUserPill(Long id) {
        notificationRepository.deleteNotificationsByUserPillId(id);
        userPillRepository.deleteUserPill(id);
        return Boolean.TRUE;
    }

    @Override
    public Long addUserPill(UserPillCreateRequest request) {
        userPillRepository.addUserPill(request);
        return request.getId();
    }

    @Override
    public UserPillResponse takePill(Long notificationId) {
        NotificationResponse response = notificationRepository.getNotificationById(notificationId);
        userPillRepository.takePill(response.getUserPillId());
        return userPillRepository.getUserPill(response.getUserPillId())
                .orElseThrow(() -> new NotFoundException("User Pill not found"));
    }

    @Override
    public UserPillResponse getUserPillByNotificationId(Long notificationId) {
        return userPillRepository.getUserPillByNotificationId(notificationId)
                .orElseThrow(() -> new BadRequestException("User Pill not found"));
    }
}
