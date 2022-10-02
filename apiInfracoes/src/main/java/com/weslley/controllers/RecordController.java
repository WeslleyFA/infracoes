package com.weslley.controllers;

import com.weslley.entities.Record;
import com.weslley.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/record")
@CrossOrigin("*")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping
    public ResponseEntity<Record> save(@RequestBody Record record){
        Record novoRecord = recordService.save(record);
        return ResponseEntity.ok().body(novoRecord);
    }

    @GetMapping
    public ResponseEntity<List<Record>> getAll(){
        List<Record> records = recordService.getAll();
        return ResponseEntity.ok().body(records);

    }
}
