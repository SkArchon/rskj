package org.ethereum.rpc.doc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface JsonRpcDocModelType {

    String documentationType() default "";
    String[] processClassNames() default {};

}
