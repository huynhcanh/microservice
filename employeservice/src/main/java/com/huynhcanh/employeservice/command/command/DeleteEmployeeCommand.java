package com.huynhcanh.employeservice.command.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@Setter
@AllArgsConstructor
public class DeleteEmployeeCommand {
    @TargetAggregateIdentifier
    private String employeeId;
}
