package com.example.Juxta.service;

import com.example.Juxta.model.DataRun;
import com.example.Juxta.model.DataSubmit;
import com.example.Juxta.model.Status;
import jakarta.xml.bind.DatatypeConverter;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class DataService {

    public List<DataRun> dataForRunChecking (String code, String input) {
        System.out.println("\n->  Hello from DataAfterRunChecking:\nCode:\n" + code + "\nInput:\n" + input + "\n");

        // code.encodeIn64() + input.encodeIn64() -> DataRun

        DataRun data = new DataRun("*output*", 1, 1, 1, Status.Ok);

        List<DataRun> list = new ArrayList<>();
        list.add(data);
        return list;
    }


    public List<DataSubmit> dataForSubmitChecking (String code) {
        System.out.println("\n->  Hello from DataAfterRunChecking:\nCode:\n" + code + "\n");

        // code.encodeIn64() -> DataSubmit

        DataSubmit data = new DataSubmit(1, 1, Status.Ok);

        List<DataSubmit> list = new ArrayList<>();
        list.add(data);
        return list;
    }

    private static String encodeIn64 (String str) {
        return Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
    }

    private static String decodeFrom64 (String str) {
        return new String(DatatypeConverter.parseBase64Binary(str));
    }
}
