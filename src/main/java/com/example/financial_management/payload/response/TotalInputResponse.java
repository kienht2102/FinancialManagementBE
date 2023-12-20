package com.example.financial_management.payload.response;

import com.example.financial_management.models.Input;

import java.util.List;

public class TotalInputResponse {
   long TotalInput;
   List<Input> arrInput;

    public TotalInputResponse(long totalInput, List<Input> arrInput) {
        TotalInput = totalInput;
        this.arrInput = arrInput;
    }

    public TotalInputResponse() {
    }

    public long getTotalInput() {
        return TotalInput;
    }

    public void setTotalInput(long totalInput) {
        TotalInput = totalInput;
    }

    public List<Input> getArrInput() {
        return arrInput;
    }

    public void setArrInput(List<Input> arrInput) {
        this.arrInput = arrInput;
    }
}