package com.denm.namespace.configuration;

import com.denm.namespace.service.ApprovalNotificationService;
import com.denm.namespace.service.RejectionNotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DelegatesConfiguration {
    @Bean
    public ApprovalNotificationService approvalNotificationService() {
        return new ApprovalNotificationService();
    }

    @Bean
    public RejectionNotificationService rejectionNotificationService() {
        return new RejectionNotificationService();
    }
}
