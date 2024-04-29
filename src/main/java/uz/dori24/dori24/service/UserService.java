package uz.dori24.dori24.service;

import uz.dori24.dori24.entity.request.CareGiverAddRequest;

public interface UserService {
    String getCareGiverChatId(Long patientId);

    Boolean setCareGiverChatId(CareGiverAddRequest request);
}
