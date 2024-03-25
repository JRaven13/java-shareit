package ru.practicum.shareit.item.service;

import ru.practicum.shareit.item.dto.ItemCreateDto;
import ru.practicum.shareit.item.dto.ItemUpdateDto;

import java.util.List;

public interface ItemService {
    ItemCreateDto create(long userId, ItemCreateDto itemCreateDto);

    ItemUpdateDto update(long userId, ItemUpdateDto itemUpdateDto, long itemId);

    ItemCreateDto findByItemId(long userId, long itemId);

    List<ItemCreateDto> findAllByUser(long userId);

    List<ItemCreateDto> searchItems(long userId, String text);
}
