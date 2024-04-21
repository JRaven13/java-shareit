package ru.practicum.shareit.exceptions;

public class EntityAccessDeniedException extends RuntimeException {
    public EntityAccessDeniedException(String s) {
        super(s);
    }
}