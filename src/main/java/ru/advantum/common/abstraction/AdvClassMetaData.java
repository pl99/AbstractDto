package ru.advantum.common.abstraction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AdvClassMetaData {
    enum Format {ALL, PROPSONLY, GRIDONLY}
    float version(); // номер версии
    String author() default  "Author"; // автор
    boolean readOnly() default false;
    Format format() default Format.ALL;

}


