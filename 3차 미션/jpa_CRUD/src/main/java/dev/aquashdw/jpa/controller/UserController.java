package dev.aquashdw.jpa.controller;

import dev.aquashdw.jpa.dto.UserDto;
import dev.aquashdw.jpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    public UserController(
            @Autowired UserService userService
    ){
        this.userService = userService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser( @RequestBody UserDto dto) {
        this.userService.createUser(dto);
    }

    @GetMapping("{id}")
    public UserDto readUser(@PathVariable("id") int id){
        return this.userService.readUser(id);
    }

    @GetMapping()
    public List<UserDto> readuserAll(){
        return this.userService.readUserAll();
    }

    @PutMapping("{id}")
    public void updateUser(@PathVariable("id") int id,
                           @RequestBody UserDto dto){
        this.userService.updateUser(id, dto);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") int id){
        this.userService.deleteUser(id);
    }





}
