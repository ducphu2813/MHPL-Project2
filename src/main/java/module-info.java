module com.main.project2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires static lombok;

    opens com.main.project2 to javafx.fxml;
    opens com.main.project2.DAL.model to org.hibernate.orm.core;
    exports com.main.project2;
    exports com.main.project2.DAL.model;
}