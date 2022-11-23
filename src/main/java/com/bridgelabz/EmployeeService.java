package com.bridgelabz;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {


    private final List<Employee> employeelist;

    public EmployeeService(List<Employee> employeeList) {
        this.employeelist = employeeList;

    }

    public void writeEmployeeData(IOService ioType) throws IOException {
        SreviceType sreviceType;
        if (IOService.FILE_IO.equals(ioType)) {
            sreviceType = new FileIOServiceImpl();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            sreviceType = new ConsoleIOServiceImpl();


        } else {
            sreviceType = new DatabaseIOServiceImpl();
        }
        sreviceType.writeData(employeelist);
    }


    public void readEmployeeData(IOService ioType) throws IOException {
        SreviceType sreviceType;
        if (IOService.FILE_IO.equals(ioType)) {
            sreviceType = new FileIOServiceImpl();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            sreviceType = new ConsoleIOServiceImpl();


        } else {
            sreviceType = new DatabaseIOServiceImpl();
        }
        sreviceType.readData();
    }

    public long countEmployeeEntries(IOService ioType) throws IOException {
        SreviceType sreviceType;
        if (IOService.FILE_IO.equals(ioType)) {
            sreviceType = new FileIOServiceImpl();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            sreviceType = new ConsoleIOServiceImpl();


        } else {
            sreviceType = new DatabaseIOServiceImpl();
        }
        return sreviceType.countEntries();
    }
}


















