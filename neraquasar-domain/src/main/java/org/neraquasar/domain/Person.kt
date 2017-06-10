package org.neraquasar.domain

import java.time.LocalDate

/**
 * Основные параметры личности. Не имеет интерейса, т.к. пока что рассчитан на гражданина РФ.

 * @author Konstantin Valer'evich Dichenko
 * *         Created 01.05.2017
 */
class Person {

    var firstName: String = "-"

    var surname: String = "-"

    var secondName: String? = null

    var dateOfBirth: LocalDate? = null

    var dateOfDeath: LocalDate? = null

    var gender: Gender = Gender.UNKNOWN
}
