package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.datamodel.TodoData;
import sample.datamodel.TodoItem;

import java.time.LocalDate;

public class DialogController {
    @FXML
    public TextField shortDescriptionArea;
    @FXML
    public TextArea detailsArea;
    @FXML
    public DatePicker datePicker;

    public TodoItem processResult(){
        String shortDescription = shortDescriptionArea.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = datePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription,details,deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
