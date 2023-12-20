package com.example.financial_management.payload.response;

import com.example.financial_management.models.Output;

import java.util.List;

public class TotalOutputResponse {
    long TotalOutput;
    List<Output> arrOutput;

    public TotalOutputResponse(long totalOutput, List<Output> arrOutput) {
        TotalOutput = totalOutput;
        this.arrOutput = arrOutput;
    }

    public TotalOutputResponse() {
    }

    public long getTotalOutput() {
        return TotalOutput;
    }

    public void setTotalOutput(long totalOutput) {
        TotalOutput = totalOutput;
    }

    public List<Output> getArrOutput() {
        return arrOutput;
    }

    public void setArrOutput(List<Output> arrOutput) {
        this.arrOutput = arrOutput;
    }
}