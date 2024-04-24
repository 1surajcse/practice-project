package com.mobiquity.controller;

import com.mobiquity.exception.APIException;
import com.mobiquity.packer.Packer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class PackageController {

    @Autowired
    private Packer packer;
    @GetMapping("/api")
    public String getData() throws APIException, IOException {
       String result = packer.pack("src/main/resources/example_input");
        System.out.println(result);
        return result;
    }
}
