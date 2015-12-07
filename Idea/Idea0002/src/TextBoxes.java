import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by alexa_000 on 03/12/2015.
 */
public class TextBoxes extends AnAction {
    public TextBoxes() {
        super("Text _Boxes");
    }

    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = (Project) anActionEvent.getData(PlatformDataKeys.PROJECT);
        String txt = Messages.showInputDialog(project, "What is your name?", "Input your name", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " + txt + "!\n I am glad to see you", "Information", Messages.getInformationIcon());
    }
}
