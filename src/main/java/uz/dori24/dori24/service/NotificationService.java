package uz.dori24.dori24.service;

import uz.dori24.dori24.entity.request.UserPillNotificationCreateRequest;
import uz.dori24.dori24.entity.response.NotificationResponse;

public interface NotificationService {
    Long addUserPillNotification(UserPillNotificationCreateRequest request);

    NotificationResponse getNotificationById(Long notificationId);
}
