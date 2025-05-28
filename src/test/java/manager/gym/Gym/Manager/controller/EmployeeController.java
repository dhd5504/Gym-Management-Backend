//package manager.gym.Gym.Manager.controller;
//
//import manager.gym.Gym.Manager.entity.staff.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
////@RequestMapping("/api/v1/employee")
//public class EmployeeController {
//    @Autowired
//    private EmployeeService employeeService;
//    @GetMapping("/getAllEmployees")
//    public ResponseEntity<List<Employee>> getAllEmployees(){
//        return new ResponseEntity<List<Employee>>(employeeService.getAll(), HttpStatus.OK);
//    }
//    @GetMapping("/")
//    public ResponseEntity<String> index(){
//        return new ResponseEntity<String>(employeeService.index(),HttpStatus.OK);
//    }
//}
