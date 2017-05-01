package org.neraquasar.domain;

import java.util.Set;

/**
 * Учётная запись.
 *
 * @author Konstantin Valer'evich Dichenko
 *         Created 01.05.2017
 */
public class Account {

    private Person person;

    private String username;

    private String password;

    private Set<Role> roles;
}
