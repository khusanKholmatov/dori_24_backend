package uz.dori24.dori24.repository;

import org.apache.ibatis.annotations.Mapper;
import uz.dori24.dori24.entity.request.UserPillNotificationCreateRequest;
import uz.dori24.dori24.entity.response.NotificationResponse;

@Mapper
public interface NotificationRepository {
    void addUserPillNotification(UserPillNotificationCreateRequest request);

    void deleteNotificationsByUserPillId(Long id);

    NotificationResponse getNotificationById(Long notificationId);
}
