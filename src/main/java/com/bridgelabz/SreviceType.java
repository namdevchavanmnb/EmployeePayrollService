package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public interface SreviceType {
    void writeData(List<Employee> employeeList) throws IOException;

    void readData() throws IOException;

    long countEntries() throws IOException;

}
