package com.example.demo.controller;

import com.example.demo.dto.TodoDto;
import com.example.demo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {
    final TodoService service;

    @GetMapping({ "/test" })
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("세아야 안녕 캬캬");
    }

    @GetMapping({ "", "/" })
    public ResponseEntity<List<TodoDto>> getList() {
        return ResponseEntity.ok(service.getList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping("")
    public ResponseEntity<TodoDto> create(@RequestBody TodoDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }



}
