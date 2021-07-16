package com.accenture.bars.file;

        import com.accenture.bars.domain.Request;
        import com.accenture.bars.exception.BarsException;

        import java.io.IOException;
        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.logging.Logger;

public class CSVInputFileImpl {

    private static final Logger log = null;
    public CSVInputFileImpl() {


        @Override
        public List<Request> readFile() throws IOException, BarsException {
            List<Request> requests = new ArrayList<>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

            int billingCycle;
            LocalDate startTime;
            LocalDate endDate;

            return requests;

        }

    }