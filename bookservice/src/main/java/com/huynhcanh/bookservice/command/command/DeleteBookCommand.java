package com.huynhcanh.bookservice.command.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@Setter
@AllArgsConstructor
public class DeleteBookCommand {
    @TargetAggregateIdentifier
    private String bookId;
}
