package bitcamp.util;

import java.lang.annotation.Retention;

@Retention((Retention))
public @interface Transactional {
    String value() default "tx1";
}
