package com.huynhcanh.employeservice.query.controller;

import com.huynhcanh.employeservice.EmployeeserviceApplication;
import com.huynhcanh.employeservice.query.model.EmployeeReponseModel;
import com.huynhcanh.employeservice.query.queries.GetAllEmployeeQuery;
import com.huynhcanh.employeservice.query.queries.GetEmployeesQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeQueryController {

    private Logger logger =org.slf4j.LoggerFactory.getLogger(EmployeeserviceApplication.class);

    @Autowired
    private QueryGateway queryGateway;

    @GetMapping("/{employeeId}")
    public EmployeeReponseModel getEmployeeDetail(@PathVariable String employeeId) {
        GetEmployeesQuery getEmployeesQuery = new GetEmployeesQuery();
        getEmployeesQuery.setEmployeeId(employeeId);

        EmployeeReponseModel employeeReponseModel =
                queryGateway.query(getEmployeesQuery,
                        ResponseTypes.instanceOf(EmployeeReponseModel.class))
                        .join();

        return employeeReponseModel;
    }

    @GetMapping
    public List<EmployeeReponseModel> getAllEmployee(){
        List<EmployeeReponseModel> list = queryGateway.query(new GetAllEmployeeQuery(), ResponseTypes.multipleInstancesOf(EmployeeReponseModel.class))
                .join();
        logger.info("Danh Sach Nhan Vien: "+list.toString());
        return list;
    }
}
