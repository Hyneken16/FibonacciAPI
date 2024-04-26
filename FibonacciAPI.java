package org.example;

import com.google.gson.Gson;

import static spark.Spark.*;


public class FibonacciAPI {
    public static int[] fibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static int calculateTotal(int[] sequence) {
        int total = 0;
        for (int num : sequence) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        port(3000);

        Gson gson = new Gson();

        get("/api/v1/test/:memberCount", (req, res) -> {
            int memberCount = Integer.parseInt(req.params("memberCount"));
            int[] sequence = fibonacciSequence(memberCount);
            int total = calculateTotal(sequence);
            res.type("application/json");
            return gson.toJson(new ApiResponse(memberCount, sequence, total));
        });
    }
}
class ApiResponse {
    private int memberCount;
    private int[] sequence;
    private int total;

    public ApiResponse(int memberCount, int[] sequence, int total) {
        this.memberCount = memberCount;
        this.sequence = sequence;
        this.total = total;
    }
}
