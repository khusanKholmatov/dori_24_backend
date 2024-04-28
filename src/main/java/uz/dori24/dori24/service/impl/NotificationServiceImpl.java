package uz.dori24.dori24.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.dori24.dori24.repository.NotificationRepository;
import uz.dori24.dori24.service.NotificationService;

@Service
@RequestMapping
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

}
