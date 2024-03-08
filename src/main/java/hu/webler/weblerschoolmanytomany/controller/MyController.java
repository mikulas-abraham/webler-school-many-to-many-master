package hu.webler.weblerschoolmanytomany.controller;

import hu.webler.weblerschoolmanytomany.entity.Course;
import hu.webler.weblerschoolmanytomany.entity.School;
import hu.webler.weblerschoolmanytomany.entity.Student;
import hu.webler.weblerschoolmanytomany.entity.Teacher;
import hu.webler.weblerschoolmanytomany.service.CourseService;
import hu.webler.weblerschoolmanytomany.service.SchoolService;
import hu.webler.weblerschoolmanytomany.service.StudentService;
import hu.webler.weblerschoolmanytomany.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    private final CourseService courseService;
    private final SchoolService schoolService;
    private final StudentService studentService;
    private final TeacherService teacherService;

    public MyController(CourseService courseService, SchoolService schoolService,
                        StudentService studentService, TeacherService teacherService) {

        this.courseService = courseService;
        this.schoolService = schoolService;
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @GetMapping("/courses")
    public List<Course>getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/course")
    public void createCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @PutMapping("/update-course")
    public void updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
    }

    @PostMapping("/del-course")
    public String deleteCourse(@RequestBody Course course_id) {
            courseService.deleteCourse(course_id);
            return "Course with ID: " + course_id.getId() + " was deleted.";
    }

    //School
    @GetMapping("/school")
    public List<School> getSchool() {
        return schoolService.getSchool();
    }

    @PostMapping("/school")
    public void addSchool(@RequestBody  School school) {
        schoolService.addSchool(school);
    }

    @PutMapping("/update-school")
    public void updateSchool(@RequestBody  School school) {
        schoolService.updateSchool(school);
    }

    @PostMapping("/delete-school")
    public void deleteSchool(@RequestBody  School school_id) {
        schoolService.deleteSchool(school_id);
    }

    //Student
    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("/update-student")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @PostMapping("/delete-student")
    public void deleteStudent(@RequestBody Student student_id) {
        studentService.deleteStudent(student_id);
    }

    //Teacher
    @GetMapping("/teacher")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @PostMapping("/teacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    @PutMapping("/update-teacher")
    public void updateTeacher(@RequestBody Teacher teacher) {
        teacherService.updateTeacher(teacher);
    }

    @PostMapping("/delete-teacher")
    public void deleteTeacher(@RequestBody Teacher teacher_id) {
        teacherService.deleteTeacher(teacher_id);
    }
}
