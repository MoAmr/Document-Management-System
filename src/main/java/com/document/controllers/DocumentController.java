package com.document.controllers;

import com.document.entities.Document;
import com.document.repos.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class DocumentController {

    @Autowired
    private DocumentRepository documentRepo;

    @RequestMapping("/displayUpload")
    public String displayUpload() {
        return "documentUpload";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadDocument(@RequestParam("document") MultipartFile multipartFile, @RequestParam("id") Long id) {
        Document document = new Document();
        document.setId(id);
        document.setName(multipartFile.getName());
        try {
            document.setData(multipartFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        documentRepo.save(document);
        return "documentUpload";
    }
}
