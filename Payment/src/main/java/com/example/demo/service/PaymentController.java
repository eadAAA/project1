package com.example.demo.service;

import com.example.demo.dao.PaymentDao;
import com.example.demo.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentDao paymentDao;

    @PostMapping(value = "/payment")
    public ResponseEntity<Payment> Pay(@RequestBody Payment payment){
        Payment paymentExist = paymentDao.findByIdCommand(payment.getIdCommand());
        if (paymentExist != null) throw new PaymentExistException("This order has already been paid");
        Payment newPayment = paymentDao.save(payment);

        return new ResponseEntity<Payment>(newPayment, HttpStatus.CREATED);
    }

}
