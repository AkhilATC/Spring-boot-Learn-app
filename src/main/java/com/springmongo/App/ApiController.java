package com.springmongo.App;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
public class ApiController {
    @Autowired
    private DataRespository dataRespository;
    @Autowired
    private GridFsTemplate template;

    @Autowired
    private GridFsOperations operations;

    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping("/")
    public String getInfo(){
        Optional<DetailInfo> record = dataRespository.findById("627036a7f84c0b24ccb995f7");
        System.out.println(record);
        return record.toString();
    }

    @GetMapping("/save")
    public String writeInfo(){
//        dataRespository.save()
        DetailInfo d = new DetailInfo(
                "Alicia",
                12,
                "Queen of Vikia \uD83D\uDC78"
        );

        DetailInfo resp = dataRespository.insert(d);
        return "null";

    }
    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) throws IOException {
        return new ResponseEntity<>(fileUploadService.addFile(file), HttpStatus.OK);
    }

}
