package br.com.mma.services;

import br.com.mma.entities.Payment;
import br.com.mma.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(Long workerId, int days) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("id", workerId.toString());

        Worker worker = restTemplate.getForObject(workerHost+"/workers/{id}", Worker.class, parameters);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
