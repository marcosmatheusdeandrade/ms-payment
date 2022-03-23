package br.com.mma.services;

import br.com.mma.entities.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Bob", BigDecimal.TEN, days);
    }
}
