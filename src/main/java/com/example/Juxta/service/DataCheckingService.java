package com.example.Juxta.service;

import com.example.Juxta.model.DataAfterRunChecking;
import com.example.Juxta.model.DataAfterSubmitChecking;
import com.example.Juxta.model.DataBeforeChecking;
import com.example.Juxta.model.Status;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DataCheckingService {
    public List<DataAfterRunChecking> dataForRunChecking (DataBeforeChecking dataBeforeChecking) {
        System.out.println("\nHello from DataAfterRunChecking:\n" + dataBeforeChecking);

        // dataBeforeChecking -> DataAfterRunChecking

        DataAfterRunChecking data = new DataAfterRunChecking(Status.Ok,"123", 1, 1);

        List<DataAfterRunChecking> list = new ArrayList<DataAfterRunChecking>();
        list.add(data);
        return list;
    }
    public List<DataAfterSubmitChecking> dataForSubmitChecking (DataBeforeChecking dataBeforeChecking) {
        System.out.println("\nHello from DataAfterSubmitChecking:\n" + dataBeforeChecking);

        // dataBeforeChecking -> DataAfterSubmitChecking

        DataAfterSubmitChecking data = new DataAfterSubmitChecking(1, Status.Ok, 1, 1);

        List<DataAfterSubmitChecking> list = new ArrayList<DataAfterSubmitChecking>();
        list.add(data);
        return list;
    }

    private List<DataAfterRunChecking> dataAfterRunCheckingList;

    {
        dataAfterRunCheckingList = new ArrayList<DataAfterRunChecking>();
        dataAfterRunCheckingList.add(new DataAfterRunChecking(Status.Ok, "print", 1, 1));
    }

    public void save(DataAfterRunChecking dataAfterRunChecking) {
        dataAfterRunChecking.setStatus(Status.Ok);
        dataAfterRunCheckingList.add(dataAfterRunChecking);
    }

    public List<DataAfterRunChecking> all() {
        return dataAfterRunCheckingList;
    }
}
