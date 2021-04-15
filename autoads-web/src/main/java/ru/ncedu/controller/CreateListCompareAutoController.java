package ru.ncedu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ncedu.entity.CompareAuto;
import ru.ncedu.model.DataAuto;
import ru.ncedu.service.CreateListCompareAutoService;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/auth")
public class CreateListCompareAutoController {

    private final CreateListCompareAutoService createListCompareAutoService;

    @PostMapping(path = "/add-auto-to-compare")
    public ResponseEntity<CompareAuto> addAutoToCompare(@RequestBody DataAuto dataAuto) {
        CompareAuto compareAuto = createListCompareAutoService.addAutoToListCompare(dataAuto);
        return new ResponseEntity<CompareAuto>(HttpStatus.CREATED);
    }
}
