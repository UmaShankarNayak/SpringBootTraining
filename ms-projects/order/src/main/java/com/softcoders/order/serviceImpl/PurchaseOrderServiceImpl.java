package com.softcoders.order.serviceImpl;

import com.softcoders.order.dtos.PurchaseOrderRequestDto;
import com.softcoders.order.dtos.PurchaseOrderResponseDto;
import com.softcoders.order.service.PurchaseOrderService;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Override
    public PurchaseOrderResponseDto processOrder(PurchaseOrderRequestDto purchaseOrderRequestDto) {

        // before process the order communicate to product service

        // after getting response from product service communication to the user service for product-amount validation

        // if all ok then process the order request.

        return null;
    }
}
