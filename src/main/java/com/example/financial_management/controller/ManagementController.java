package com.example.financial_management.controller;

import com.example.financial_management.models.*;
import com.example.financial_management.payload.request.InputRequest;
import com.example.financial_management.payload.request.OutputRequest;
import com.example.financial_management.payload.response.TotalInputResponse;
import com.example.financial_management.payload.response.TotalOutputResponse;
import com.example.financial_management.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/management")
public class ManagementController {
    @Autowired
    ExpenseServiceImpl expenseService;
    @Autowired
    InputServiceImpl inputService;
    @Autowired
    OutputServiceImpl outputService;
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Autowired
    ExpenseCategoriesServiceImpl expenseCategoriesService;
    @Autowired
    RevenueServiceImpl revenueService;

    @GetMapping("/test")
    public String test() {
        return "success !";
    }

    @PostMapping("/input")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public Input inputExpense(@RequestBody InputRequest inputRequest) {
        Expense expense = expenseService.findByLoggedInUser();
        long totalAmount = expense.getTotalAmount();
        totalAmount += inputRequest.getMoney();
        expense.setTotalAmount(totalAmount);
        expenseService.save(expense);
        User principal = userDetailsService.getLoggedInUser().get();
        Input input = new Input(inputRequest.getTitle(), inputRequest.getMoney(), new Date(), principal);
        return inputService.save(input);
    }

    @PostMapping("/output")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public Output output(@RequestBody OutputRequest outputRequest) {
        Expense expense = expenseService.findByLoggedInUser();
        long totalAmount = expense.getTotalAmount();
        totalAmount -= outputRequest.getMoney();
        expense.setTotalAmount(totalAmount);
        expenseService.save(expense);
        User principal = userDetailsService.getLoggedInUser().get();
        Output output = new Output(outputRequest.getTitle(), outputRequest.getMoney(), new Date(), principal, outputRequest.getExpenseType());
        return outputService.save(output);
    }

    @GetMapping("/all/input")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public List<Input> allInput() {
        User principal = userDetailsService.getLoggedInUser().get();
        return inputService.findByUser(principal);
    }

    @GetMapping("/all/output")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public List<Output> allOutput() {
        User principal = userDetailsService.getLoggedInUser().get();
        return outputService.findByUser(principal);
    }

    @GetMapping("/all/category")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public List<ExpenseCategories> getAllCategories() {
        return expenseCategoriesService.getAll();
    }

    @GetMapping("/total-input-this-month")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public TotalInputResponse getTotalInputThisMonth() {
        User principal = userDetailsService.getLoggedInUser().get();
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        List<Input> inputsThisMonth = inputService.findByUserAndMonth(principal, currentMonth);
        long totalInput = inputsThisMonth.stream().mapToLong(Input::getMoney).sum();
        return new TotalInputResponse(totalInput, inputsThisMonth);
    }

    @GetMapping("/total-output-this-month")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public TotalOutputResponse getTotalOutputThisMonth() {
        User principal = userDetailsService.getLoggedInUser().get();
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        List<Output> outputsThisMonth = outputService.findByUserAndMonth(principal, currentMonth);
        long totalOutput = outputsThisMonth.stream().mapToLong(Output::getMoney).sum();
        return new TotalOutputResponse(totalOutput, outputsThisMonth);
    }

    @GetMapping("/expense-user")
    @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public Expense ExpenseInUser() {
        return expenseService.findByLoggedInUser();
    }
   @GetMapping("/revenue-user")
   @PreAuthorize("hasAnyRole('USER') or hasAnyRole('MODERATOR') or hasAnyRole('ADMIN')")
    public List<Revenue> getYearlyRevenues(){
       User principal = userDetailsService.getLoggedInUser().get();
       return revenueService.getYearlyRevenues(principal);
   }
}