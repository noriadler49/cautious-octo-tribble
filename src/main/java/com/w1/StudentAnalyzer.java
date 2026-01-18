package com.w1;

import java.util.List;

public class StudentAnalyzer {
    public int countExcellentStudents(List<Double> scores) {
        // Nếu điểm không hợp lệ hoặc rỗng, trả về 0
        if (scores == null || scores.isEmpty()) {
            return 0;
        }
        
        // Đếm số sinh viên có điểm >= 8.0 và trong khoảng hợp lệ [0, 10]
        int count = 0;
        for (Double score : scores) {
            if (score == null) {
                continue;
            }
            if (score >= 0 && score <= 10) {
                if (score >= 8.0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double calculateValidAverage(List<Double> scores) {
        // Nếu điểm không hợp lệ hoặc rỗng, trả về 0.0
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }
        
        // Tính trung bình chỉ với các điểm hợp lệ trong khoảng [0, 10]
        double sum = 0.0;
        int validCount = 0;
        
        for (Double score : scores) {
            if (score == null) {
                continue;
            }
            if (score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }

        // Nếu không có điểm hợp lệ, trả về 0.0
        if (validCount == 0) {
            return 0.0;
        }
        
        // Trả về trung bình
        return sum / validCount;
    }
}