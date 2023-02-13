package com.hazemuh.baseTemplate.service;
import com.hazemuh.baseTemplate.dto.TestingDto;
import com.hazemuh.baseTemplate.repository.TestingClassRepository;
import com.hazemuh.baseTemplate.utility.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestService {
   @Autowired
   private TestingClassRepository testingClassRepository;


    public ResponseEntity getDataTesting() {
        Map<String, Object> result = new HashMap<>();
        MessageModel msg = new MessageModel();
        try {

            List<TestingDto> data= testingClassRepository.getDataTesting();

            if (data.isEmpty()) {
                msg.setStatus(true);
                msg.setMessage("Data tidak ditemukan");
                msg.setData(null);
                return ResponseEntity.ok().body(msg);
            } else {
                msg.setStatus(true);
                msg.setMessage("Success");
                result.put("data", data);
                msg.setData(result);
                return ResponseEntity.ok().body(msg);
            }

        }catch (Exception e){
            msg.setStatus(false);
            msg.setMessage(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }

}
