javac -d ./bin/ -cp "./src/:/usr/share/openjfx/lib/*" ./src/*.java &&
java -cp "./bin/" --module-path /usr/share/openjfx/lib --add-modules=javafx.controls,javafx.fxml,javafx.base,javafx.media,javafx.web,javafx.swing src.GUI
