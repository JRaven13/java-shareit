package ru.practicum.shareit.item.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.shareit.item.dto.valiadateGroup.Create;
import ru.practicum.shareit.item.dto.valiadateGroup.Update;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemRequestDto {
    @NotBlank(groups = Create.class)
    @Size(max = 255)
    private String name;
    @NotBlank(groups = Create.class)
    @Size(max = 512, groups = {Create.class, Update.class})
    private String description;
    @NotNull(groups = Create.class)
    private Boolean available;
    private Long requestId;
}
