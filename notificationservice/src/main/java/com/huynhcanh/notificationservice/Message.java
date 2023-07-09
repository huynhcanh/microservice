package com.huynhcanh.notificationservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String employeeId;
    private String message;

    @Override
    public String toString() {
        return "Message [employeeId=" + employeeId + ", message=" + message + "]";
    }
}
