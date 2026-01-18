package com.w2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {
    
    @Test
    public void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        
        // Test case 1
        List<Double> scores1 = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        int result1 = analyzer.countExcellentStudents(scores1);
        System.out.println("=== Test countExcellentStudents ===");
        System.out.println("Input: " + scores1);
        System.out.println("Expected: 2, Actual: " + result1);
        assertEquals(2, result1);
        
        // Test case 2: Mảng rỗng
        List<Double> scores2 = Collections.emptyList();
        int result2 = analyzer.countExcellentStudents(scores2);
        System.out.println("Input: " + scores2);
        System.out.println("Expected: 0, Actual: " + result2);
        assertEquals(0, result2);
        
        System.out.println("All tests passed!\n");
    }
    
    @Test
    public void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Test case 1
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        double result = analyzer.calculateValidAverage(scores);
        
        System.out.println("=== Test calculateValidAverage ===");
        System.out.println("Input: " + scores);
        System.out.println("Valid scores: [9.0, 8.5, 7.0]");
        System.out.println("Expected: 8.17, Actual: " + result);
        assertEquals(8.17, result, 0.01);
        
        System.out.println("Test passed!\n");
    }
}