package com.huynhcanh.employeservice.command.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDeletedEvent {
    private String employeeId;
}
