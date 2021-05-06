package pl.pjatk.tombaj.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/homework")
public class Homework4RestController {

    @GetMapping("/path/{someValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/param/value")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PutMapping("/path/{someValue}")
    public ResponseEntity<String> putPathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PutMapping("/request")
    public ResponseEntity<String> putRequestBody(@RequestBody String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PostMapping("/request")
    public ResponseEntity<String> postRequestBody(@RequestBody String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @DeleteMapping("/path/{someValue}")
    public ResponseEntity<HttpStatus> delPathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok().build();
    }
}