package com.huynhcanh.employeservice.command.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@Setter
@AllArgsConstructor
public class UpdateEmployeeCommand {
    @TargetAggregateIdentifier
    private String employeeId;
    private String firstName;
    private String lastName;
    private String kin;
    private Boolean isDisciplined;
}
