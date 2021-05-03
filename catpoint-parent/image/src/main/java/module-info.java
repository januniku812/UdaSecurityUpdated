module com.udacity.image{
    exports com.udacity.image to com.udacity.security;
    requires java.desktop;
    requires java.prefs;
    requires software.amazon.awssdk.services.rekognition;
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.regions;
    requires software.amazon.awssdk.auth;
    requires org.slf4j;
}