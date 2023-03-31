package com.denm.namespace.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RejectionNotificationService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Your request is REJECTED !!!");
    }
}
