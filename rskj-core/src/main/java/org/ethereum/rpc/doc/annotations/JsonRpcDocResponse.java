package org.ethereum.rpc.doc.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * While we could have put this on the method parameters,
 * it actively made the method parameter
 */
@Retention(RetentionPolicy.SOURCE)
public @interface JsonRpcDocResponse {

    String description() default "";

    boolean loadDescriptionFromFile() default false;

    String code() default "";

    String examplePath() default "";

    boolean attachModel() default false;

    boolean success() default true;

}
