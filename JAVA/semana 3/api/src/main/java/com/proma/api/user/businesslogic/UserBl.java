package com.proma.api.user.businesslogic;

import java.util.List;
import com.proma.api.user.da.UserRepository;
import com.proma.api.user.dto.UserDto;

public class UserBl {

    /** Intancia de la clase repository */
    private UserRepository userRep;

    public UserBl(UserRepository userRep) {
        this.userRep = userRep;
    }

    /**
     * @apiNote Se encarga de obtener todos los registros de la tabla user.
     * @return
     */
    public List<UserDto> list() {
        return userRep.findAll();
    }

    /**
     * @apiNote Se encargar de buscar un usuario por el id y retornar un objeto
     *          UserDto
     * @param user_id
     * @return
     */
    public UserDto get(Long user_id) {
        return userRep.findById(user_id).orElse(null);
    }

    public UserDto login(String user, String pasword) {
        return userRep.findByEmailAndPassword(user, pasword).orElse(null);
    }

    /**
     * 
     * @param user
     * @return
     */
    public UserDto add(UserDto user) {
        return userRep.save(user);
    }
}
