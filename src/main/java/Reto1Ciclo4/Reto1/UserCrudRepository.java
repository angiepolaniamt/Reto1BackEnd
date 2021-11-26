/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto1Ciclo4.Reto1;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author angie
 */
public interface UserCrudRepository extends CrudRepository <User,Integer> {
    Optional<User>findByEmail(String email);
    Optional<User>findByEmailAndPassword(String email,String password);
}
