package chapter13;

public @interface Music {
    String[] genres() default {"samir"};
    String[] value();
}
