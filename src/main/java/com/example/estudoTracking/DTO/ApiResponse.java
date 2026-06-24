package com.example.estudoTracking.DTO;

import java.time.LocalDateTime;

public record ApiResponse<T>(

        int status,
        String message,
        T data,
        LocalDateTime timestamp

) {

    public static <T> ApiResponse<T> succsess(int status, String message, T data, LocalDateTime timestamp) {

        return new ApiResponse<>(status, message, data, LocalDateTime.now());

    }

    public static <T> ApiResponse<T> error(int status, String message, T data, LocalDateTime timestamp) {

        return new ApiResponse<>(status, message, null, LocalDateTime.now());

    }

}
