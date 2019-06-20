package com.melardev.spring.feign.controllers;

import com.melardev.spring.feign.api.TodoFeignClient;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/todos")
public class ProxyController {

    @Autowired
    private TodoFeignClient feignClient;

    @GetMapping
    public ResponseEntity<String> index(HttpServletRequest request) {
        return this.feignClient.index();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getById(@PathVariable("id") Long id) {
        try {
            return this.feignClient.getById(id);
        } catch (FeignException ex) {
            HttpStatus status = HttpStatus.resolve(ex.status());
            if (status == null)
                status = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<>(new String(ex.content()), status);
        }
    }

    @GetMapping("/pending")
    public ResponseEntity<String> getNotCompletedTodos() {
        return this.feignClient.getNotCompletedTodos();
    }

    @GetMapping("/completed")
    public ResponseEntity<String> getCompletedTodos() {
        return this.feignClient.getCompletedTodos();
    }

    @PostMapping
    public ResponseEntity<String> create(String todo) {
        return this.feignClient.create(todo);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> update(@PathVariable("id") Long id,
                                         @RequestBody String todoInput) {
        try {
            return this.feignClient.update(id, todoInput);
        } catch (FeignException ex) {
            HttpStatus status = HttpStatus.resolve(ex.status());
            if (status == null)
                status = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<>(new String(ex.content()), status);
        }
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        try {
            return this.feignClient.delete(id);
        } catch (FeignException ex) {
            HttpStatus status = HttpStatus.resolve(ex.status());
            if (status == null)
                status = HttpStatus.INTERNAL_SERVER_ERROR;
            return new ResponseEntity<>(new String(ex.content()), status);
        }
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() {
        this.feignClient.deleteAll();
    }

    @GetMapping(value = "/after/{date}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getByDateAfter(@PathVariable("date") @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
        return this.feignClient.getByDateAfter(date);
    }

    @GetMapping(value = "/before/{date}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getByDateBefore(@PathVariable("date") @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
        return this.feignClient.getByDateBefore(date);
    }

}
