package ru.step.smartcontrol.template.execution.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@FeignClient(name = "${bookFeignClient}", url = "${bookFeignClient.url}")
public interface BookFeignClient {

    @PostMapping
    Object createObject(
            @RequestHeader("keycloakId") String keycloakId,
            @RequestBody Object object);

    @GetMapping(value = "/{id}")
    ResponseEntity<Optional<Object>> getById(@PathVariable("id") Long id);
    @GetMapping
    List<Object> getAllBooks();

}
