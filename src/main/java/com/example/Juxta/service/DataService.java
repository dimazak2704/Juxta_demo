package com.example.Juxta.service;

import com.example.Juxta.model.DataRun;
import com.example.Juxta.model.DataSubmit;
import com.example.Juxta.model.Data;
import com.example.Juxta.model.Status;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    public List<DataRun> dataForRunChecking (Data dataBeforeChecking) {
        System.out.println("\nHello from DataAfterRunChecking:\n" + dataBeforeChecking);

        // Data -> DataRun

        DataRun data = new DataRun("*output*", 1, 1, 1, Status.Ok);

        List<DataRun> list = new ArrayList<>();
        list.add(data);
        return list;
    }
    public List<DataSubmit> dataForSubmitChecking (Data dataBeforeChecking) {
        System.out.println("\nHello from DataAfterSubmitChecking:\n" + dataBeforeChecking);

        // Data -> DataSubmit

        DataSubmit data = new DataSubmit(1, 1, Status.Ok);

        List<DataSubmit> list = new ArrayList<>();
        list.add(data);
        return list;
    }
}
