package com.huynhcanh.borrowingservice.command.api.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class UpdateBookReturnCommand {
    @TargetAggregateIdentifier
    private String id;
    private String bookId;
    private String employee;
    private Date returnDate;
}
