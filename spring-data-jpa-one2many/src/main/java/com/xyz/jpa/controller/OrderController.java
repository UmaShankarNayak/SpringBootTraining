package com.xyz.jpa.controller;

import com.xyz.jpa.dto.OrderRequest;
import com.xyz.jpa.dto.OrderResponse;
import com.xyz.jpa.entity.Customer;
import com.xyz.jpa.repository.CustomerRepository;
import com.xyz.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xyz.jpa.utils.OrderConstantField.ORDER_API;

@RestController
@RequestMapping(ORDER_API)
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
       return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}
