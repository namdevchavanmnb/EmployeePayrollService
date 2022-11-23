package com.bridgelabz;

import com.mysql.cj.protocol.PacketReceivedTimeHolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileIOServiceImpl implements SreviceType {
final String FILE_PATH = "F:\\EmployeePayrollService\\src\\main\\java\\com\\bridgelabz\\employee.txt";
    @Override
    public void writeData(List<Employee> employeeList) throws IOException {

            StringBuffer stringBuffer=new StringBuffer();
            employeeList.forEach(employee -> {
                String employeeString=employee.toString().concat("\n");
                stringBuffer.append(employeeString);
            });
            Files.write(Path.of(FILE_PATH),stringBuffer.toString().getBytes());
        }


    @Override
    public void readData() throws IOException {
        Files.lines(Path.of(FILE_PATH)).forEach(employee->{
            System.out.println(employee);
        });
    }



    @Override
    public long countEntries() throws IOException {
        return Files.lines(Path.of(FILE_PATH)).count();


        }
}
