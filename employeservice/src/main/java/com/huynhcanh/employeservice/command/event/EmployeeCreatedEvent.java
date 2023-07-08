package com.huynhcanh.employeservice.command.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeCreatedEvent {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String kin;
    private Boolean isDisciplined;
}
