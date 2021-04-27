package com.example.Practice22.models;

import com.example.Practice22.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.management.NotCompliantMBeanException;
import javax.management.StandardMBean;

@Component
public class MethodInvoker extends StandardMBean implements InvokeMBean{

    @Autowired
    private SchedulerService service;

    public MethodInvoker() throws NotCompliantMBeanException {
        super(InvokeMBean.class);
    }

    @Override
    public void invoke(){
        service.doScheduledTask();
    }

}
