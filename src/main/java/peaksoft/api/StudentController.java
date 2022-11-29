package peaksoft.api;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @GetMapping("/")
    public String getStudent() {
        return "/mainPage";
    }

    @GetMapping("/instructor-info")
    public String getInstructor() {
        return "/instructor-info";
    }

    @GetMapping("/manager-info")
    public String getManager() {
        return "/manager-info";
    }

    @GetMapping("/student-info")
    public String getStudent1() {
        return "/student-info";
    }
}
