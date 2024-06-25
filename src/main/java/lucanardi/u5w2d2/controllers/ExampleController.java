package lucanardi.u5w2d2.controllers;

import lucanardi.u5w2d2.entities.User;
import lucanardi.u5w2d2.entities.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class ExampleController {
    @Autowired
    private UserService usersService;

    @GetMapping
    private List<User> getAllUsers() {
        return this.usersService.getUsersList();
    }

    @PostMapping
    private User saveUser(@RequestBody User body) {
        return this.usersService.saveUser(body);
    }

/*    @PutMapping("/putexample")
    public String putMapping() {
        return "Ciao Rispondo alle richieste PUT";
    }

    @DeleteMapping("/delexample")
    public String deleteExample() {
        return "Ciao rispondo alle richieste DELETE";
    }

    @GetMapping("/parametro/{parametro}")
    public String pathParamExample(@PathVariable String parametro) {
        return "Il parametro selezionato è " + parametro;
    }

    @GetMapping("/queryParamEx")
    public String queryParamEx(@RequestParam String name, @RequestParam(required = false) String surname) {
        return "I parametri query sono " + name + " " + surname;
    }*/
}
