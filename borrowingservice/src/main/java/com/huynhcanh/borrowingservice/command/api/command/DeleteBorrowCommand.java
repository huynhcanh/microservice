package com.huynhcanh.borrowingservice.command.api.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Setter
@Getter
@AllArgsConstructor
public class DeleteBorrowCommand {
    @TargetAggregateIdentifier
    private String id;
}
