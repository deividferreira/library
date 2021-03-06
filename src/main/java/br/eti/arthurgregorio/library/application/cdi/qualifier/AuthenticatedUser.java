package br.eti.arthurgregorio.library.application.cdi.qualifier;

import br.eti.arthurgregorio.library.domain.entities.configuration.User;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Injection qualifier to mark the field to receive the current principal {@link User}
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 2.2.0, 25/09/2019
 */
@Qualifier
@Documented
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface AuthenticatedUser { }
