package ru.biponline.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.biponline.demo.entity.objectEntity;
import ru.biponline.demo.response.BaseResponse;
import ru.biponline.demo.response.objectListResponse;
import ru.biponline.demo.service.objectService;

import javax.validation.executable.ValidateOnExecution;

@RestController
@RequestMapping("api/v1/object")

public class objectController {
    private objectService service;

    @GetMapping("/all")
    public ResponseEntity<objectListResponse> getAll() {
        return ResponseEntity.ok(new objectListResponse(service.getAll()));
    }


    @ValidateOnExecution
    @PostMapping("/add")
    public ResponseEntity<BaseResponse> add(@RequestBody objectEntity data) {
        try {
            service.save(data);
            return ResponseEntity.ok(new BaseResponse(true, "Квартира добавлена"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }


    @PostMapping("/update")
    public ResponseEntity<BaseResponse> update(@RequestBody objectEntity data) {
        try {
            service.save(data);
            return ResponseEntity.ok(new BaseResponse(true, "В квартиру была внесена информация"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }


    @DeleteMapping("/delete")
    public ResponseEntity<BaseResponse> delete(@RequestParam Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(new BaseResponse(true, "Квартира удалена"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }

    @GetMapping()
    public ResponseEntity<BaseResponse> getSale(@RequestParam String name) {
        return ResponseEntity.ok(new objectListResponse(service.getName(name)));
    }
}