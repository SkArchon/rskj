package org.ethereum.rpc.doc.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * While we could have put this on the method parameters,
 * it actively made the method parameter
 */
@Retention(RetentionPolicy.SOURCE)
public @interface JsonRpcDocRequestParameter {

    /**
     * The name of the parameter as described in the method signature
     */
    String name();

    /**
     * In case there is a need to describe a different name in
     * the documentation, which is different from the method signature name
     */
    String alias() default "";

    /**
     * Default / When loadDescriptionFromFile is false - Description of the request parameter or
     * When loadDescriptionFromFile is true - the file path of the description
     */
    String description() default "";

    /**
     * Specify if the description should be loaded from a yaml
     */
    boolean loadDescriptionFromFile() default false;

    boolean attachModel() default false;

    boolean usePrimary() default false;

}
