package com.hfi.web01.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName AnalysisActuator
 * @Auther VCC
 * @Date 2019/3/23 22:34
 * @Description
 * @Version
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnalysisActuator {
    String note() default "";
}
