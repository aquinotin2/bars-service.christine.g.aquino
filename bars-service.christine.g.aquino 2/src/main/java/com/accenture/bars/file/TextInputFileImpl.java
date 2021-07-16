package com.accenture.bars.file;


import com.accenture.bars.domain.Request;
import com.accenture.bars.exception.BarsException;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TextInputFileImpl extends AbstractInputFile{

    private static final Logger log = null;
    public TextInputFileImpl() {

    }
    @Override
    public List<Request> readFile() throws IOException, BarsException {
        List<Request> request = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");

        int billingCycle;
        LocalDate startDate;
        LocalDate endDate;

        BufferedReader br=new BufferedReader(fileReader);
        br.readLine();

        String line
        String[] data = line.split(".");

        billingCycle = Integer.parseInt(data[use_billing_cycle_index]);
//
//        check if billing cycle ranges from 1 - 12
//        if true then add to request list.
        if (billingCycle => 12) {
            billingCycle.add(new List<Request>());
        }
//                otherwise throw validation message
//                // validate start date - use try catch
//                startDate = LocalDate.parse(data[use start date index], formatter);
//        search for parse method so you would know its usage
//        // validate end date - use try catch
//        endDate = LocalDate.parse(data[use end date index], formatter);
//        add the requests to array list created previously


        return requests;
    }

}
