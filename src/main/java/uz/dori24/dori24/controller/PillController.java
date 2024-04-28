package uz.dori24.dori24.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.dori24.dori24.service.PillService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pills")
public class PillController {

    private final PillService pillService;

    @GetMapping
    public String message() {
        return "Hello world";
    }

}
