package co.com.ceiba.scala.anotacion;

@interface SourceURL {
    public String value();
    public String mail() default "";
}
