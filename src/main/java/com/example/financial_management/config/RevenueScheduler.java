package com.example.financial_management.config;

import com.example.financial_management.models.User;
import com.example.financial_management.service.RevenueService;
import com.example.financial_management.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RevenueScheduler {

    @Autowired
    private RevenueService revenueService;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    // Thêm doanh thu vào đầu tháng
    @Scheduled(cron = "0 0 0 1 * ?") // Chạy vào 00:00:00 ngày 1 mỗi tháng
    public void addMonthly1Revenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 2 * ?") // Chạy vào 00:00:00 ngày 2 mỗi tháng
    public void addMonthly2Revenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 3 * ?") // Chạy vào 00:00:00 ngày 3 mỗi tháng
    public void addMonthly3FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 4 * ?") // Chạy vào 00:00:00 ngày 4 mỗi tháng
    public void addMonthly4FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 5 * ?") // Chạy vào 00:00:00 ngày 5 mỗi tháng
    public void addMonthly5FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 6 * ?") // Chạy vào 00:00:00 ngày 6 mỗi tháng
    public void addMonthly6FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 7 * ?") // Chạy vào 00:00:00 ngày 7 mỗi tháng
    public void addMonthly7FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 8 * ?") // Chạy vào 00:00:00 ngày 8 mỗi tháng
    public void addMonthly8FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }

    @Scheduled(cron = "0 0 0 9 * ?") // Chạy vào 00:00:00 ngày 9 mỗi tháng
    public void addMonthly9FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 10 * ?") // Chạy vào 00:00:00 ngày 10 mỗi tháng
    public void addMonthly10FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 11 * ?") // Chạy vào 00:00:00 ngày 11 mỗi tháng
    public void addMonthly11FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 12 * ?") // Chạy vào 00:00:00 ngày 12 mỗi tháng
    public void addMonthly12FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 13 * ?") // Chạy vào 00:00:00 ngày 13 mỗi tháng
    public void addMonthly13FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 14 * ?") // Chạy vào 00:00:00 ngày 14 mỗi tháng
    public void addMonthly14FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 15 * ?") // Chạy vào 00:00:00 ngày 15 mỗi tháng
    public void addMonthly15FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 16 * ?") // Chạy vào 00:00:00 ngày 16 mỗi tháng
    public void addMonthly16FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 17 * ?") // Chạy vào 00:00:00 ngày 17 mỗi tháng
    public void addMonthly17FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 18 * ?") // Chạy vào 00:00:00 ngày 18 mỗi tháng
    public void addMonthly18FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 19 * ?") // Chạy vào 00:00:00 ngày 19 mỗi tháng
    public void addMonthly19FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 20 * ?") // Chạy vào 00:00:00 ngày 20 mỗi tháng
    public void addMonthly20FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 21 * ?") // Chạy vào 00:00:00 ngày 21 mỗi tháng
    public void addMonthly21FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 22 * ?") // Chạy vào 00:00:00 ngày 22 mỗi tháng
    public void addMonthly22FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 23 * ?") // Chạy vào 00:00:00 ngày 23 mỗi tháng
    public void addMonthly23FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 24 * ?") // Chạy vào 00:00:00 ngày 24 mỗi tháng
    public void addMonthly24FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 25 * ?") // Chạy vào 00:00:00 ngày 25 mỗi tháng
    public void addMonthly25FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 26 * ?") // Chạy vào 00:00:00 ngày 26 mỗi tháng
    public void addMonthly26FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 27 * ?") // Chạy vào 00:00:00 ngày 27 mỗi tháng
    public void addMonthly27FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    @Scheduled(cron = "0 0 0 28 * ?") // Chạy vào 00:00:00 ngày 28 mỗi tháng
    public void addMonthly28FebRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
    // Cập nhật tổng doanh thu tháng vào cuối tháng
    @Scheduled(cron = "0 0 0 L * ?") // Chạy vào 00:00:00 ngày cuối cùng của mỗi tháng
    public void updateMonthlyRevenue() {
        User principal = userDetailsService.getLoggedInUser().get();
        revenueService.addMonthlyRevenue(principal);
    }
}
