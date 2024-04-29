package uz.dori24.dori24.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.dori24.dori24.entity.request.CareGiverAddRequest;
import uz.dori24.dori24.exception.BadRequestException;
import uz.dori24.dori24.repository.UserRepository;
import uz.dori24.dori24.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String getCareGiverChatId(Long patientId) {
        return userRepository.getCareGiverChatId(patientId)
                .orElseThrow(() -> new BadRequestException("Chat Id not found"));
    }

    @Override
    public Boolean setCareGiverChatId(CareGiverAddRequest request) {
        userRepository.setCareGiverChatId(request);
        return Boolean.TRUE;
    }
}
