package com.weslley.service;

import com.weslley.entities.Record;
import com.weslley.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    public Record save(Record record){
        record.setData(Instant.now());
        return repository.save(record);
    }

    public List<Record> getAll(){
        return repository.findAll();
    }
}
