package org.neraquasar.domain

/**
 * Учётная запись.
 *
 * @author Konstantin Valer'evich Dichenko
 * Created 01.05.2017
 */
data class Account(val person: Person,
                   var username: String,
                   var password: String = "",
                   val roles: Set<Role> = HashSet<Role>())
