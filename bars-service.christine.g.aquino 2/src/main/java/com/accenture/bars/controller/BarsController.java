package com.accenture.bars.controller;

import com.accenture.bars.domain.Record;
import com.accenture.bars.domain.Request;
import com.accenture.bars.exception.BarsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;
import java.io.File;

@Controller
public class BarsController {


    private static final Logger log = LoggerFactory.getLogger(BarsController.class);
    private FileProcessor fileProcessor;

    @Autowired public BarsController (FileProcessor fileProcessor){
        this.fileProcessor = fileProcessor;
    }

    @GetMapping("/bars")
    public List<Record> requestBilling(@RequestParam("filePath") String fileName) throws BarsException, IOException {

            File file = new File("\\Users\\christine.q.aquino\\Downloads\\BARS Service Materials v3.0\\BARS_TEST");
            final List<Request> requests = fileProcessor.execute(file);
            List<Record> records = fileProcessor.retrieveRecordfromDB(requests);

          //  fileProcessor.writeOutput(records);
                return records;
            }
        }


