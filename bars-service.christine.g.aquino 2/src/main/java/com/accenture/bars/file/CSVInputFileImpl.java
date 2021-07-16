package com.accenture.bars.file;

import com.accenture.bars.domain.Request;
import com.accenture.bars.exception.BarsException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.accenture.bars.exception.BarsException.BILLING_CYCLE_NOT_IN_RANGE;
import static com.accenture.bars.exception.BarsException.INVALID_BILLING_CYCLE;

public class CSVInputFileImpl extends AbstractInputFile {

    public CSVInputFileImpl (){
    }
}
@Override
    public List<Request> readFile() throws IOException, BarsException {
        List<Request> requests = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        FileReader fileReader = new FileReader("/Users/christine.q.aquino/Downloads/BARS Service Materials v3.0/BARS_TEST- valid-csv.csv");

        BufferedReader br =new BufferedReader(fileReader);
    Scanner scanner = new Scanner(System.in);
    br.readLine();

    try {
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] data = line.split(",");

            try {
                int billingCycle = Integer.parseInt(data[0]);
                if (billingCycle >= 1 || billingCycle <= 12) {
                }

            }
            catch (BarsException e) {
                throw new BarsException(BILLING_CYCLE_NOT_IN_RANGE);
            }
                catch (BarsException e) {
                    throw new BarsException(INVALID_BILLING_CYCLE);
                }
        }
    

        try {

            String line = scanner.nextLine();
            String[] data =


    int billingCycle;
    String startDate = startDate;
    String endDate = endDate;
    boolean isValid = false;

    try {
        while (scanner.hasNextLine()) {

            String data = scanner.nextLine();
            String[] split = data.split(",");

            if (isValid) {

            if (split =>12){

            split =    requests.add(new Request(billingCycle, startDate, endDate));

            }
        }
        catch (){



        }
    }



    return requests;
    }

}
