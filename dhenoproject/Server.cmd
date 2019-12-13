cd C:\Users\User\Desktop\dhenoproject
set PATH_TO_FX="C:\Program Files\Java\javafx-sdk-12.0.2\lib"
javac --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml *.java
start rmiregistry
java -cp .;C:\Users\User\Desktop\mysql-connector-java-5.1.48\mysql-connector-java-5.1.48-bin.jar --module-path %PATH_TO_FX% --add-modules javafx.controls Server