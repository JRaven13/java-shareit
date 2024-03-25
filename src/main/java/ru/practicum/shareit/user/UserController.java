package ru.practicum.shareit.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.shareit.user.dto.UserDto;
import ru.practicum.shareit.user.model.User;
import ru.practicum.shareit.user.service.UserService;

import java.util.Collection;

@RestController
@Slf4j
@RequestMapping(path = "/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserDto create(@Validated(BasicInfo.class) @RequestBody UserDto user) {
        log.info("Create user: {}", user);
        return userService.create(user);
    }

    @PatchMapping("/{userId}")
    public UserDto update(@PathVariable long userId, @RequestBody UserDto userDto) {
        log.info("Update user id: {}, user: {} ", userId, userDto);
        return userService.update(userId, userDto);
    }

    @GetMapping("/{userId}")
    public User findById(@PathVariable long userId) {
        log.info("Find user: {}", userId);
        return userService.findById(userId);
    }

    @GetMapping
    public Collection<User> findAll() {
        log.info("Find all users");
        return userService.findAll();
    }

    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable long userId) {
        log.info("Delete user {}", userId);
        userService.deleteById(userId);
    }

}
