import com.fun.gantt.gantt.GanttFactory;
import com.fun.gantt.gantt.Project;

public class GanttTest {
	
	public static void main(String[] args) {
		GanttFactory factory = GanttFactory.eINSTANCE;
		
		Project project = factory.createProject();
		project.setDuration(100);
	}

}
