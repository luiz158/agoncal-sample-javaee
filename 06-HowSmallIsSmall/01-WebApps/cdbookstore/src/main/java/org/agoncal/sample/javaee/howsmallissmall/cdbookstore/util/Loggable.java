package org.agoncal.sample.javaee.howsmallissmall.cdbookstore.util;

import java.lang.annotation.*;

import javax.interceptor.InterceptorBinding;

@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
@Documented
public @interface Loggable
{
}