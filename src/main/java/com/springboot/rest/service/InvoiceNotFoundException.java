package com.springboot.rest.service;

public class InvoiceNotFoundException extends RuntimeException {

    public InvoiceNotFoundException(String exception) {
        super(exception);
    }
}
