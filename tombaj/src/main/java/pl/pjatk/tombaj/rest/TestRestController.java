package pl.pjatk.tombaj.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.tombaj.model.Car;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> model(){
        Car car = new Car();
        return ResponseEntity.ok(car);
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> getId(@PathVariable String name){
        return ResponseEntity.ok(name);
    }

    @GetMapping("/hello/param")
    public ResponseEntity<String> getParam(@RequestParam String reqParam){
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> posting(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

}
