package uz.dori24.dori24.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.dori24.dori24.entity.request.UserPillNotificationCreateRequest;
import uz.dori24.dori24.entity.response.NotificationResponse;
import uz.dori24.dori24.repository.NotificationRepository;
import uz.dori24.dori24.service.NotificationService;

@Service
@RequestMapping
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    @Override
    public Long addUserPillNotification(UserPillNotificationCreateRequest request) {
        notificationRepository.addUserPillNotification(request);
        return request.getNotificationId();
    }

    @Override
    public NotificationResponse getNotificationById(Long notificationId) {
        return notificationRepository.getNotificationById(notificationId);
    }
}
