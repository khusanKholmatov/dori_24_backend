package uz.dori24.dori24.repository;

import org.apache.ibatis.annotations.Mapper;
import uz.dori24.dori24.entity.request.CareGiverAddRequest;

import java.util.Optional;

@Mapper
public interface UserRepository {
    Optional<String> getCareGiverChatId(Long patientId);

    void setCareGiverChatId(CareGiverAddRequest request);
}
