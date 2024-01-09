package ru.step.smartcontrol.template.execution.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.step.smartcontrol.template.execution.service.client.BookFeignClient;
import ru.step.smartcontrol.template.execution.service.client.TemplateFeignClient;
import ru.step.smartcontrol.template.execution.service.service.FeignInterface;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/template-feign")
public class TemplateFeignController {

    private final TemplateFeignClient templateFeignClient;
    private final FeignInterface feignInterface;
    private final BookFeignClient bookFeignClient;

    @GetMapping(value = "/{templateId}/template-elements")
    public Object getAllTemplateElementsByTemplateId(
            @RequestHeader("keycloakId") String keycloakId,
            @PathVariable("templateId") Long templateId) {

        return templateFeignClient.getAllTemplateElementsByTemplateId(keycloakId, templateId);
    }

    @GetMapping(value = "/{id}")
    public Object getObject(@PathVariable("id") Long id) {
        return bookFeignClient.getById(id);
    }

    @GetMapping
    public List<Object> getObject() {
        return bookFeignClient.getAllBooks();
    }
}
