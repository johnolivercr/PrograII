/** Paquete donde esta la clase */
package com.proma.api.user.dto;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "auth_user") // El nombre de la tabla exacto.
public class UserDto {

    /** Propiedas = columnas de la tabla */

    /**
     * Descripcion: Esta propiedad hace referencia a la columna user_id la propiedad
     * debe llamarse igual a la columna.
     * Se agregan las etiquetas GeneratedValue para que java entienda que esta
     * propiedad es de tipo identity y
     * la etiqueta Id para que conozca que esta propiedad hace referencia a la llave
     * primaria de la tabla.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int user_id;
    private String last_name;
    private String name;
    private String email;
    private Date birthdate;

    public int getUserId() {
        return user_id;
    }
   
    public String getLastName() {
        return last_name;
    }
    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
