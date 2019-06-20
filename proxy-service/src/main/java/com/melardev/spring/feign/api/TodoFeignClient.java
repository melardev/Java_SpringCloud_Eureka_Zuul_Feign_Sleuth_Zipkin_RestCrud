package com.melardev.spring.feign.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@FeignClient(name = "todo-service", path = "/", decode404 = true)
public interface TodoFeignClient {

    @GetMapping
    ResponseEntity<String> index();

    @GetMapping("{id}")
    ResponseEntity<String> getById(@PathVariable("id") Long id);

    @GetMapping("/pending")
    ResponseEntity<String> getNotCompletedTodos();

    @GetMapping("/completed")
    ResponseEntity<String> getCompletedTodos();

    @PostMapping
    ResponseEntity<String> create(@Valid @RequestBody String todo);

    @PutMapping("/{id}")
    ResponseEntity<String> update(@PathVariable("id") Long id,
                                  @RequestBody String todoInput);

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable("id") Long id);

    @DeleteMapping
    ResponseEntity<String> deleteAll();

    @GetMapping(value = "/after/{date}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> getByDateAfter(@PathVariable("date") @DateTimeFormat(pattern = "dd-MM-yyyy") Date date);

    @GetMapping(value = "/before/{date}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> getByDateBefore(@PathVariable("date") @DateTimeFormat(pattern = "dd-MM-yyyy") Date date);

}
