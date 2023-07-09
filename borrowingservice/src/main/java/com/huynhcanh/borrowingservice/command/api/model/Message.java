package com.huynhcanh.borrowingservice.command.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Message {
    private String employeeId;
    private String message;
    @Override
    public String toString() {
        return "Message [employeeId=" + employeeId + ", message=" + message + "]";
    }
}
