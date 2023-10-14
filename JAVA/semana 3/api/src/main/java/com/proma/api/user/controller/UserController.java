package com.proma.api.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proma.api.user.businesslogic.UserBl;
import com.proma.api.user.da.UserRepository;
import com.proma.api.user.dto.UserDto;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserRepository userRep;

    /**
     * metodo que se encarga de retornar la lista de todos los usuarios
     * 
     * @return
     */
    @GetMapping
    public List<UserDto> userList() {
        UserBl _userBl = new UserBl(userRep);
        return _userBl.list();
    }

    /**
     * Meotodo que busque por id
     * 
     * @param user_id
     * @return
     */
    @GetMapping("/{id}")
    public UserDto userGet(@PathVariable Long id) {
        UserBl _userBl = new UserBl(userRep);
        return _userBl.get(id);
    }

    @PostMapping("/add")
    public UserDto add(@RequestBody UserDto user) {
        UserBl _userBl = new UserBl(userRep);
        return _userBl.add(user);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody UserDto user) {
        UserBl _userBl = new UserBl(userRep);
        var resultado = _userBl.login(user.getEmail(), user.getPassword());

        if (resultado != null) {
            return ResponseEntity.ok(resultado);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable Long id) {
        UserBl _userBl = new UserBl(userRep);
        _userBl.delete(id);
        return ResponseEntity.ok("Usuario eliminado con éxito");
    }

}
