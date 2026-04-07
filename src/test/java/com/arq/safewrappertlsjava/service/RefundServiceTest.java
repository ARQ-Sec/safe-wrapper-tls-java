package com.arq.safewrappertlsjava.service;

import com.arq.safewrappertlsjava.repository.RefundRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RefundServiceTest {
    @Test
    void returnsSeedData() {
        RefundService service = new RefundService(new RefundRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
