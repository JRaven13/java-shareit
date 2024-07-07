package ru.practicum.shareit.request;

import ru.practicum.shareit.request.dto.ItemRequestIncomeDto;
import ru.practicum.shareit.request.dto.ItemRequestOutcomeDto;

import java.util.Collection;


public interface RequestService {
    ItemRequestOutcomeDto create(long userId, ItemRequestIncomeDto itemRequestIncomeDto);

    Collection<ItemRequestOutcomeDto> findAllByUserId(long userId);

    Collection<ItemRequestOutcomeDto> findAll(long userId, int from, int size);

    ItemRequestOutcomeDto findRequest(long userId, long requestId);
}
