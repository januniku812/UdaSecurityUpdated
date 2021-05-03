module com.udacity.security{
    requires java.desktop;
    requires com.google.gson;
    requires java.prefs;
    requires com.google.common;
    requires miglayout;
    requires com.udacity.image;
    opens com.udacity.security.data to com.google.gson;
}