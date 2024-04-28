package uz.dori24.dori24.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.dori24.dori24.repository.PillRepository;
import uz.dori24.dori24.service.PillService;

@Service
@RequiredArgsConstructor
public class PillServiceImpl implements PillService {

    private final PillRepository pillRepository;

}
