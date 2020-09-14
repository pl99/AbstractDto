package ru.advantum.common.abstraction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AdvFieldMetaData  {
    int order() default 1000;
    enum VisibleType {
        /** Скрытое поле */
        HIDE,
        /** Только в свойствах(детализации) */
        PROPS,
        /** Только в таблице */
        GRID,
        /** Везде */
        ALL
    }
    VisibleType visible() default VisibleType.ALL;

    String editor () default "field";
    String title() default "";

    boolean required() default false;
    boolean disabled() default false;

    // style props
    /** Ширина колонки в пикселях(по умолчанию 100px) */
    int weight() default 100;
    /** Колонка закрепляется слева */
    boolean fixed() default false;
    boolean isResizable() default false;


}
