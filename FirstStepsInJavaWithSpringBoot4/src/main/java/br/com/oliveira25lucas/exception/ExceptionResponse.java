package br.com.oliveira25lucas.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
